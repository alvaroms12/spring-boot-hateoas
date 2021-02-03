package com.capgemini.spring.boot.hateoas.propuesto.hateoas;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import com.capgemini.spring.boot.hateoas.propuesto.model.dto.TeamDto;
import com.capgemini.spring.boot.hateoas.propuesto.services.TeamRest;


public class TeamHal {

	public static void linkSelf(TeamDto dto) {

		Link link = WebMvcLinkBuilder.linkTo(TeamRest.class).slash(dto.getId()).withSelfRel();

		dto.add(link);
	}

}
