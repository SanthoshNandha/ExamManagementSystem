package application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import application.operations.AuthenticateApplication;
import application.operations.CourseApplication;
import application.operations.ExamTypeApplication;
import application.operations.ExaminationApplication;
import application.operations.QuestionApplication;
import application.operations.QuestionTypeApplication;
import application.operations.SemApplication;
import application.operations.StudentAnswerApplication;
import application.operations.TestApplication;
import application.operations.UserApplication;
import application.operations.UserTypeApplication;

@Configuration
public class ApplicationBeanConfiguration {
	@Bean
	public AuthenticateApplication applicationAuthentication(){
		return new AuthenticateApplication();
	}
	@Bean
	public CourseApplication courseApplication(){
		return new CourseApplication();
	}
	@Bean
	public ExaminationApplication examinationApplication(){
		return new ExaminationApplication();
	}
	@Bean
	public ExamTypeApplication examTypeApplication(){
		return new ExamTypeApplication();
	}
	@Bean
	public QuestionApplication questionApplication(){
		return new QuestionApplication();
	}
	@Bean
	public QuestionTypeApplication questionTypeApplication(){
		return new QuestionTypeApplication();
	}
	@Bean
	public SemApplication semApplication(){
		return new SemApplication();
	}
	@Bean
	public StudentAnswerApplication studentAnswerApplication(){
		return new StudentAnswerApplication();
	}
	@Bean
	public TestApplication testApplication(){
		return new TestApplication();
	}
	@Bean
	public UserApplication userApplication(){
		return new UserApplication();
	}
	@Bean
	public UserTypeApplication userTypeApplication(){
		return new UserTypeApplication();
	}
}
