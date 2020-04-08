package application.operations;

import database.operations.AuthOperations;
import entity.Authentication;
import entity.Result;

public class AuthenticateApplication {
	
	public Result doAuthenticate(Authentication authentication){
		AuthOperations authOperations = new AuthOperations();
		return authOperations.authValidate(authentication);
		
	}

}
