package com.capgemini.collectionClasses;

public class Laptop {
	private String company;
	private String model;
	private String operatingSystem;
	private String processor;
	public Laptop(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	
}
