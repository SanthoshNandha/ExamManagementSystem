package entity;

public class StudentAnswer {
	
	private String testId;
	private String questionId;
	private String questionNo;
	private String answeredChoice;
	private String isCorrect;
	private String points;
	
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(String questionNo) {
		this.questionNo = questionNo;
	}
	public String getAnsweredChoice() {
		return answeredChoice;
	}
	public void setAnsweredChoice(String answeredChoice) {
		this.answeredChoice = answeredChoice;
	}
	public String getIsCorrect() {
		return isCorrect;
	}
	public void setIsCorrect(String isCorrect) {
		this.isCorrect = isCorrect;
	}
	public String getPoints() {
		return points;
	}
	public void setPoints(String points) {
		this.points = points;
	}
	

}
