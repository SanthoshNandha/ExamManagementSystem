package database.query;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import database.config.SpringMongoConfig;
import entity.Authentication;
import entity.IdCount;

public class IdCountQuery {
	ApplicationContext ctx = 
            new AnnotationConfigApplicationContext(SpringMongoConfig.class);
    MongoOperations mongoOps = 
            (MongoOperations) ctx.getBean("mongoTemplate");
    
    public void IdCountInsert(IdCount idCount){
    	mongoOps.insert(idCount);
    }
    
    public ArrayList<IdCount> IdCountReterive(IdCount idCount){
    	
    	ArrayList<IdCount> idCountList = (ArrayList<IdCount>) mongoOps.findAll(IdCount.class);
		return idCountList;
    	
    }
    public void IdCountDrop(IdCount idCount){
   
    	mongoOps.dropCollection(IdCount.class);
    	
    }
}
