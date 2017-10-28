package com.libertymutual.goforcode.macrotrackerbackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DayMacros {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(length=20, nullable=true)
	private String dayName;
	
	@Column(nullable=false)
	private int carbMacroInput;
	
	@Column(nullable=false)
	private int fatMacroInput;
	
	@Column(nullable=false)
	private int proteinMacroInput;
	
	
	private double carbVariance;
	private double fatVariance;
	
	public DayMacros() {}
	
	public DayMacros(int carbMacroInput, int fatMacroInput, int proteinMacroInput, double carbVariance, double fatVariance) {
		this.carbMacroInput = carbMacroInput;
		this.fatMacroInput = fatMacroInput;
		this.proteinMacroInput = proteinMacroInput;
		this.carbVariance = carbVariance;
		this.fatVariance = fatVariance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	

	public double getCarbVariance() {
		return carbVariance;
	}

	public void setCarbVariance(double carbVariance) {
		this.carbVariance = carbVariance;
	}

	public double getFatVariance() {
		return fatVariance;
	}

	public void setFatVariance(double fatVariance) {
		this.fatVariance = fatVariance;
	}

	public int getCarbMacroInput() {
		return carbMacroInput;
	}

	public void setCarbMacroInput(int carbMacroInput) {
		this.carbMacroInput = carbMacroInput;
	}

	public int getFatMacroInput() {
		return fatMacroInput;
	}

	public void setFatMacroInput(int fatMacroInput) {
		this.fatMacroInput = fatMacroInput;
	}

	public int getProteinMacroInput() {
		return proteinMacroInput;
	}

	public void setProteinMacroInput(int proteinMacroInput) {
		this.proteinMacroInput = proteinMacroInput;
	}
	
	
	

}
