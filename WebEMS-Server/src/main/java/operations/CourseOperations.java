package operations;

import database.query.CourseQuery;
import entity.Course;

public class CourseOperations {
	CourseQuery courseQuery= new CourseQuery();
	
	public void courseInsert(Course course){
		IdCountOperations idCountOperations=new IdCountOperations();
		course.setCourseId("COU"+idCountOperations.getCourseIdCount());
		courseQuery.courseInsert(course);
	}

}
