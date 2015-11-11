package entity;

public class Examination {
	
	private String examId;
	private String examTypeID;
	private String exam_Name;
	private String desc;
	private String instructions;
	private String duration;
	private String maxScore;
	private String passScore;
	private String numberofQuestions;
	private String defaultAttempts;
	private String avialableFrom;
	private String avialableTo;
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
	public String getExam_Name() {
		return exam_Name;
	}
	public void setExam_Name(String exam_Name) {
		this.exam_Name = exam_Name;
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
	public String getAvialableFrom() {
		return avialableFrom;
	}
	public void setAvialableFrom(String avialableFrom) {
		this.avialableFrom = avialableFrom;
	}
	public String getAvialableTo() {
		return avialableTo;
	}
	public void setAvialableTo(String avialableTo) {
		this.avialableTo = avialableTo;
	}
	public String[] getQuestionIds() {
		return questionIds;
	}
	public void setQuestionIds(String[] questionIds) {
		this.questionIds = questionIds;
	}
	
	

}
