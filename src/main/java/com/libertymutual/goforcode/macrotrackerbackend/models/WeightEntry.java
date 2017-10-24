package com.libertymutual.goforcode.macrotrackerbackend.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class WeightEntry {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=true)
	private String date;
	
	@Column(nullable = false)
	private double bodyweight;
	
	@Column(nullable=true)
	private double avgBodyweight;
	
	@Column(nullable=true)
	private double changeBodyweight;
	
	@Column(nullable=true)
	private double bodyfat;
	
	@Column(nullable=true)
	private double changeBodyfat;
	
	@Column(length=100, nullable=false)
	private String bodyCompGoal;
	
	@Column(length=100, nullable=false)
	private String macros;
	
	@Column(length=50, nullable=false)
	private String carbCycling;
	
	@Column(length=150, nullable=false)
	private String trainingProgram;
	
	@Column(length=500, nullable=true)
	private String comments;
	
	public WeightEntry() {}
 
public WeightEntry(String date, double bodyweight, double avgBodyweight, double changeBodyweight, double bodyfat, 
		double changeBodyfat, String bodyCompGoal, String macros, String carbCycling, String trainingProgram, String comments ) {
	this.date = date;
	this.bodyweight = bodyweight;
	this.avgBodyweight = avgBodyweight;
	this.changeBodyweight = changeBodyweight;
	this.bodyfat = bodyfat;
	this.changeBodyfat = changeBodyfat;
	this.bodyCompGoal = bodyCompGoal;
	this.macros = macros;
	this.carbCycling = carbCycling;
	this.trainingProgram = trainingProgram;
	this.comments = comments;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public double getBodyweight() {
	return bodyweight;
}

public void setBodyweight(double bodyweight) {
	this.bodyweight = bodyweight;
}

public double getAvgBodyweight() {
	return avgBodyweight;
}

public void setAvgBodyweight(double avgBodyweight) {
	this.avgBodyweight = avgBodyweight;
}

public double getChangeBodyweight() {
	return changeBodyweight;
}

public void setChangeBodyweight(double changeBodyweight) {
	this.changeBodyweight = changeBodyweight;
}

public double getBodyfat() {
	return bodyfat;
}

public void setBodyfat(double bodyfat) {
	this.bodyfat = bodyfat;
}

public double getChangeBodyfat() {
	return changeBodyfat;
}

public void setChangeBodyfat(double changeBodyfat) {
	this.changeBodyfat = changeBodyfat;
}

public String getBodyCompGoal() {
	return bodyCompGoal;
}

public void setBodyCompGoal(String bodyCompGoal) {
	this.bodyCompGoal = bodyCompGoal;
}

public String getMacros() {
	return macros;
}

public void setMacros(String macros) {
	this.macros = macros;
}

public String getCarbCycling() {
	return carbCycling;
}

public void setCarbCycling(String carbCycling) {
	this.carbCycling = carbCycling;
}

public String getTrainingProgram() {
	return trainingProgram;
}

public void setTrainingProgram(String trainingProgram) {
	this.trainingProgram = trainingProgram;
}

public String getComments() {
	return comments;
}

public void setComments(String comments) {
	this.comments = comments;
}



}
