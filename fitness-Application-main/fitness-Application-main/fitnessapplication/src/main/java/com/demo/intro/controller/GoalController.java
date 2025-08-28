package com.demo.intro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.intro.model.Goal;
import com.demo.intro.model.Userrr;
import com.demo.intro.repository.GoalRepository;
import com.demo.intro.repository.UserrrRepository;

@RestController
@RequestMapping("/api/goals")
public class GoalController {

	@Autowired
	private UserrrRepository userrrRepository;
	
	@Autowired
	private GoalRepository goalRepository;
	
	@PostMapping
    public Goal setGoal(@RequestBody Goal goal) {
		Long userId = goal.getUserrr().getId();
	    Userrr userrr = userrrRepository.findById(userId)
	        .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));

	    goal.setUserrr(userrr); 
        return goalRepository.save(goal);
    }
    @GetMapping("/user/{userId}")
    public List<Goal> getGoals(@PathVariable Long userId) {
        return goalRepository.findByUserrrId(userId);
    }
}
