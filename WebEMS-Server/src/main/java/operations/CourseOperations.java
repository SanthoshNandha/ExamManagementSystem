package operations;

import java.util.ArrayList;

import database.query.CourseQuery;
import entity.Course;
import entity.Result;

public class CourseOperations {
	CourseQuery courseQuery= new CourseQuery();
	Result result= new Result();
	
	public Result courseInsert(Course course){
		IdCountOperations idCountOperations=new IdCountOperations();
		course.setCourseId("COU"+idCountOperations.getCourseIdCount());
		courseQuery.courseInsert(course);
		result.setStatus("Success");
		return result;
	}
	
	 public Result removeCourse(String courseId){
		   courseQuery.removeCourse(courseId);
			result.setStatus("Success");
			return result;
		}
	 
	 public ArrayList<Course> retrieveAllCourse(){
		 return courseQuery.retrieveAllCourse();
	 }
	
	public ArrayList<String> retrieveValidExamIdForCourse(String courseId){
    	return (courseQuery.retreiveExamIdforCourse(courseId)).getExamIds();
    }
	
	public Result insertExamToCourse(String courseId,String examId){
		courseQuery.insertExamToCourse(courseId,examId);
		result.setStatus("Success");
		return result;
	}
}
