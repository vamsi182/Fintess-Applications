package com.demo.intro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.intro.model.Userrr;

public interface UserrrRepository  extends JpaRepository<Userrr , Long>{
Userrr findByUsername(String name);
}
