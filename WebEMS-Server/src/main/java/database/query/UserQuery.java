package database.query;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import database.config.SpringMongoConfig;
import entity.User;
import entity.UserType;


public class UserQuery {
	ApplicationContext ctx = 
            new AnnotationConfigApplicationContext(SpringMongoConfig.class);
    MongoOperations mongoOps = 
            (MongoOperations) ctx.getBean("mongoTemplate");
    
    public void userInsert(User users){
		mongoOps.insert(users);
	}
    
    public void userTypeInsert(UserType userType){
		mongoOps.insert(userType);
	}
    
 public ArrayList<UserType> userTypeReterive(){
    	
    	ArrayList<UserType> userTypeList = (ArrayList<UserType>) mongoOps.findAll(UserType.class);
		return userTypeList;
    	
    }
 
 public User retreiveUserCourseId(String userId){
	 
		Query findUserCourse = new Query();
		
		findUserCourse.addCriteria(Criteria.where("userId").is(userId));
		findUserCourse.fields().include("courseIds").exclude("_id");
		User validCourse= (User) mongoOps.findOne(findUserCourse, User.class);
		 return validCourse;
	 
 }
}
