package com.capgemini.spring.boot.hateoas.propuesto.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.spring.boot.hateoas.propuesto.model.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
