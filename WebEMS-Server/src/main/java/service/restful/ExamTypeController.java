package service.restful;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import application.operations.ExamTypeApplication;
import database.operations.ExamOperations;
import entity.ExamType;
import entity.Result;

@RestController
public class ExamTypeController {
	@RequestMapping(value = "/addNewExamType", method = RequestMethod.POST)	
	public  @ResponseBody Result addExamType( @RequestBody ExamType examType )   {	
		 ExamTypeApplication examTypeApplication = new ExamTypeApplication();
		 return examTypeApplication.addExamType(examType);
	}
	@RequestMapping(value = "/getAllExamTypes", method = RequestMethod.GET)
	public @ResponseBody ArrayList<ExamType> getAllExamTypes(){
		ExamOperations examOperations = new ExamOperations();
		return examOperations.retrieveExamTypes();
	}

}
