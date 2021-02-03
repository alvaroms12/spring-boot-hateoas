package com.capgemini.spring.boot.hateoas.propuesto.hateoas;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import com.capgemini.spring.boot.hateoas.propuesto.model.dto.PlayerDto;
import com.capgemini.spring.boot.hateoas.propuesto.services.PlayerRest;


public class PlayerHal {

public static void linkSelf(PlayerDto dto) {
		
		Link link = WebMvcLinkBuilder.linkTo(PlayerRest.class).slash(dto.getId()).withSelfRel();
		
		dto.add(link);
	}
}
