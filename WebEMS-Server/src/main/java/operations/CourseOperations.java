package operations;

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

}
