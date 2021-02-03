package com.capgemini.spring.boot.hateoas.propuesto.model.dto;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;


public class TeamDto extends RepresentationModel<TeamDto> implements Serializable {

	private static final long serialVersionUID = 987654321L;

	private Integer id;

	private String name;

	private String stadium;

	public Integer getId() {
		return id;
	}

	public void setId(Integer idTeam) {
		this.id = idTeam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
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
		TeamDto other = (TeamDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public TeamDto() {

	}

	public TeamDto(Integer idTeam, String name, String stadium) {
		this.id = idTeam;
		this.name = name;
		this.stadium = stadium;
	}

}
