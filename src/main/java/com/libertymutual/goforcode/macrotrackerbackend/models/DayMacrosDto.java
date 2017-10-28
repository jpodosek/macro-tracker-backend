package com.libertymutual.goforcode.macrotrackerbackend.models;


public class DayMacrosDto {
	
	private int carbMacroInput;
	private int fatMacroInput;
	private int proteinMacroInput;
	private double carbVariance;
	private double fatVariance;
	private int carbQty;
	private int fatQty;
	private int proteinQty;
	private int dailyCalorieTotal;
	
	public DayMacrosDto() {}
	
	public DayMacrosDto(int carbMacroInput, int fatMacroInput, int proteinMacroInput, double carbVariance,
			 			double fatVariance, int carbQty, int fatQty, int proteinQty, int dailyCalorieTotal) {
		this.carbMacroInput = carbMacroInput;
		this.fatMacroInput = fatMacroInput;
		this.proteinMacroInput = proteinMacroInput;
		this.carbVariance = carbVariance;
		this.fatVariance = fatVariance;
		this.carbQty = carbQty;
		this.fatQty = fatQty;
		this.proteinQty = proteinQty;
		this.dailyCalorieTotal = dailyCalorieTotal;
		
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

	public int getCarbQty() {
		return carbQty;
	}

	public void setCarbQty(int carbQty) {
		this.carbQty = carbQty;
	}

	public int getFatQty() {
		return fatQty;
	}

	public void setFatQty(int fatQty) {
		this.fatQty = fatQty;
	}

	public int getProteinQty() {
		return proteinQty;
	}

	public void setProteinQty(int proteinQty) {
		this.proteinQty = proteinQty;
	}

	public int getDailyCalorieTotal() {
		return dailyCalorieTotal;
	}

	public void setDailyCalorieTotal(int dailyCalorieTotal) {
		this.dailyCalorieTotal = dailyCalorieTotal;
	}

	
}
