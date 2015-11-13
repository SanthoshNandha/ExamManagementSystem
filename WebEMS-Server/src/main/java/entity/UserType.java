package entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserType")
public class UserType {
	
	private String UserTypeId;
	private String UserTypeName;
	
	public String getUserTypeId() {
		return UserTypeId;
	}
	public void setUserTypeId(String userTypeId) {
		UserTypeId = userTypeId;
	}
	public String getUserTypeName() {
		return UserTypeName;
	}
	public void setUserTypeName(String userTypeName) {
		UserTypeName = userTypeName;
	}

}
