package database.query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

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
    
    
}
