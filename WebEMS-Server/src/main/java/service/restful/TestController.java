package service.restful;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import application.operations.TestApplication;
import database.operations.TestOperations;
import entity.Result;
import entity.Test;

public class TestController {
	@RequestMapping(value = "/addNewTest", method = RequestMethod.POST)	
	public  @ResponseBody Result addTest( @RequestBody Test test )   {	
		 TestApplication testApplication = new TestApplication();
		 return testApplication.addTest(test);
	}
	@RequestMapping(value = "/deleteTest", method = RequestMethod.GET)	
	public  @ResponseBody Result deleteTest( @RequestParam(value="testId", required=false) String testId )   {
		TestOperations testOperations = new TestOperations();
		return testOperations.removeTest(testId);
	}

}
