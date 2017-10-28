package com.libertymutual.goforcode.macrotrackerbackend.models;

import java.util.List;

public class WeekMacros {
	
	private List<DayMacrosDto> week;
	
	public WeekMacros() {
	}

	public List<DayMacrosDto> getWeek() {
		return week;
	}

	public void setWeek(List<DayMacrosDto> week) {
		this.week = week;
	}

}
