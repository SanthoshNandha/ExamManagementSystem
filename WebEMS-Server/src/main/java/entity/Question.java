package entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Question")
public class Question {
	
	private String questionId;
	private String questionTypeId;
	private String questionText;
	private String choice1;
	private String choice2;
	private String choice3;
	private String choice4;
	private String choice5;
	private String answer;
	private float point;
	//private String questionduration;
	private String difficultylevelid;
	private String courseId;
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public void setPoint(float point) {
		this.point = point;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestionTypeId() {
		return questionTypeId;
	}
	public void setQuestionTypeId(String questionTypeId) {
		this.questionTypeId = questionTypeId;
	}
	
	public String getChoice1() {
		return choice1;
	}
	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}
	public String getChoice2() {
		return choice2;
	}
	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}
	public String getChoice3() {
		return choice3;
	}
	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}
	public String getChoice4() {
		return choice4;
	}
	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}
	public String getChoice5() {
		return choice5;
	}
	public void setChoice5(String choice5) {
		this.choice5 = choice5;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Float getPoint() {
		return point;
	}
	public void setPoint(Float point) {
		this.point = point;
	}
	
	public String getDifficultylevelid() {
		return difficultylevelid;
	}
	public void setDifficultylevelid(String difficultylevelid) {
		this.difficultylevelid = difficultylevelid;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	

}
