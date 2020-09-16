package com.devsuperior.com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.com.devsuperior.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
