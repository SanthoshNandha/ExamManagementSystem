package operations;

import database.query.UserQuery;
import entity.User;
import entity.UserType;

public class UserOperations {
    UserQuery userQuery=new UserQuery();
	
    public void userInsert(User user){
    	IdCountOperations idCountOperations=new IdCountOperations();
    	user.setUserId("USR"+idCountOperations.getUserIdCount());
		userQuery.userInsert(user);
	}
    
    public void userTypeInsert(UserType userType){
		userQuery.userTypeInsert(userType);	}
    
    
}
