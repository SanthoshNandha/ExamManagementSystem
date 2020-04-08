package service.restful;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import database.operations.CourseOperations;
import database.operations.UserOperations;
import entity.Course;
import entity.Result;

@RestController
public class CourseController {
	@RequestMapping(value = "/addNewCourse", method = RequestMethod.POST)	
	public  @ResponseBody Result addCourse( @RequestBody Course course )   {	
		 CourseOperations courseOperation = new CourseOperations();
		 return courseOperation.courseInsert(course);
	}
	@RequestMapping(value = "/getAllCourse", method = RequestMethod.GET)	
	public  @ResponseBody ArrayList<Course> getAllCourse()   {	
		 CourseOperations courseOperation = new CourseOperations();
		 return courseOperation.retrieveAllCourse();
	}
	@RequestMapping(value = "/getCoursesforUser", method = RequestMethod.GET)	
	public  @ResponseBody String[] getCoursesforUser(@RequestParam(value = "userId", required = true) String userId)   {	
		 UserOperations userOperations = new UserOperations();
		 return userOperations.getValidCouseId(userId);
	}
	@RequestMapping(value = "/deleteCourse", method = RequestMethod.GET)	
	public  @ResponseBody Result deleteCourse( @RequestParam(value="courseId", required=false) String courseId )   {	
		 CourseOperations courseOperations = new CourseOperations();
		 return courseOperations.removeCourse(courseId);
	}

}
