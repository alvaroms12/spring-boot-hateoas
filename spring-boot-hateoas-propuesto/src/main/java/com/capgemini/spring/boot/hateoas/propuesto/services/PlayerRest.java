package com.capgemini.spring.boot.hateoas.propuesto.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.spring.boot.hateoas.propuesto.hateoas.PlayerHal;
import com.capgemini.spring.boot.hateoas.propuesto.model.dto.PlayerDto;
import com.capgemini.spring.boot.hateoas.propuesto.model.repositories.PlayerRepository;
import com.capgemini.spring.boot.hateoas.propuesto.utilities.ConvertEntityDto;



@RestController
@RequestMapping("/players")
public class PlayerRest {

	@Autowired
	private PlayerRepository repository;
	
	@GetMapping("")
	public List<PlayerDto> findAll() {
		List<PlayerDto> listDto = new ArrayList<PlayerDto>();
		
		repository.findAll().forEach((entity) -> {
			PlayerDto dto = ConvertEntityDto.fromPEntityToPDto(entity);
			
			PlayerHal.linkSelf(dto);
			
			listDto.add(dto);
		});
		
		return listDto;
	}
	
}