package database.query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import database.config.SpringMongoConfig;
import entity.Course;
import entity.User;

public class CourseQuery {
	ApplicationContext ctx = 
            new AnnotationConfigApplicationContext(SpringMongoConfig.class);
    MongoOperations mongoOps = 
            (MongoOperations) ctx.getBean("mongoTemplate");
    
    public void courseInsert(Course course){
		mongoOps.insert(course);
	}

	
	public Course retreiveExamIdforCourse(String courseId){
		 
		Query findExamforCourse = new Query();
		
		findExamforCourse.addCriteria(Criteria.where("courseId").is(courseId));
		findExamforCourse.fields().include("examIds").exclude("_id");
		Course validExamids= (Course) mongoOps.findOne(findExamforCourse, Course.class);
		 return validExamids;
	 
 }
}
