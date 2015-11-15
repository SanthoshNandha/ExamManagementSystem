package database.query;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import database.config.SpringMongoConfig;
import entity.ExamType;
import entity.Examination;
import entity.Question;
import entity.QuestionType;
import entity.User;

public class ExamQuery {
	ApplicationContext ctx = 
            new AnnotationConfigApplicationContext(SpringMongoConfig.class);
    MongoOperations mongoOps = 
            (MongoOperations) ctx.getBean("mongoTemplate");
    
    public void examInsert(Examination exam){
		mongoOps.insert(exam);
	}
    
    public void examTypeInsert(ExamType examType){
		mongoOps.insert(examType);
	}
    
   
    public ArrayList<ExamType> retrieveExamTypes(){
    	ArrayList<ExamType> examTypeList = (ArrayList<ExamType>) mongoOps.findAll(ExamType.class);
		return examTypeList;
    }
    
    public Examination retrieveExamforExamId(String examId){

		Query findUserExam = new Query();
		
		findUserExam.addCriteria(Criteria.where("examId").is(examId));
		//findUserCourse.fields().include("courseIds").exclude("_id");
		Examination validExam= (Examination) mongoOps.findOne(findUserExam, Examination.class);
		 return validExam;
    }
}

