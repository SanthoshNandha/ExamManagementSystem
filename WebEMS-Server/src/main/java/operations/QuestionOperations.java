package operations;

import database.query.QuestionQuery;
import entity.Question;
import entity.QuestionType;

public class QuestionOperations {

	QuestionQuery questionQuery=new QuestionQuery();
	
	public void questionInsert(Question questions){
		IdCountOperations idCountOperations=new IdCountOperations();
		questions.setQuestionId("QUE"+idCountOperations.getQuestionIdCount());
		questionQuery.questionInsert(questions);
	}
	
	public void questionTypeInsert(QuestionType questionType){
		questionQuery.questionTypeInsert(questionType);
	}
}
