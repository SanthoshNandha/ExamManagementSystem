package hello;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import database.config.SpringMongoConfig;
import entity.Authentication;
import entity.Course;
import entity.ExamType;
import entity.Examination;
import entity.IdCount;
import entity.Question;
import entity.QuestionType;
import entity.Sem;
import entity.StudentAnswer;
import entity.Test;
import entity.User;
import entity.UserType;
import operations.AuthOperations;
import operations.CourseOperations;
import operations.ExamOperations;
import operations.IdCountOperations;
import operations.QuestionOperations;
import operations.StudentAnswerOperations;
import operations.TestOperations;
import operations.UserOperations;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@SpringBootApplication
public class HelloWorldConfiguration {

	public static void main(String[] args) {
		/*PodamFactory factory = new PodamFactoryImpl();
		User user = factory.manufacturePojo(User.class);
		Authentication authentication= factory.manufacturePojo(Authentication .class);
		Course course= factory.manufacturePojo(Course.class);
		Examination Examination= factory.manufacturePojo(Examination.class);
		ExamType examType= factory.manufacturePojo(ExamType.class);
		Question question= factory.manufacturePojo(Question.class);
		QuestionType questionType= factory.manufacturePojo(QuestionType.class);
		Sem sem= factory.manufacturePojo(Sem.class);
		StudentAnswer studentAnswer= factory.manufacturePojo(StudentAnswer.class);
		Test test= factory.manufacturePojo(Test.class);
		//User User= factory.manufacturePojo(User.class);
		UserType userType= factory.manufacturePojo(UserType.class);
		UserOperations userOperations=new UserOperations();
		userOperations.userInsert(user);
		userOperations.userTypeInsert(userType);
		AuthOperations authOperations=new AuthOperations();
		authOperations.authInsert(authentication);
		CourseOperations courseOperations=new CourseOperations();
		courseOperations.courseInsert(course);
		ExamOperations examOperations=new ExamOperations();
		examOperations.examInsert(Examination);
		examOperations.examTypeInsert(examType);
		QuestionOperations questionOperations=new QuestionOperations();
		questionOperations.questionInsert(question);
		questionOperations.questionTypeInsert(questionType);
		StudentAnswerOperations studentAnswerOperations=new StudentAnswerOperations();
		studentAnswerOperations.examInsert(studentAnswer);
		TestOperations testOperations=new TestOperations();
		testOperations.testInsert(test);*/
		//UserOperations
		Authentication authentication=new Authentication();
		authentication.setUserName("ANISH");
		authentication.setPassword("Adsa");
		authentication.setUserId("USR0001");
		User user=new User();
		user.setAddressLineOne("1500 sparkman Dr");
		user.setAddressLineTwo("Nw 30E");
		user.setCity("Huntsville");
		user.setCountry("USA");
		String[] courseList={"CS001","CS701","CS703"};
		user.setCourses(courseList);
		user.setDateOfBirth(new Date());
		user.setEmailID("anish@gmail.com");
		user.setFirstName("Santhosh");
		user.setLastName("N");
		user.setMobileNumber("2564798222");
		user.setSex("male");
		user.setState("Alabama");
		//user.setUserId("USR002");
		UserOperations userOperations=new UserOperations();
		userOperations.userInsert(user);
		
		Test test= new Test();
		test.setScore("100");
		test.setProctor_Id("BLA BLA");
		
		TestOperations testOperations=new TestOperations();
		testOperations.testInsert(test);
		
		/*AuthOperations authOperations=new AuthOperations();
		IdCountOperations idCountOperations=new IdCountOperations();*/
		//idCountOperations.getUserIdCount();
		System.out.println("------------------_------------MSG____UserIdCOunter");
		//System.out.println("idCountOperations.getUserIdCount()"+idCountOperations.getUserIdCount());
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		SpringApplication.run(HelloWorldConfiguration.class, args);
	}

}
