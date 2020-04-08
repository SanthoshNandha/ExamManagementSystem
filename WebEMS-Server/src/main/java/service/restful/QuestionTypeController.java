package service.restful;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import application.operations.QuestionTypeApplication;
import entity.QuestionType;
import entity.Result;

public class QuestionTypeController {
	@RequestMapping(value = "/addNewQuestionType", method = RequestMethod.POST)	
	public  @ResponseBody Result addQuestionType( @RequestBody QuestionType questionType )   {	
		 QuestionTypeApplication questionTypeApplication = new QuestionTypeApplication();
		 return questionTypeApplication.addQuestionType(questionType);
	}
}
