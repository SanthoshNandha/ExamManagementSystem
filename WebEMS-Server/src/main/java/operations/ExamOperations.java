package operations;

import java.util.ArrayList;

import database.query.ExamQuery;
import entity.ExamType;
import entity.Examination;
import entity.Result;

public class ExamOperations {
 
	ExamQuery examQuery=new ExamQuery();
	Result result=new Result();
	
	public Result examInsert(Examination exam){
		  IdCountOperations idCountOperations=new IdCountOperations();
		  exam.setExamId("EXM"+idCountOperations.getExamIdCount());
		   examQuery.examInsert(exam);
		   result.setStatus("Success");
			return result;
		}
	
	public Result examTypeInsert(ExamType examType){
		 examQuery.examTypeInsert(examType);
		 result.setStatus("Success");
		 return result;
		}
	
	public ArrayList<ExamType> retrieveExamTypes(){
		return examQuery.retrieveExamTypes();
		
	}
	
}
