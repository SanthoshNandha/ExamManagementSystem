package database.operations;

import database.query.AuthenticationQuery;
import entity.Authentication;

public class AuthenticationOperation {
	
	AuthenticationQuery authQuery=new AuthenticationQuery();
	
	public String authenticationInsert(Authentication authentication){
		String status = "Failed";
		authQuery.authenticationInsert(authentication);
		return status;
	}
	
}
