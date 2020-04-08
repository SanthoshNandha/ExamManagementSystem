package database.operations;

import java.util.ArrayList;

import database.query.UserQuery;
import entity.Authentication;
import entity.Result;
import entity.User;
import entity.UserType;

public class UserOperations {
    UserQuery userQuery=new UserQuery();
    Result result=new Result();
	
    public Result userInsert(User user){
    	Authentication auth= new Authentication();
    	AuthOperations authOp=new AuthOperations();
    	IdCountOperations idCountOperations=new IdCountOperations();
    	user.setUserId("USR"+idCountOperations.getUserIdCount());
    	auth.setPassword("password");
    	auth.setUserName(user.getFirstName()+" "+user.getLastName());
    	auth.setUserId(user.getUserId());
    	auth.setUserType(user.getUserType());
		userQuery.userInsert(user);
		authOp.authInsert(auth);
		result.setStatus("Success");
		result.setUserId(user.getUserId());
		return result;
	}
    
    public Result removeUser(String userId){
    	
    	AuthOperations authOp=new AuthOperations();
    	
    	userQuery.removeUser(userId);
    	authOp.removeAuth(userId);
		result.setStatus("Success");
		return result;
	}
    
    public Result userTypeInsert(UserType userType){
		userQuery.userTypeInsert(userType);
		result.setStatus("Success");
		return result;	
    }
    
    public Result removeUserType(String userTypeId){
    	userQuery.removeUserType(userTypeId);
		result.setStatus("Success");
		return result;
	}
    
    public ArrayList<UserType> userTypeRetrieve(){
    	return userQuery.userTypeReterive();
    	
    }
    
    public String[] getValidCouseId(String userId){
    	return (userQuery.retreiveUserCourseId(userId)).getCourseIds();
    }
    
    
}
