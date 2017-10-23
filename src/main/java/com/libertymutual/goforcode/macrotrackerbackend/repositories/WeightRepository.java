package com.libertymutual.goforcode.macrotrackerbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libertymutual.goforcode.macrotrackerbackend.models.WeightEntry;

@Repository
public interface WeightRepository extends JpaRepository<WeightEntry, Long> {

}
