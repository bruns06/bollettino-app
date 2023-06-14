package com.bollettini.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bollettini.entities.Bollettino;

public interface BollettinoDAO extends JpaRepository<Bollettino, Integer> {

}
