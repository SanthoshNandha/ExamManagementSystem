package service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import application.Authenticate;
import entity.Authentication;

@Controller
@RequestMapping("/authenticate")
public class AuthenticationController {
	
	@RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Authentication authenticateService
    (@RequestParam(value="userName", required=false) String userName, @RequestParam(value="password", required=false) String Password) {
		Authenticate authenticate = new Authenticate();		
        return authenticate.doAuthenticate(userName, Password);
    }

}
