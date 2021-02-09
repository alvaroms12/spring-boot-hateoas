package com.capgemini.spring.boot.hateoas.propuesto.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.spring.boot.hateoas.propuesto.model.entities.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

	Team findByName(String name);

	Team findByStadium(String stadium);

}
