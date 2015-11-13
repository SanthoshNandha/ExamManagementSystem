package entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Test")
public class Test {
	
	private String testId;
	private String proctor_Id;
	private String start_Time;
	private String End_Time;
	private String totalTime;
	private String ended;
	private String score;
	private String percentage;
	private String isPass;
	private StudentAnswer[] studentAnswers;
	
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getProctor_Id() {
		return proctor_Id;
	}
	public void setProctor_Id(String proctor_Id) {
		this.proctor_Id = proctor_Id;
	}
	public String getStart_Time() {
		return start_Time;
	}
	public void setStart_Time(String start_Time) {
		this.start_Time = start_Time;
	}
	public String getEnd_Time() {
		return End_Time;
	}
	public void setEnd_Time(String end_Time) {
		End_Time = end_Time;
	}
	public String getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}
	public String getEnded() {
		return ended;
	}
	public void setEnded(String ended) {
		this.ended = ended;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getIsPass() {
		return isPass;
	}
	public void setIsPass(String isPass) {
		this.isPass = isPass;
	}
	public StudentAnswer[] getStudentAnswers() {
		return studentAnswers;
	}
	public void setStudentAnswers(StudentAnswer[] studentAnswers) {
		this.studentAnswers = studentAnswers;
	}
	
}
