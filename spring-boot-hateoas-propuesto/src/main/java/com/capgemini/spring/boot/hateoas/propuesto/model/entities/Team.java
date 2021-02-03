package com.capgemini.spring.boot.hateoas.propuesto.model.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_team")
	private Integer idTeam;

	@Basic(optional = false)
	private String name;

	@Basic(optional = false)
	private String stadium;

	@Basic(optional = true)
	private Integer capacity;

	public Integer getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(Integer idTeam) {
		this.idTeam = idTeam;
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

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Team [idTeam=" + idTeam + ", name=" + name + ", stadium=" + stadium + ", capacity=" + capacity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTeam == null) ? 0 : idTeam.hashCode());
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
		Team other = (Team) obj;
		if (idTeam == null) {
			if (other.idTeam != null)
				return false;
		} else if (!idTeam.equals(other.idTeam))
			return false;
		return true;
	}
}
