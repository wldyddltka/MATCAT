package com.greedy.member.model.dao;

import java.util.List;

import com.greedy.common.SearchCriteria;
import com.greedy.member.model.dto.ScheduleDTO;

public interface SqlMapper {

	List<ScheduleDTO> selectAllMenu();

	int insertSchedule(ScheduleDTO DTO);

	List<ScheduleDTO> searchByThis(SearchCriteria parameter);

	int modifySchedule(ScheduleDTO DTO);

	int deleteSchedule(Integer delete);

}
