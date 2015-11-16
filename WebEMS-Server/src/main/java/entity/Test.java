package entity;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Test")
public class Test {
	
	private String testId;
	private String proctor_Id;
	private String start_Time;
	private String End_Time;
	//private String totalTime;
	//private String ended;
	private float studentscore;
	private float totalScore;
	private float percentage;
	private boolean isPass;
	private ArrayList<StudentAnswer> studentAnswers;
	
	public float getStudentscore() {
		return studentscore;
	}
	public void setStudentscore(float studentscore) {
		this.studentscore = studentscore;
	}
	public float getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(float totalScore) {
		this.totalScore = totalScore;
	}
	public void setPass(boolean isPass) {
		this.isPass = isPass;
	}
	
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
	
	
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public boolean getIsPass() {
		return isPass;
	}
	public void setIsPass(boolean isPass) {
		this.isPass = isPass;
	}
	public ArrayList<StudentAnswer> getStudentAnswers() {
		return studentAnswers;
	}
	public void setStudentAnswers(ArrayList<StudentAnswer> studentAnswers) {
		this.studentAnswers = studentAnswers;
	}
	
}
