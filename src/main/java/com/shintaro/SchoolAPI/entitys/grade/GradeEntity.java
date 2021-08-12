package com.shintaro.SchoolAPI.entitys.grade;

import java.util.Date;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.shintaro.SchoolAPI.generic.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@javax.persistence.Entity
@Table(name = "Grade")
public class GradeEntity extends Entity{

	@NotNull
	private String description;
	
	@NotNull
	private float grade;
	
}
