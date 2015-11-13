package entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Authentication")
public class Authentication {
	
	private String userId;
	private String userName;
	private String password;
	private String userType;
	//private String isLoggedIn;
	//private String errorMsg;
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
