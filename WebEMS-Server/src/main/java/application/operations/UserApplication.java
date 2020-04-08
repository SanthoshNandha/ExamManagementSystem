package application.operations;

import java.text.SimpleDateFormat;
import java.util.Date;

import entity.Result;
import entity.User;

public class UserApplication {
	
	public Result addUser1(String firstName, String lastName, String middleName, String sex, String dateOfBirth, 
			String addressLineOne, String addressLineTwo, String city, String state, String country, String zipCode, 
			String mobileNumber, String emailID, String userType){
		
		User user = new User();
		database.operations.UserOperations userOperations = new database.operations.UserOperations();
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
		try{
				Date birthdate = formatter.parse(dateOfBirth);
		
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setMiddleName(middleName);
		user.setSex(sex);
		user.setDateOfBirth(birthdate);
		user.setAddressLineOne(addressLineOne);
		user.setAddressLineTwo(addressLineTwo);
		user.setCity(city);
		user.setState(state);
		user.setCountry(country);
		user.setZipCode(zipCode);
		user.setMobileNumber(mobileNumber);
		user.setEmailID(emailID);
		user.setCourseIds(null);
		
		}
		catch(Exception e){
			
		}
		return userOperations.userInsert(user);
	}
	
	public Result addUser(User user){
		database.operations.UserOperations userOperations = new database.operations.UserOperations();
		return userOperations.userInsert(user);
	}

}
