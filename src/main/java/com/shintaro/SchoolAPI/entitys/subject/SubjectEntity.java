package com.shintaro.SchoolAPI.entitys.subject;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.shintaro.SchoolAPI.generic.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@javax.persistence.Entity
@Table(name = "Subject")
public class SubjectEntity extends Entity {
	
	@NotNull
	private String initials;
	
	@NotNull String fullName;

}
