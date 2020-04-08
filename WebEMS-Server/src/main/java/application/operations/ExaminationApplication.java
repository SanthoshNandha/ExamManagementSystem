package application.operations;

import database.operations.ExamOperations;
import entity.Examination;
import entity.Result;

public class ExaminationApplication {
	public Result addExamination(Examination examination){
		ExamOperations examOperation = new ExamOperations();
		return examOperation.examInsert(examination);
	}

}
