package database.operations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;


import database.query.ExamQuery;
import entity.ExamType;
import entity.Examination;
import entity.Question;
import entity.Result;

public class ExamOperations {
 
	ExamQuery examQuery=new ExamQuery();
	Result result=new Result();
	
	public Result examInsert(Examination exam){
		  CourseOperations co=new CourseOperations();
		  IdCountOperations idCountOperations=new IdCountOperations();
		  exam.setExamId("EXM"+idCountOperations.getExamIdCount());
		  co.insertExamToCourse(exam.getCourseId(),exam.getExamId());
		  examQuery.examInsert(exam);
		   result.setStatus("Success");
			return result;
		}
	
	public Result removeExam(String examId){
		examQuery.removeExam(examId);
		result.setStatus("Success");
		return result;
	}
	
	public Result removeExamType(String examTypeId){
		examQuery.removeExamType(examTypeId);
		result.setStatus("Success");
		return result;
	}
	
	public Result examTypeInsert(ExamType examType){
		IdCountOperations idCountOperations=new IdCountOperations();
		examType.setExamTypeId("ETY"+idCountOperations.getExamTypeIdCount());
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
	
	public ArrayList<Examination> retrieveValidExamForUser(String userId){
		UserOperations userOperation=new UserOperations();
		CourseOperations courseOperations= new CourseOperations();
		String[] validCourse=userOperation.getValidCouseId(userId);
		ArrayList<String> examids=new ArrayList<String>();
		//examids.add("");
		for (String courseId: validCourse) {  
			ArrayList<String> tempExamids=courseOperations.retrieveValidExamIdForCourse(courseId);
			if(tempExamids!=null)
			examids.addAll(tempExamids);
		}
		Iterator it=examids.iterator();
		
		ArrayList<Examination> validExams=new ArrayList<Examination>();
		
		while(it.hasNext())
			validExams.add(retrieveExamforExamId((String)it.next()));
		return validExams;
		
	}
	
     public ArrayList<Question> retreiveQuestionsforTest(String examId){
    	 ArrayList<Question> testQuestions=new ArrayList<Question>();
    	 QuestionOperations questionOperations= new QuestionOperations();
    	 Examination seletedExam=retrieveExamforExamId(examId);
    	 if(seletedExam.getExamTypeID()!=null && seletedExam.getExamTypeID().equals("ETY001")){
    		 if(seletedExam.getQuestionIds()!=null){
    	      Iterator it=seletedExam.getQuestionIds().iterator();
 		       while(it.hasNext())
 			      testQuestions.add(questionOperations.retreiveQuestionsforQuestionId((String)it.next()));
                 
    		 }
    		 else{
    			 result.setErrorMsg("Invalid question");
    		 }
    	 }
    	 else{
    		 Random randomGenerator=new Random();
    		 //int questionCount=0;
    		 int randomIndex=0;
    		 HashSet<Question> tempRandomQue=new HashSet<Question>();
    		 ArrayList<Question> courseQuestions = questionOperations.retreiveAllQueForCourse(seletedExam.getCourseId());
    		 while(seletedExam.getNumberofQuestions()>tempRandomQue.size()){
    			 randomIndex= randomGenerator.nextInt(courseQuestions.size());
    			 tempRandomQue.add(courseQuestions.get(randomIndex));
    			 
    		 }
    		 ArrayList<Question> mapConvert=new ArrayList<Question>(tempRandomQue);
    		 testQuestions=mapConvert;
    	 }
    	 
    	 return testQuestions;
	}
	
}
