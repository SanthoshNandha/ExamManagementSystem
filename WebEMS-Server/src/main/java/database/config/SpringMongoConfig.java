package database.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoURI;

@Configuration
public class SpringMongoConfig {
	public @Bean
	MongoDbFactory mongoDbFactory() throws Exception {
		
		//MongoClientURI mongoClientURI = new MongoClientURI("mongodb://santhosh:sansan@ds053944.mongolab.com:53944/webems");
		@SuppressWarnings("deprecation")
		MongoURI mongoURI = new MongoURI("mongodb://santhosh:sansan@ds053944.mongolab.com:53944/webems");
		SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(mongoURI);
		return simpleMongoDbFactory;
	}

	public @Bean
	MongoTemplate mongoTemplate() throws Exception {
		
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
				
		return mongoTemplate;
		
	}
}
