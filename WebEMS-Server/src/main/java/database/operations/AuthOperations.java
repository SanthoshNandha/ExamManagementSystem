package database.operations;

import database.query.AuthQuery;
import entity.Authentication;

public class AuthOperations {
	AuthQuery authQuery=new AuthQuery();
	
	public void authInsert(Authentication authentication){
		authQuery.authInsert(authentication);
	}
	
	public String authValidate(Authentication authentication){
		String status="FAILURE";
		
		if(authQuery.authRetrieve(authentication)!= null){
			status="SUCCESS";
		}
		
		return status;
		
	}
}
