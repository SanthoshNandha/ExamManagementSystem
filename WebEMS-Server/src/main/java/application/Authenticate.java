package application;

import database.operations.AuthenticationOperation;
import entity.Authentication;

public class Authenticate {
	
	public Authentication doAuthenticate(String userName, String password){
		Authentication authentication =  new Authentication();
		AuthenticationOperation authenticationOperation = new AuthenticationOperation();
		
		authentication.setUserName(userName);
		authentication.setPassword(password);
		
		authentication.setUserId("us001");
		authentication.setErrorMsg("Success");
		authentication.setIsLoggedIn("true");
		
		authenticationOperation.authenticationInsert(authentication);
		
		
		
		return authentication;
	}

}
