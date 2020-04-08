package service.restful;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import database.operations.ExamOperations;
import database.operations.QuestionOperations;
import entity.Question;
import entity.Result;

@RestController
public class QuestionController {
	@RequestMapping(value = "/addNewQuestion", method = RequestMethod.POST)	
	public  @ResponseBody Result addQuestion( @RequestBody Question question )   {	
		QuestionOperations questionOperations = new QuestionOperations();
		 return questionOperations.questionInsert(question);
	}
	@RequestMapping(value = "/getQuestionsforCourse", method = RequestMethod.GET)	
	public  @ResponseBody ArrayList<Question> getQuestionsforCourse( @RequestParam(value="courseId", required=true) String courseId) {	
		QuestionOperations questionOperations = new QuestionOperations();
		System.out.println("inside get questions for course");
		 return questionOperations.retreiveAllQueForCourse(courseId);
	}
	@RequestMapping(value = "/getQuestionsbyExamId", method = RequestMethod.GET)
	public @ResponseBody ArrayList<Question> getQuestionsbyExamId(@RequestParam(value="examId", required=true) String examId){
		System.out.println("inside get question from exam ID");
		ExamOperations examOperations = new ExamOperations();
		return examOperations.retreiveQuestionsforTest(examId);
	}
	@RequestMapping(value = "/deleteQuestion", method = RequestMethod.GET)	
	public  @ResponseBody Result deleteQuestion( @RequestParam(value="questionId", required=false) String questionId )   {	
		QuestionOperations questionOperations = new QuestionOperations();
		 return questionOperations.removeQuestion(questionId);
	}
}
