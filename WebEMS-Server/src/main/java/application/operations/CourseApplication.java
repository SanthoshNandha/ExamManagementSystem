package application.operations;

import database.operations.CourseOperations;
import entity.Course;
import entity.Result;

public class CourseApplication {
	public Result addCourse(Course course){
		CourseOperations courseOperation = new CourseOperations();
		return courseOperation.courseInsert(course);
	}

}
