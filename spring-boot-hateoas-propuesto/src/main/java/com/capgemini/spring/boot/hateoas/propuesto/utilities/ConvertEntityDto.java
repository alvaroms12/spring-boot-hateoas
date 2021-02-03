package com.capgemini.spring.boot.hateoas.propuesto.utilities;

import com.capgemini.spring.boot.hateoas.propuesto.model.dto.PlayerDto;
import com.capgemini.spring.boot.hateoas.propuesto.model.dto.TeamDto;
import com.capgemini.spring.boot.hateoas.propuesto.model.entities.Player;
import com.capgemini.spring.boot.hateoas.propuesto.model.entities.Team;

public class ConvertEntityDto {
	public static TeamDto fromTEntityToTDto(Team entity) {

		TeamDto dto = new TeamDto();

		dto.setId(entity.getIdTeam());
		dto.setName(entity.getName());
		dto.setStadium(entity.getStadium());

		return dto;
	}

	public static Team fromTDtoToTEntity(TeamDto dto) {
		return null;
	}

	public static PlayerDto fromPEntityToPDto(Player entity) {
		PlayerDto dto = new PlayerDto();

		dto.setId(entity.getIdPlayer());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());

		TeamDto teamDto = new TeamDto(entity.getTeam().getIdTeam(), entity.getTeam().getName(),
				entity.getTeam().getStadium());

		dto.setTeam(teamDto);

		return dto;
	}

	public static Player fromPDtoToPEntity(PlayerDto dto) {
		return null;
	}
}
