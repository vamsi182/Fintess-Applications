package com.demo.intro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.intro.model.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
List<Workout> findByUserrrId(Long UserId);
}
