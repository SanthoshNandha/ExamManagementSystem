package entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="IdCount")
public class IdCount {
	
	private int userIdCount;
	private int courseIdCount;
	private int examIdCount;
	private int questionIdCount;
	private int testIdCount;
	public int getUserIdCount() {
		return userIdCount;
	}
	public void setUserIdCount(int userIdCount) {
		this.userIdCount = userIdCount;
	}
	public int getCourseIdCount() {
		return courseIdCount;
	}
	public void setCourseIdCount(int courseIdCount) {
		this.courseIdCount = courseIdCount;
	}
	public int getExamIdCount() {
		return examIdCount;
	}
	public void setExamIdCount(int examIdCount) {
		this.examIdCount = examIdCount;
	}
	public int getQuestionIdCount() {
		return questionIdCount;
	}
	public void setQuestionIdCount(int questionIdCount) {
		this.questionIdCount = questionIdCount;
	}
	public int getTestIdCount() {
		return testIdCount;
	}
	public void setTestIdCount(int testIdCount) {
		this.testIdCount = testIdCount;
	}

}
