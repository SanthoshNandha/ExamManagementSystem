package database.operations;

import database.query.SemQuery;
import entity.Result;
import entity.Sem;

public class SemOperations {
	SemQuery semQuery= new SemQuery();
	Result result= new Result();
	
	public Result semInsert(Sem sem){
		//IdCountOperations idCountOperations=new IdCountOperations();
		//sem.set("COU"+idCountOperations.getCourseIdCount());
		semQuery.semInsert(sem);
		result.setStatus("Success");
		return result;
	}

}
