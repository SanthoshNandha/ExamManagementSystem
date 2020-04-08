package service.restful;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import application.operations.SemApplication;
import entity.Result;
import entity.Sem;

public class SemController {
	@RequestMapping(value = "/addNewSem", method = RequestMethod.POST)	
	public  @ResponseBody Result addSem( @RequestBody Sem sem )   {	
		 SemApplication semApplication = new SemApplication();
		 return semApplication.addSem(sem);
	}
}
