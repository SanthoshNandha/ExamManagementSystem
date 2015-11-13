package entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Sem")
public class Sem {
	
	private String semName;
	private int year;
	
	public String getSemName() {
		return semName;
	}
	public void setSemName(String semName) {
		this.semName = semName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
