package application.operations;

import database.operations.SemOperations;
import entity.Result;
import entity.Sem;

public class SemApplication {
	public Result addSem(Sem sem){
		SemOperations semOperations = new SemOperations(); 
		return semOperations.semInsert(sem);
	}

}
