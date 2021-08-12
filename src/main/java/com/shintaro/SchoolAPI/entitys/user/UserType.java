package com.shintaro.SchoolAPI.entitys.user;

public enum UserType {
	ADMIN("admin"),
	TEACHER("teacher"),
	STUDENT("studant"),
	SUPPORT("support"),
	SECRETARY("Secretary"),
	FINANTIAL("finantial"),
	RH("rh");
	
	String definition;
	
	UserType(String definition){
		this.definition = definition;
	}
	
	@Override
	public String toString() {
		return definition;
	}
	
}
