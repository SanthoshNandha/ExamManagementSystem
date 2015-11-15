package entity;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Course")
public class Course {
	
	private String courseId;
	private String courseName;
	private String courseCode;
	private Sem sem;
	private ArrayList<String> examIds;
	
	
	public ArrayList<String> getExamIds() {
		return examIds;
	}
	public void setExamIds(ArrayList<String> examIds) {
		this.examIds = examIds;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public Sem getSem() {
		return sem;
	}
	public void setSem(Sem sem) {
		this.sem = sem;
	}

}
