package com.demo.intro.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Workout implements Serializable {

	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String type;
	private int duarationInMinutes;
	private int caloriesBurned;
	
	
	@ManyToOne
	private Userrr userrr;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getDuarationInMinutes() {
		return duarationInMinutes;
	}


	public void setDuarationInMinutes(int duarationInMinutes) {
		this.duarationInMinutes = duarationInMinutes;
	}


	public int getCaloriesBurned() {
		return caloriesBurned;
	}


	public void setCaloriesBurned(int caloriesBurned) {
		this.caloriesBurned = caloriesBurned;
	}


	public Userrr getUserrr() {
		return userrr;
	}


	public void setUserrr(Userrr userrr) {
		this.userrr = userrr;
	}
	
	
	
}
