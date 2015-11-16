package entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "StudentAnswer")
public class StudentAnswer {
	
	//private String testId;
	private String questionId;
	private int questionNo;
	private String answeredChoice;
	private boolean isCorrect;
	private float points;
	
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public int getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}
	public String getAnsweredChoice() {
		return answeredChoice;
	}
	public void setAnsweredChoice(String answeredChoice) {
		this.answeredChoice = answeredChoice;
	}
	public boolean getIsCorrect() {
		return isCorrect;
	}
	public void setIsCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	public float getPoints() {
		return points;
	}
	public void setPoints(float points) {
		this.points = points;
	}
	

}
