package database.query;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import database.config.SpringMongoConfig;
import entity.ExamType;
import entity.Examination;

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
    
    public void removeExam(String examId){

		Query removeExam = new Query();
		removeExam.addCriteria(Criteria.where("examId").is(examId));
		mongoOps.findAndRemove(removeExam, Examination.class);
    }
    
    public void removeExamType(String examTypeId){

		Query removeExamType = new Query();
		removeExamType.addCriteria(Criteria.where("examTypeId").is(examTypeId));
		mongoOps.findAndRemove(removeExamType, ExamType.class);
    }
   
    public ArrayList<ExamType> retrieveExamTypes(){
    	ArrayList<ExamType> examTypeList = (ArrayList<ExamType>) mongoOps.findAll(ExamType.class);
		return examTypeList;
    }
    
    public Examination retrieveExamforExamId(String examId){

		Query findUserExam = new Query();
		Date currentdate=new Date();
		findUserExam.addCriteria(Criteria.where("examId").is(examId));
		//findUserExam.addCriteria(Criteria.where("avialableFrom").gte(currentdate));
		//findUserExam.addCriteria(Criteria.where("avialableTo").lte(currentdate));
		//findUserCourse.fields().include("courseIds").exclude("_id");
		Examination validExam= (Examination) mongoOps.findOne(findUserExam, Examination.class);
		 return validExam;
    }
}

