package com.h2demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.h2demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
