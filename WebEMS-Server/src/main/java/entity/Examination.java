package entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Examination")
public class Examination {
	
	private String examId;
	private String examTypeID;
	private String examName;
	private String desc;
	private String instructions;
	private String duration;
	private String maxScore;
	private String passScore;
	private String numberofQuestions;
	private String defaultAttempts;
	private Date avialableFrom;
	private Date avialableTo;
	private String[] questionIds;
	
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
	public String getExamTypeID() {
		return examTypeID;
	}
	public void setExamTypeID(String examTypeID) {
		this.examTypeID = examTypeID;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String exam_Name) {
		this.examName = exam_Name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getMaxScore() {
		return maxScore;
	}
	public void setMaxScore(String maxScore) {
		this.maxScore = maxScore;
	}
	public String getPassScore() {
		return passScore;
	}
	public void setPassScore(String passScore) {
		this.passScore = passScore;
	}
	public String getNumberofQuestions() {
		return numberofQuestions;
	}
	public void setNumberofQuestions(String numberofQuestions) {
		this.numberofQuestions = numberofQuestions;
	}
	public String getDefaultAttempts() {
		return defaultAttempts;
	}
	public void setDefaultAttempts(String defaultAttempts) {
		this.defaultAttempts = defaultAttempts;
	}
	public Date getAvialableFrom() {
		return avialableFrom;
	}
	public void setAvialableFrom(Date avialableFrom) {
		this.avialableFrom = avialableFrom;
	}
	public Date getAvialableTo() {
		return avialableTo;
	}
	public void setAvialableTo(Date avialableTo) {
		this.avialableTo = avialableTo;
	}
	public String[] getQuestionIds() {
		return questionIds;
	}
	public void setQuestionIds(String[] questionIds) {
		this.questionIds = questionIds;
	}
	
	

}
