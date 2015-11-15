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
		
		/*Authentication authentication=new Authentication();
		authentication.setUserName("ANISH");
		authentication.setPassword("ANISH");
		authentication.setUserId("USR0001");
		AuthOperations authOperations=new AuthOperations();
		authOperations.authValidate(authentication);*/
		/*User user=new User();
		user.setAddressLineOne("1500 sparkman Dr");
		user.setAddressLineTwo("Nw 30E");
		user.setCity("Huntsville");
		user.setCountry("USA");
		String[] courseList={"COU00005","COU00006","COU00007"};
		user.setCourses(courseList);
		user.setDateOfBirth(new Date());
		user.setEmailID("anish@gmail.com");
		user.setFirstName("Ashwini");
		user.setLastName("Y s");
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
		
		AuthOperations authOperations=new AuthOperations();
		IdCountOperations idCountOperations=new IdCountOperations();
		//idCountOperations.getUserIdCount();
		Course course= new Course();
		//course.setCourseId();
		course.setCourseName("SE3");
		course.setCourseCode("CS501");
		Sem sem=new Sem();
		sem.setSemName("Spring");
		sem.setYear(2000);
		
		course.setSem(sem);
		ArrayList<String> examid=new ArrayList<String>();
		examid.add("EXM00004");
		examid.add("EXM00005");
		examid.add("EXM00006");
		course.setExamIds(examid);
		CourseOperations courseOperations=new CourseOperations();
		courseOperations.courseInsert(course);
		
		Examination examination= new Examination();
		ExamOperations examOperations=new ExamOperations();
		//examination.setexamId();
		
		//examtype.setdescription("Number of question will be fixed");	examination.setexam_Name("DBMS Final Exam");
		//examination.setdesc();
		//examination.setinstructions();
		examination.setDuration("3 Hours");
		examination.setMaxScore("100");
		examination.setPassScore("65");
		examination.setNumberofQuestions("12");
		examination.setExamTypeID("ETY001");
		examination.setExamName("mid term");
		//examination.setdefaultAttempts();
		//examination.setavialableFrom;
		//examination.setavialableTo;
		String[] questionsList={"QUE00001","QUE00002","QUE00003"};
		examination.setQuestionIds(questionsList);

		examOperations.examInsert(examination);*/
		
		
		 ExamOperations examOperations=new ExamOperations();
		examOperations.retrieveValidExamForUser("USR00017");

		System.out.println("------------------_------------MSG____UserIdCOunter");
		//System.out.println("idCountOperations.getUserIdCount()"+idCountOperations.getUserIdCount());
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		SpringApplication.run(HelloWorldConfiguration.class, args);
	}

}
