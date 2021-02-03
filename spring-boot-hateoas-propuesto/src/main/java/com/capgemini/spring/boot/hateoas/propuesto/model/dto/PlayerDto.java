package com.capgemini.spring.boot.hateoas.propuesto.model.dto;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;



public class PlayerDto extends RepresentationModel<PlayerDto> implements Serializable {

	private static final long serialVersionUID = 123456789L;

	private Integer id;

	private String firstName;

	private String lastName;

	private TeamDto team;

	public Integer getId() {
		return id;
	}

	public void setId(Integer idPlayer) {
		this.id = idPlayer;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public TeamDto getTeam() {
		return team;
	}

	public void setTeam(TeamDto team) {
		this.team = team;
	}

	public PlayerDto() {
		super();
	}

	public PlayerDto(Integer idPlayer, String firstName, String lastName, TeamDto team) {
		super();
		this.id = idPlayer;
		this.firstName = firstName;
		this.lastName = lastName;
		this.team = team;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayerDto other = (PlayerDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
