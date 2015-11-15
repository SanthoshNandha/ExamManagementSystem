package database.query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;

import database.config.SpringMongoConfig;
import entity.Authentication;



public class AuthQuery {
	ApplicationContext ctx = 
            new AnnotationConfigApplicationContext(SpringMongoConfig.class);
    MongoOperations mongoOps = 
            (MongoOperations) ctx.getBean("mongoTemplate");

	

	public void authInsert(Authentication authentication){
		mongoOps.insert(authentication);
					}
	
	public Authentication authRetrieve(Authentication authentication){
		Query findAuth = new Query();
		findAuth.addCriteria(Criteria.where("password").is(authentication.getPassword()));
		findAuth.addCriteria(Criteria.where("userName").is(authentication.getUserName()));
		findAuth.addCriteria(Criteria.where("userId").is(authentication.getUserId()));
		//findAuth.fields().include("password").include(key)
		Authentication auth = mongoOps.findOne(findAuth, Authentication.class, "Authentication");
		/*
		BasicDBObject fields = new BasicDBObject("Name",true).append("_id",false);
		DBCursor curs=*/
		return auth;
	}
	
}
