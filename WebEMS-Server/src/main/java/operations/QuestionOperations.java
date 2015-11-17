package operations;

import java.util.ArrayList;

import database.query.QuestionQuery;
import entity.Examination;
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
	
	public Result removeQuestion(String questionId){
		    questionQuery.removeQuestion(questionId);
			result.setStatus("Success");
			return result;
		}
	
	public Result removeQuestionType(String questionTypeId){
	    questionQuery.removeQuestionType(questionTypeId);
		result.setStatus("Success");
		return result;
	}
	
	public ArrayList<Question> retrieveQuestions(){
		return questionQuery.retrieveQuestions();
	}
	
	public Question retreiveQuestionsforQuestionId(String queId){
		return questionQuery.retreiveQuestionsforQuestionId(queId);
	}
	
	public ArrayList<Question> retreiveAllQueForCourse(String courseId){
		return questionQuery.retreiveAllQueForCourse(courseId);
	}
	
	public Question retreiveAnswerforQuestionId(String queId){
		return questionQuery.retreiveQuestionsforQuestionId(queId);
	}
	
}
