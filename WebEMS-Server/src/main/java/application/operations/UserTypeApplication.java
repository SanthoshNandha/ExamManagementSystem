package application.operations;

import database.operations.UserOperations;
import entity.Result;
import entity.UserType;

public class UserTypeApplication {
	public Result addUserType(UserType userType){
		UserOperations userOperation = new UserOperations();
		return userOperation.userTypeInsert(userType);
	}
}
