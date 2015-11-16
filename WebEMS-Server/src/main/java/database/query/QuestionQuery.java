package database.query;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import database.config.SpringMongoConfig;
import entity.Examination;
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
     
    public  Question retreiveQuestionsforQuestionId(String queId){
                Query findExamQue = new Query();
		
                findExamQue.addCriteria(Criteria.where("questionId").is(queId));
		//findUserCourse.fields().include("courseIds").exclude("_id");
                Question que= (Question) mongoOps.findOne(findExamQue, Question.class);
		 return que;
    }
    
    public ArrayList<Question> retreiveAllQueForCourse(String courseId){
    	 Query findRandomExamQue = new Query();
 		
    	 findRandomExamQue.addCriteria(Criteria.where("courseId").is(courseId));
	//findUserCourse.fields().include("courseIds").exclude("_id");
         ArrayList<Question> ques= (ArrayList<Question>) mongoOps.find(findRandomExamQue, Question.class);
	 return ques;
    	
    }
    
}
