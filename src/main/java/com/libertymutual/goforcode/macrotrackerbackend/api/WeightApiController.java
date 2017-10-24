package com.libertymutual.goforcode.macrotrackerbackend.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libertymutual.goforcode.macrotrackerbackend.models.WeightEntry;
import com.libertymutual.goforcode.macrotrackerbackend.repositories.WeightRepository;

@RestController
@RequestMapping("/api/weight")
public class WeightApiController {

	private WeightRepository weightRepo;

	public WeightApiController(WeightRepository weightRepo) {
		this.weightRepo = weightRepo;
	}

	@GetMapping("")
	public List<WeightEntry> getAll(){
		try {
		List<WeightEntry> weightEntries = weightRepo.findAll();
		return weightEntries;
		} catch (Exception e) {
			System.err.println(e.getClass().getName());
			return null;
		}
		
		
	}

	@PostMapping("")
	public WeightEntry create(@RequestBody WeightEntry macroEntry) {
		System.out.println("create ran");
		return weightRepo.save(macroEntry);

	}
}
