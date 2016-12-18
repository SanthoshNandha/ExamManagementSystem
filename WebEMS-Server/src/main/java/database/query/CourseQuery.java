package database.query;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import database.config.SpringMongoConfig;
import entity.Course;
import entity.Examination;
import entity.Test;
import entity.User;
import entity.UserType;

public class CourseQuery {
	ApplicationContext ctx = 
            new AnnotationConfigApplicationContext(SpringMongoConfig.class);
    MongoOperations mongoOps = 
            (MongoOperations) ctx.getBean("mongoTemplate");
    
    public void courseInsert(Course course){
		mongoOps.insert(course);
	}

    public void removeCourse(String courseId){

		Query removeCourse = new Query();
		removeCourse.addCriteria(Criteria.where("courseId").is(courseId));
		mongoOps.findAndRemove(removeCourse, Course.class);
    }
    
	public Course retreiveExamIdforCourse(String courseId){
		 
		Query findExamforCourse = new Query();
		
		findExamforCourse.addCriteria(Criteria.where("courseId").is(courseId));
		findExamforCourse.fields().include("examIds").exclude("_id");
		Course validExamids= (Course) mongoOps.findOne(findExamforCourse, Course.class);
		 return validExamids;
	 
 }
	
	public ArrayList<Course> retrieveAllCourse(){
		ArrayList<Course> courseList = (ArrayList<Course>) mongoOps.findAll(Course.class);
		return courseList;
	}
	
	public void insertExamToCourse(String courseId,String examId){
Query findExamforCourse = new Query();
		
		findExamforCourse.addCriteria(Criteria.where("courseId").is(courseId));
		//findExamforCourse.fields().include("examIds").exclude("_id");
		Course course= (Course) mongoOps.findOne(findExamforCourse, Course.class);
		ArrayList<String> examList=(ArrayList<String>)course.getExamIds();
		if(examList==null)
			examList=new ArrayList<String>();
		examList.add(examId);
		course.setExamIds(examList);
		
		Update update = new Update();
		update.set("examIds", examList);

		mongoOps.updateFirst(findExamforCourse, update, Course.class);
		 
		
	}
}
