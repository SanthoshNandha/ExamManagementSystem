package entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "QuestionType")
public class QuestionType {
	
	private String questionTypeId;
	private String questionType;
	
	public String getQuestionTypeId() {
		return questionTypeId;
	}
	public void setQuestionTypeId(String questionTypeId) {
		this.questionTypeId = questionTypeId;
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

}
