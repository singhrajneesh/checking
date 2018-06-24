package com.health.checking.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "diet")
public class DietModal {
	
	@Id
	private String parameter;
	
	private String diet;
	
	public DietModal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DietModal(String parameter, String diet) {
		super();
		this.parameter = parameter;
		this.diet = diet;
	}
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	
}
