package service.restful;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import application.operations.ExaminationApplication;
import database.operations.CourseOperations;
import database.operations.ExamOperations;
import entity.Examination;
import entity.Result;

@RestController
public class ExaminationController {
	@RequestMapping(value = "/addNewExamination", method = RequestMethod.POST)	
	public  @ResponseBody Result addExamination( @RequestBody Examination examination )   {	
		 ExaminationApplication examinationApplication = new ExaminationApplication();
		 return examinationApplication.addExamination(examination);
	}
	@RequestMapping(value = "/getExamsbyUserId", method = RequestMethod.GET)
	public @ResponseBody ArrayList<Examination> getExamIdsbyUseId(@RequestParam(value = "userId",required=false) String userId){
		ExamOperations examOperations = new ExamOperations();
		return examOperations.retrieveValidExamForUser(userId);
	}
	@RequestMapping(value = "/deleteExam", method = RequestMethod.GET)	
	public  @ResponseBody Result deleteExam( @RequestParam(value="examId", required=false) String examId )   {	
		 ExamOperations examOperations = new ExamOperations();
		 return examOperations.removeExam(examId);
	}
}
