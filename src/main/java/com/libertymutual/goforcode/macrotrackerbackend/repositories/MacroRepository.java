package com.libertymutual.goforcode.macrotrackerbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libertymutual.goforcode.macrotrackerbackend.models.DayMacros;

@Repository
public interface MacroRepository extends JpaRepository<DayMacros, Long> {


	
}
