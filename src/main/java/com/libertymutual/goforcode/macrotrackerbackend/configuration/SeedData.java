package com.libertymutual.goforcode.macrotrackerbackend.configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.libertymutual.goforcode.macrotrackerbackend.models.DayMacros;
import com.libertymutual.goforcode.macrotrackerbackend.models.DayMacrosDto;
import com.libertymutual.goforcode.macrotrackerbackend.models.WeightEntry;
import com.libertymutual.goforcode.macrotrackerbackend.repositories.MacroRepository;
import com.libertymutual.goforcode.macrotrackerbackend.repositories.WeightRepository;

@Configuration
@Profile("development") //will only load this configuration (bean) if active spring profile is named "development"
public class SeedData {
	
	
	
	public SeedData(WeightRepository weightRepo, MacroRepository macroRepo) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String date = sdf.format(new Date());
		System.out.println(date); //15/10/2013
		
		WeightEntry entry1 = new WeightEntry(date, 175, 174.5, .5, 14, 0, "Fat Loss", 
				"185P/205C/50F (2010)", "No", "5 Day Week Summer Routine", "First entry" );
		
		WeightEntry entry2 = new WeightEntry(date, 180, 178, 2, 0, 0, "Fat Loss", 
				"185P/205C/50F (2010)", "No", "5 Day Week Summer Routine", "First entry" );
		
		weightRepo.save(entry1);
		weightRepo.save(entry2);
		
//		DayMacrosDto macroJSONFromUI = new DayMacrosDto(300, 100, 175, 1, 1, 300, 100, 175, 2800 );
//		DayMacros macroToDatabase = new DayMacros(macroJSONFromUI.getCarbQty(), macroJSONFromUI.getFatQty(), macroJSONFromUI.getProteinQty(), macroJSONFromUI.getCarbVariance(), macroJSONFromUI.getFatVariance()); 
//		macroRepo.save(macroToDatabase);
		
	}

}
