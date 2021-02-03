package com.capgemini.spring.boot.hateoas.propuesto.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.spring.boot.hateoas.propuesto.hateoas.TeamHal;
import com.capgemini.spring.boot.hateoas.propuesto.model.dto.TeamDto;
import com.capgemini.spring.boot.hateoas.propuesto.model.repositories.TeamRepository;
import com.capgemini.spring.boot.hateoas.propuesto.utilities.ConvertEntityDto;


@RestController
@RequestMapping("/teams")
public class TeamRest {

	@Autowired
	private TeamRepository repository;
	
	@GetMapping("")
	public List<TeamDto> findAll() {
		List<TeamDto> listDto = new ArrayList<TeamDto>();

		repository.findAll().forEach((entity) -> {
			TeamDto dto = ConvertEntityDto.fromTEntityToTDto(entity);

			TeamHal.linkSelf(dto);
			
			listDto.add(dto);
		});
		
		return listDto;
	}
}
