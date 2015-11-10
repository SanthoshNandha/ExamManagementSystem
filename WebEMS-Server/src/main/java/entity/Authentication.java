package entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Authentication")
public class Authentication {
	private String id;
	private String userName;
	private String password;
	
	public void setId(String id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	@Override
	  public String toString() {
	    return "Person [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	  }

	public String getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
}
