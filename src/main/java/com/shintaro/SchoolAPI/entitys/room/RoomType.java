package com.shintaro.SchoolAPI.entitys.room;

public enum RoomType {
	KINDERGARTEN("kindergarten"),
	ELEMENTARY_SCHOOL("elementary School"),
	HIGH_SCHOOL("high school"),
	COLLEGE("college");
	
	String definition;
	
	RoomType(String definition){
		this.definition = definition;
	}
	
	@Override
	public String toString() {
		return definition;
	}
}
