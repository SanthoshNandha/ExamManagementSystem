package operations;

import database.query.ExamQuery;
import entity.ExamType;
import entity.Examination;

public class ExamOperations {
 
	ExamQuery examQuery=new ExamQuery();
	 
	
	public void examInsert(Examination exam){
		  IdCountOperations idCountOperations=new IdCountOperations();
		  exam.setExamId("EXM"+idCountOperations.getExamIdCount());
		 examQuery.examInsert(exam);
		}
	
	public void examTypeInsert(ExamType examType){
		 examQuery.examTypeInsert(examType);
		}
	
}
