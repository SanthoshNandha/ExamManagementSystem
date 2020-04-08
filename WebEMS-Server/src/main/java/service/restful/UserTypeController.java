package service.restful;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import application.operations.UserTypeApplication;
import database.operations.UserOperations;
import entity.Result;
import entity.UserType;

@RestController
public class UserTypeController {
	@RequestMapping(value = "/addNewUserType", method = RequestMethod.POST)	
	public  @ResponseBody Result addUserType( @RequestBody UserType userType )   {	
		 UserTypeApplication userTypeApplication = new UserTypeApplication();
		 return userTypeApplication.addUserType(userType);
	}
	@RequestMapping(value = "/getAllUserTypes", method = RequestMethod.GET)	
	public  @ResponseBody ArrayList<UserType> getAllUserTypes()   {	
		UserOperations userOperations = new UserOperations();
		 return userOperations.userTypeRetrieve();
	}
}
