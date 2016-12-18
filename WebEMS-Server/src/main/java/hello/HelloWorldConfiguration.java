package hello;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import database.config.SpringMongoConfig;
import entity.Authentication;
import entity.Course;
import entity.ExamType;
import entity.Examination;
import entity.IdCount;
import entity.Question;
import entity.QuestionType;
import entity.Result;
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
		Examination examination= new Examination();
		ExamOperations eo=new ExamOperations();
		/*//examination.setExamId("EXM00009");
		examination.setDuration("3 Hours");
		examination.setMaxScore(100);
		examination.setPassScore(65);
		examination.setNumberofQuestions(5);
		examination.setExamTypeID("ETY002");
		examination.setExamName("mid term");
		//examination.setdefaultAttempts();
		//examination.setavialableFrom;
		//examination.setavialableTo;
		ArrayList<String> questionsList=new ArrayList<String>();
		questionsList.add("QUE00001");
		questionsList.add("QUE00002");
		questionsList.add("QUE00003");
		examination.setQuestionIds(questionsList);
		examination.setCourseId("COU00001");

		
		
		eo.examInsert(examination);*/
		

		//System.out.println("------------------_------------questions"+question);
		//System.out.println("idCountOperations.getUserIdCount()"+idCountOperations.getUserIdCount());
		//eo.retrieveValidExamForUser("USR00025");
		//eo.retreiveQuestionsforTest("EXM00001");
		/*Authentication authentication=new Authentication();
		authentication.setUserId("US00026");
		authentication.setPassword("password");
		AuthOperations authOperations=new AuthOperations();
		authOperations.authValidate(authentication);*/
		
		/*CourseOperations co=new CourseOperations();
		co.insertExamToCourse("COU00010","EXM00001");*/
		
		Test test= new Test();
		test.setTotalScore(100.0f);
		test.setProctor_Id("USR00001");
		//test.setIsPass(true);
		//test.setStudentscore(85);
		//test.setPercentage(85);
		StudentAnswer studentAnswer=new StudentAnswer();
		ArrayList<StudentAnswer> SA=new ArrayList<StudentAnswer>();
		studentAnswer.setAnsweredChoice("Transitive Rule");
		studentAnswer.setIsCorrect(true);
		studentAnswer.setQuestionId("QUE00001");
		studentAnswer.setQuestionNo(1);
		StudentAnswer studentAnswer2=new StudentAnswer();
		studentAnswer2.setAnsweredChoice("Transitive Rule");
		studentAnswer2.setIsCorrect(true);
		studentAnswer2.setQuestionId("QUE00002");
		studentAnswer2.setQuestionNo(2);
		/*StudentAnswer studentAnswer3=new StudentAnswer();
		studentAnswer3.setAnsweredChoice("Transitive Rule");
		studentAnswer3.setIsCorrect(true);
		studentAnswer3.setQuestionId("QUE00015");
		studentAnswer3.setQuestionNo(3);*/
		SA.add(studentAnswer);
		SA.add(studentAnswer2);
		//SA.add(studentAnswer3);
		test.setStudentAnswers(SA);
		
		
		
		
		TestOperations testOperations=new TestOperations();
		//testOperations.testInsert(test);
		Result result=testOperations.evaluateAndSaveTest(test);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		SpringApplication.run(HelloWorldConfiguration.class, args);
	}

}
