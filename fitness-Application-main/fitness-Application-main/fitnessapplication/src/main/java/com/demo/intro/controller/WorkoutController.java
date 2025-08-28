package com.demo.intro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.intro.model.Userrr;
import com.demo.intro.model.Workout;
import com.demo.intro.repository.UserrrRepository;
import com.demo.intro.repository.WorkoutRepository;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

	@Autowired
	private UserrrRepository userrrRepository;
	
	@Autowired
	private WorkoutRepository workoutRepository;
	

    @PostMapping
    public Workout logWorkout(@RequestBody Workout workout) {
    	Long userId = workout.getUserrr().getId();
	    Userrr userrr = userrrRepository.findById(userId)
	        .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
	    workout.setUserrr(userrr);
        return workoutRepository.save(workout);
    }
    
    @GetMapping("/user/{userId}")
    public List<Workout> getWorkouts(@PathVariable Long userId) {
        return workoutRepository.findByUserrrId(userId);
    }
}
