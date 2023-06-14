package com.bollettini.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bollettini.entities.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Integer> {

}
