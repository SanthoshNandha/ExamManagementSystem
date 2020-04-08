package application.operations;

import database.operations.ExamOperations;
import entity.ExamType;
import entity.Result;

public class ExamTypeApplication {
	public Result addExamType(ExamType examType){
		ExamOperations examOperations = new ExamOperations();
		return examOperations.examTypeInsert(examType);
	}

}
