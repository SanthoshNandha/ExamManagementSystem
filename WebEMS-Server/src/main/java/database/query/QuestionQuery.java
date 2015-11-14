package database.query;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import database.config.SpringMongoConfig;
import entity.IdCount;
import entity.Question;
import entity.QuestionType;

public class QuestionQuery {
	ApplicationContext ctx = 
            new AnnotationConfigApplicationContext(SpringMongoConfig.class);
    MongoOperations mongoOps = 
            (MongoOperations) ctx.getBean("mongoTemplate");
    
    public void questionInsert(Question questions){
		mongoOps.insert(questions);
	}
   
    public void questionTypeInsert(QuestionType questionType){
		mongoOps.insert(questionType);
	}
    
    public ArrayList<Question> retrieveQuestions(){
    	ArrayList<Question> questionsList = (ArrayList<Question>) mongoOps.findAll(Question.class);
		return questionsList;
    }
}
