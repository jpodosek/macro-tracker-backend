package com.libertymutual.goforcode.macrotrackerbackend.api;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libertymutual.goforcode.macrotrackerbackend.models.DayMacros;
import com.libertymutual.goforcode.macrotrackerbackend.models.DayMacrosDto;
import com.libertymutual.goforcode.macrotrackerbackend.models.WeekMacros;
import com.libertymutual.goforcode.macrotrackerbackend.repositories.MacroRepository;

@RestController
@RequestMapping("/api/macro")
public class MacroApiController {

	private MacroRepository macroRepo;

	public MacroApiController(MacroRepository macroRepo) {
		this.macroRepo = macroRepo;
	}

	@GetMapping("")
	public List<DayMacros> getCurrentWeek() {
		try {
			List<DayMacros> weekMacros = macroRepo.findAll();
			return weekMacros;
		} catch (Exception e) {
			System.err.println(e.getClass().getName());
			return null;
		}

	}

	@PostMapping("")
	public List<DayMacrosDto> setCurrentWeek(@RequestBody ArrayList<DayMacrosDto> weeklyMacros) {
		if (weeklyMacros != null) {
			try {
				for (DayMacrosDto dayJSON : weeklyMacros) {
					DayMacros d = new DayMacros(dayJSON.getCarbMacroInput(), dayJSON.getFatMacroInput(),
							dayJSON.getProteinMacroInput(), dayJSON.getCarbVariance(), dayJSON.getFatVariance());
					macroRepo.save(d);
				}
				return weeklyMacros;
			} catch (Exception e) {
				System.err.println("Saving error: " + e.getClass().getName());
			}
		}
		return null;
	}

}
