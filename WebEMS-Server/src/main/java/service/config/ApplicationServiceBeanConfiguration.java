package service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import service.restful.AuthenticationController;
import service.restful.CourseController;
import service.restful.ExamTypeController;
import service.restful.ExaminationController;
import service.restful.QuestionController;
import service.restful.QuestionTypeController;
import service.restful.SemController;
import service.restful.StudentAnswerController;
import service.restful.TestController;
import service.restful.UserController;
import service.restful.UserTypeController;

@Configuration
public class ApplicationServiceBeanConfiguration {
	
	@Bean
	public AuthenticationController authenticationController(){
		
		return new AuthenticationController();
	}
	@Bean
	public CourseController courseController(){
		return new CourseController();
	}
	@Bean
	public ExaminationController examinationController(){
		return new ExaminationController();
	}
	@Bean
	public ExamTypeController examTypeController(){
		return new ExamTypeController();
	}
	@Bean
	public QuestionController questionController(){
		return new QuestionController();
	}
	@Bean
	public QuestionTypeController questionTypeController(){
		return new QuestionTypeController();
	}
	@Bean
	public SemController semController(){
		return new SemController();
	}
	@Bean
	public StudentAnswerController studentAnswerController(){
		return new StudentAnswerController();
	}
	@Bean
	public TestController testController(){
		return new TestController();
	}
	@Bean
	public UserController userController(){
		
		return new UserController();
	}
	@Bean
	public UserTypeController userTypeController(){
		return new UserTypeController();
	}

}
