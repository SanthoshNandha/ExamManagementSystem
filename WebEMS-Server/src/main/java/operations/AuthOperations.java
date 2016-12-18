package operations;

import database.query.AuthQuery;
import entity.Authentication;
import entity.Result;

public class AuthOperations {
	AuthQuery authQuery=new AuthQuery();
	Result result=new Result();
	
	public Result authInsert(Authentication authentication){
		authQuery.authInsert(authentication);
		result.setStatus("Success");
		return result;
	}
	
	public Result authValidate(Authentication authentication){
		
		Authentication retrievedAuth=authQuery.authRetrieve(authentication);
		if(retrievedAuth!= null){
			result.setAuthUserId(retrievedAuth.getUserId());
			result.setAuthUserType(retrievedAuth.getUserType());
			}
		  
		return result;
				
		
	}
	
public Result removeAuth(String userId){
	    authQuery.removeAuth(userId);
		result.setStatus("Success");
		return result;
	}
}
