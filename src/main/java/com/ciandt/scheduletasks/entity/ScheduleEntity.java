package com.ciandt.scheduletasks.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ScheduleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	Long idSchedule;
	
	Date date;
	
	Long time;
	
	public ScheduleEntity() {
		
	}

	public Long getIdSchedule() {
		return idSchedule;
	}

	public void setIdSchedule(Long idSchedule) {
		this.idSchedule = idSchedule;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSchedule == null) ? 0 : idSchedule.hashCode());
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
		ScheduleEntity other = (ScheduleEntity) obj;
		if (idSchedule == null) {
			if (other.idSchedule != null)
				return false;
		} else if (!idSchedule.equals(other.idSchedule))
			return false;
		return true;
	}
	
	
	
	
	
}
