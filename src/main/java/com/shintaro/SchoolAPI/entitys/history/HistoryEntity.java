package com.shintaro.SchoolAPI.entitys.history;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.shintaro.SchoolAPI.entitys.bimester.BimesterEntity;
import com.shintaro.SchoolAPI.entitys.grade.GradeEntity;
import com.shintaro.SchoolAPI.entitys.room.RoomEntity;
import com.shintaro.SchoolAPI.entitys.subject.SubjectEntity;
import com.shintaro.SchoolAPI.entitys.user.UserEntity;
import com.shintaro.SchoolAPI.generic.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@javax.persistence.Entity
@Table(name = "History")
public class HistoryEntity extends Entity {

	@NotNull
	@OneToOne
	private UserEntity student;
	
	@NotNull
	@OneToOne
	private UserEntity teacher;
	
	@NotNull
	@OneToOne
	private RoomEntity room;
	
	@ManyToMany
	private List<GradeEntity> grades;
	
	@NotNull
	@OneToOne
	private BimesterEntity bimester;
	
	@NotNull
	@OneToOne
	private SubjectEntity subject;
	
	@NotNull
	private int year;
	
}
