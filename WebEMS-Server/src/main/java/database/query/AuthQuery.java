package database.query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import database.config.SpringMongoConfig;
import entity.Authentication;



public class AuthQuery {
	ApplicationContext ctx = 
            new AnnotationConfigApplicationContext(SpringMongoConfig.class);
    MongoOperations mongoOps = 
            (MongoOperations) ctx.getBean("mongoTemplate");

	/*public AuthQuery() {
		super();
	}*/

	public void authInsert(Authentication authentication){
		mongoOps.insert(authentication);
	}
	
	public Authentication authRetrieve(Authentication authentication){
		Query findAuth = new Query();
		findAuth.addCriteria(Criteria.where("password").is(authentication.getPassword()));
		findAuth.addCriteria(Criteria.where("userName").is(authentication.getUserName()));
		Authentication auth = mongoOps.findOne(findAuth, Authentication.class, "Authentication");
		return auth;
	}
}
