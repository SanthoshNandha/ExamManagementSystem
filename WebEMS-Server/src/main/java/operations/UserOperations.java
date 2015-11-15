package operations;

import java.util.ArrayList;

import database.query.UserQuery;
import entity.Result;
import entity.User;
import entity.UserType;

public class UserOperations {
    UserQuery userQuery=new UserQuery();
    Result result=new Result();
	
    public Result userInsert(User user){
    	IdCountOperations idCountOperations=new IdCountOperations();
    	user.setUserId("USR"+idCountOperations.getUserIdCount());
		userQuery.userInsert(user);
		result.setStatus("Success");
		return result;
	}
    
    public Result userTypeInsert(UserType userType){
		userQuery.userTypeInsert(userType);
		result.setStatus("Success");
		return result;	
    }
    
    public ArrayList<UserType> userTypeRetrieve(){
    	return userQuery.userTypeReterive();
    	
    }
    
    public String[] getValidCouseId(String userId){
    	return (userQuery.retreiveUserCourseId(userId)).getCourses();
    }
    
    
}
