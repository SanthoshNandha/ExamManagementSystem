package service.restful;



import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import application.operations.UserApplication;
import database.operations.UserOperations;
import entity.Result;
import entity.User;

@RestController
public class UserController {
	
	@RequestMapping(value = "/adduser", method = RequestMethod.GET)
    public @ResponseBody Result addUser1
    (@RequestParam(value="firstName", required=false) String firstName, @RequestParam(value="lastName", required=false) String lastName, 
    		@RequestParam(value="middleName", required=false) String middleName, @RequestParam(value="sex", required=false) String sex,
    		@RequestParam(value="dateOfBirth", required=false) String dateOfBirth,@RequestParam(value="addressLineOne", required=false) String addressLineOne,
    		@RequestParam(value="addressLineTwo", required=false) String addressLineTwo,@RequestParam(value="city", required=false) String city,
    		@RequestParam(value="state", required=false) String state,@RequestParam(value="country", required=false) String country, 
    		@RequestParam(value="zipCode", required=false) String zipCode, @RequestParam(value="mobileNumber", required=false) String mobileNumber, 
    		@RequestParam(value="emailID", required=false) String emailID, @RequestParam(value="userType", required=false) String userType){
		
        
        //return userOperation.addUser(firstName, lastName, middleName, sex, dateOfBirth, addressLineOne, addressLineTwo, city, state, country, zipCode, 
        		//mobileNumber, emailID, userType);
		System.out.println("in service of adduser get");
		return new Result();
        		
    }
	@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
	public @ResponseBody Result addUser2(@RequestParam(value="firstName", required=false) String helloa){
		System.out.println("in service of hello");
		return new Result();
	}
	@RequestMapping(value = "/getCoursebyUser", method = RequestMethod.GET)
	public @ResponseBody String[] getCoursebyUser(@RequestParam(value="userID", required=false) String userId){
		System.out.println("in service of get course");
		UserOperations userOperations = new UserOperations();
		return userOperations.getValidCouseId(userId);
	}
	@RequestMapping(value = "/addNewUser", method = RequestMethod.POST)	
	public  @ResponseBody Result addUser( @RequestBody User user )   {	
		 UserApplication userOperation = new UserApplication();
		 return userOperation.addUser(user) ;
	}
	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)	
	public  @ResponseBody Result deleteUser( @RequestParam(value="userID", required=false) String userId )   {	
		 UserOperations userOperations = new UserOperations();
		 return userOperations.removeUser(userId);
	}

}
