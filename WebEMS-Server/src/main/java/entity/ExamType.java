package entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ExamType")
public class ExamType {
	
	private String examTypeId;
	private String examTypeName;
	private String description;
	
	public String getExamTypeId() {
		return examTypeId;
	}
	public void setExamTypeId(String examTypeId) {
		this.examTypeId = examTypeId;
	}
	public String getExamTypeName() {
		return examTypeName;
	}
	public void setExamTypeName(String examTypeName) {
		this.examTypeName = examTypeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	

}
