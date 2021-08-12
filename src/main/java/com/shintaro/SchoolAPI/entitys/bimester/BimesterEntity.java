package com.shintaro.SchoolAPI.entitys.bimester;

import java.util.Date;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.shintaro.SchoolAPI.generic.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@javax.persistence.Entity
@Table(name = "Bimester")
public class BimesterEntity extends Entity {

	@NotNull
	private int bimester;
	
	@NotNull
	private String title;
	
	@NotNull
	private Date initialDate;
	
	@NotNull
	private Date endDate;
	
}
