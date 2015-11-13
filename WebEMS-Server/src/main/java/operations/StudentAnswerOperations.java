package operations;

import database.query.StudentAnswerQuery;
import entity.StudentAnswer;

public class StudentAnswerOperations {
 
	StudentAnswerQuery studentAnswerQuery=new StudentAnswerQuery();
	
	public void examInsert(StudentAnswer studentAnswer){
		studentAnswerQuery.studentAnswerInsert(studentAnswer);
		}
}
