package com.shintaro.SchoolAPI.entitys.grade;

import com.shintaro.SchoolAPI.generic.Service;

@org.springframework.stereotype.Service
public class GradeService extends Service<GradeEntity,GradeRepository>{

	protected GradeService(GradeRepository repository) {
		super(repository);
	}
	
}
