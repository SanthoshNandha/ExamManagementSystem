package application.operations;

import database.operations.QuestionOperations;
import entity.Question;
import entity.Result;

public class QuestionApplication {
	public Result addQuestion(Question question){
		QuestionOperations questionOperations = new QuestionOperations();
		return questionOperations.questionInsert(question);
	}

}
