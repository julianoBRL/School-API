package com.shintaro.SchoolAPI.entitys.room;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.shintaro.SchoolAPI.generic.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@javax.persistence.Entity
@Table(name = "Room")
public class RoomEntity extends Entity{
	
	@NotNull
	private char category;
	
	@NotNull
	private int serie;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private RoomPeriodType period;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private RoomType type;

}
