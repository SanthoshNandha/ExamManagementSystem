package operations;

import database.query.AuthQuery;
import entity.Authentication;

public class AuthOperations {
	AuthQuery authQuery=new AuthQuery();
	
	public void authInsert(Authentication authentication){
		authQuery.authInsert(authentication);
	}
	
	public String authValidate(Authentication authentication){
		//String status="FAILURE";
		Authentication retrievedAuth=authQuery.authRetrieve(authentication);
		if(retrievedAuth!= null){
			return retrievedAuth.getUserId();
			}
		
		return "Error:Invalid Username/Password";
		
	}
	
	/*public String generateUserId(){
		
	}*/
}
