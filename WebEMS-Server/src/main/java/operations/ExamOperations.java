package operations;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import database.query.ExamQuery;
import entity.ExamType;
import entity.Examination;
import entity.Result;
import entity.User;

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
	
	public Examination retrieveExamforExamId(String examId){
		return examQuery.retrieveExamforExamId(examId);
		
	}
	
	public void retrieveValidExamForUser(String userId){
		UserOperations userOperation=new UserOperations();
		CourseOperations courseOperations= new CourseOperations();
		String[] validCourse=userOperation.getValidCouseId(userId);
		ArrayList<String> examids=new ArrayList<String>();
		//examids.add("");
		for (String courseId: validCourse) {  
			ArrayList<String> tempExamids=courseOperations.retrieveValidExamId(courseId);
			if(tempExamids!=null)
			examids.addAll(tempExamids);
		}
		Iterator it=examids.iterator();
		ArrayList<Examination> validExams=new ArrayList<Examination>();
		while(it.hasNext())
			validExams.add(retrieveExamforExamId((String)it.next()));
		System.out.println(validExams);
		//return examQuery.retrieveValidExamForUser(userId); 
	}
	
}
