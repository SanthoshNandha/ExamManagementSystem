package operations;

import database.query.TestQuery;
import entity.Result;
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
	
}
