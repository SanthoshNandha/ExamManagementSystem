package application.operations;

import database.operations.QuestionOperations;
import entity.QuestionType;
import entity.Result;

public class QuestionTypeApplication {
	public Result addQuestionType(QuestionType questionType){
		QuestionOperations questionOperations = new QuestionOperations();
		return questionOperations.questionTypeInsert(questionType);
	}
}
