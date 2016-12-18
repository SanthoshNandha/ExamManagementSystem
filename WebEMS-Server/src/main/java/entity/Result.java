package entity;

public class Result {
   private String status="Failure";
   private String authError="Error:Invalid Username/Password";
   private String authUserId;
   private String authUserType;
   private String errorMsg;
   private float testScore;
   private String testId;
   private String userId;
   
   public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

public String getTestId() {
	return testId;
}

public void setTestId(String testId) {
	this.testId = testId;
}

public float getTestScore() {
	return testScore;
}

public void setTestScore(float testScore) {
	this.testScore = testScore;
}

public String getErrorMsg() {
	return errorMsg;
}

public void setErrorMsg(String errorMsg) {
	this.errorMsg = errorMsg;
}

public String getAuthUserType() {
	return authUserType;
}

public void setAuthUserType(String authUserType) {
	this.authUserType = authUserType;
}

public String getAuthUserId() {
	return authUserId;
}

public void setAuthUserId(String authUserId) {
	this.authUserId = authUserId;
}

public String getAuthError() {
	return authError;
}

public void setAuthError(String authError) {
	this.authError = authError;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}
}
