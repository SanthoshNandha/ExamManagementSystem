package database.query;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import database.config.SpringMongoConfig;
import entity.ExamType;
import entity.Examination;
import entity.Question;
import entity.QuestionType;

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
}

