package com.demo.intro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.intro.model.Goal;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Long> {

	
	List<Goal> findByUserrrId(Long userrrid);
}
