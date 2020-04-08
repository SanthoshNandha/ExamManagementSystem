package service.restful;



import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import database.operations.TestOperations;
import entity.Result;
import entity.Test;

@RestController
public class StudentAnswerController {
	/*@RequestMapping(value = "/addNewStudentAnswer", method = RequestMethod.POST)	
	public  @ResponseBody Result addStudentAnswer( @RequestBody StudentAnswer studentAnswer )   {	
		 StudentAnswerApplication studentAnswerApplication = new StudentAnswerApplication();
		 return studentAnswerApplication.addStudentAnswer(studentAnswer);
	}*/
	
	@RequestMapping(value = "/submitAnswers", method = RequestMethod.POST)	
	public  @ResponseBody Result submitStudentAnswer( @RequestBody Test test)   {
		TestOperations testOperations = new TestOperations();
		//return new Result();
		 return testOperations.evaluateAndSaveTest(test);
	}
	
}
