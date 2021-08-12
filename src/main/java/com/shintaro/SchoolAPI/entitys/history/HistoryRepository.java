package com.shintaro.SchoolAPI.entitys.history;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;

import com.shintaro.SchoolAPI.generic.Repository;

@org.springframework.stereotype.Repository
public interface HistoryRepository extends Repository<HistoryEntity> {
	
	@Query("select h from HistoryEntity h where teacher_id = ?1")
	List<HistoryEntity> findByTeacher(String id); 
	
}
