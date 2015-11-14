package operations;

import java.util.ArrayList;

import database.query.QuestionQuery;
import entity.Question;
import entity.QuestionType;
import entity.Result;

public class QuestionOperations {

	QuestionQuery questionQuery=new QuestionQuery();
	Result result= new Result();
	
	public Result questionInsert(Question questions){
		IdCountOperations idCountOperations=new IdCountOperations();
		questions.setQuestionId("QUE"+idCountOperations.getQuestionIdCount());
		questionQuery.questionInsert(questions);
		result.setStatus("Success");
		return result;
	}
	
	public Result questionTypeInsert(QuestionType questionType){
		questionQuery.questionTypeInsert(questionType);
		result.setStatus("Success");
		return result;
	}
	
	public ArrayList<Question> retrieveQuestions(){
		return questionQuery.retrieveQuestions();
	}
}
