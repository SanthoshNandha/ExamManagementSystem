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
    
    public void IdCountInsert(IdCount IdCount){
    	mongoOps.insert(IdCount);
    }
    
    public ArrayList<IdCount> IdCountReterive(IdCount idCount){
    	//Query findAuth = new Query();
		
    	ArrayList<IdCount> idCountList = (ArrayList<IdCount>) mongoOps.findAll(IdCount.class);
		return idCountList;
    	
    }
    public void IdCountDrop(IdCount idCount){
    	//Query findAuth = new Query();
		
//    	ArrayList<IdCount> idCountList = (ArrayList<IdCount>) mongoOps.findAll(IdCount.class);
//		return idCountList;
    	mongoOps.dropCollection(IdCount.class);
    	
    }
}
