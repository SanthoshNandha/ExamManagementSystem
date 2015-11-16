package operations;

import java.util.ArrayList;
import java.util.Iterator;

import database.query.TestQuery;
import entity.Question;
import entity.Result;
import entity.StudentAnswer;
import entity.Test;

public class TestOperations {

	TestQuery testQuery=new TestQuery();
	Result result=new Result();
	
	public Result testInsert(Test test){
		IdCountOperations idCountOperations=new IdCountOperations();
		test.setTestId(idCountOperations.getTestIdCount());
		testQuery.testInsert(test);
		result.setStatus("Success");
		return result;
	}
	
	public Result evaluateAndSaveTest(Test test){
		QuestionOperations queOp=new QuestionOperations();
		ArrayList<StudentAnswer> StudentAnswers=test.getStudentAnswers();
		ArrayList<StudentAnswer> evaluatedAnswers=new ArrayList<StudentAnswer>();
		Iterator it=StudentAnswers.iterator();
		float testPoints=0.0f;
		Question que;
		while(it.hasNext()){
			StudentAnswer evalAnswer=(StudentAnswer)it.next();
			if(evalAnswer.getAnsweredChoice()!=null){
				que=queOp.retreiveAnswerforQuestionId(evalAnswer.getQuestionId());
				if(que.getAnswer().equals(evalAnswer.getAnsweredChoice())){
					evalAnswer.setIsCorrect(true);
					evalAnswer.setPoints(que.getPoint());
					testPoints+=que.getPoint();
				}
				
			}
			evaluatedAnswers.add(evalAnswer);
		}
		test.setStudentAnswers(evaluatedAnswers);
		test.setStudentscore(testPoints);
		test.setPercentage((testPoints/test.getTotalScore())*100);
		if(test.getPercentage()>=50.0f)
			test.setIsPass(true);
		else
			test.setIsPass(false);
		Result result= testInsert(test);
		result.setTestScore(testPoints);
		return result;
		
	}
	
		
	
}
