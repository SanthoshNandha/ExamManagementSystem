package entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Question")
public class Question {
	
	private String questionId;
	private String question;
	private String[] choices;
	private String answer;
	private float point;
	private String courseId;
	
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[] getChoices() {
		return choices;
	}
	public void setChoices(String[] choices) {
		this.choices = choices;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public float getPoint() {
		return point;
	}
	public void setPoint(float point) {
		this.point = point;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
}
