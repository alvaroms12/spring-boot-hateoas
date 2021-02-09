package com.capgemini.spring.boot.hateoas.propuesto.hateoas;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import com.capgemini.spring.boot.hateoas.propuesto.model.dto.PlayerDto;
import com.capgemini.spring.boot.hateoas.propuesto.model.dto.TeamDto;
import com.capgemini.spring.boot.hateoas.propuesto.services.PlayerRest;


public class PlayerHal {

	public static void linkSelf(PlayerDto dto) {
		
		Link link = WebMvcLinkBuilder.linkTo(PlayerRest.class).slash(dto.getId()).withSelfRel();
		
		dto.add(link);
	}
	
	public static void linkPlayersTeam(TeamDto dto, Integer idTeam) {
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(PlayerRest.class).findByTeam(idTeam)).withRel("/players/" + idTeam);
		dto.add(link);
	}
	
	public static void linkAllPlayers(TeamDto dto) {
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(PlayerRest.class).findAll()).withRel("players");
		dto.add(link);
	}
}
