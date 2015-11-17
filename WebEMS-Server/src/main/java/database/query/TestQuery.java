package database.query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import database.config.SpringMongoConfig;
import entity.Examination;
import entity.Test;

public class TestQuery {
	ApplicationContext ctx = 
            new AnnotationConfigApplicationContext(SpringMongoConfig.class);
    MongoOperations mongoOps = 
            (MongoOperations) ctx.getBean("mongoTemplate");
    
    public void testInsert(Test test){
		mongoOps.insert(test);
	}
    
    public void removeTest(String testId){

		Query removeTest = new Query();
		removeTest.addCriteria(Criteria.where("testId").is(testId));
		//mongoOps.findAllAndRemove(removeTest,"Test");
		mongoOps.findAndRemove(removeTest, Test.class);
    }
}
