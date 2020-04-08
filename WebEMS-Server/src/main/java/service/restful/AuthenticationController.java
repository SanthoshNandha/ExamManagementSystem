package service.restful;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import application.operations.AuthenticateApplication;
import entity.Authentication;
import entity.Result;

@RestController
public class AuthenticationController {
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public @ResponseBody Result authenticateService
    (@RequestBody Authentication authentication) {
		System.out.println("inside authentication function");
		AuthenticateApplication authenticate = new AuthenticateApplication();		
        return authenticate.doAuthenticate(authentication);
    }

}
