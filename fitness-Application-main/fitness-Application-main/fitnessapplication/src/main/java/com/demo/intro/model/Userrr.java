package com.demo.intro.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Userrr  implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	private String password;
	
	@OneToMany(mappedBy = "userrr",cascade = CascadeType.ALL)
	private List<Workout> workouts;
	
	
	@OneToMany(mappedBy = "userrr",cascade = CascadeType.ALL)
	private List<Goal> goals;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	 public void setWorkouts(List<Workout> workouts) {
	        this.workouts = workouts;
	        if (workouts != null) {
	            workouts.forEach(w -> w.setUserrr(this));
	        }
	    }
	
	    public void setGoals(List<Goal> goals) {
	        this.goals = goals;
	        if (goals != null) {
	            goals.forEach(g -> g.setUserrr(this));
	        }
	    }
	        
	       
//	
//	
//	public void setWorkouts(List<Workout> workouts) {
//	    this.workouts = workouts;
//	    if (workouts != null) {
//	        for (Workout workout : workouts) {
//	            workout.setUserrr(this);
//	        }
//	    }
//	}
//
//	public void setGoals(List<Goal> goals) {
//	    this.goals = goals;
//	    if (goals != null) {
//	        for (Goal goal : goals) {
//	            goal.setUserrr(this);
//	        }
//	    }
//	}
	    
}