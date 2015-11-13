package operations;

import database.query.TestQuery;
import entity.Test;

public class TestOperations {

	TestQuery testQuery=new TestQuery();
	
	public void testInsert(Test test){
		IdCountOperations idCountOperations=new IdCountOperations();
		test.setTestId(idCountOperations.getTestIdCount());
		testQuery.testInsert(test);
	}
	
}
