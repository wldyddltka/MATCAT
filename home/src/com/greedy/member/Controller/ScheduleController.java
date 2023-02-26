package com.greedy.member.Controller;

import java.util.List;
import java.util.Map;

import com.greedy.common.SearchCriteria;
import com.greedy.member.model.dto.ScheduleDTO;
import com.greedy.member.model.service.ScheduleService;
import com.greedy.member.views.PrintResult;

public class ScheduleController {
	
	private final ScheduleService SS;
	private final PrintResult PR;
	
	public ScheduleController() {
		SS = new ScheduleService();
		PR = new PrintResult();
	}
	public void selectAllSchedule() {
		List<ScheduleDTO> scheduleList = SS.selectAllMenu();
		
		if(scheduleList != null) {
			PR.printMenuList(scheduleList);
		} else {
			PR.printErrorMessage("selectList");
		}
	
	}
	public void insertSchedule(ScheduleDTO parameter) {
		
		int result = SS.insertSchedule(parameter);
		
		if(result > 0) {
			PR.printSuccessMessage("insert");
		} else {
			PR.printErrorMessage("insert");
		}
	}
	public void searchByThis(SearchCriteria parameter) {
		
		List<ScheduleDTO> list = SS.searchByThis(parameter);
		
		if(!list.isEmpty()) {
			PR.printMenuList(list);
		} else {
			PR.printErrorMessage("selectList");

		}
		
	}
	public void modifySchedule(ScheduleDTO DTO) {
		
		int result = SS.modifySchedule(DTO);
		
		if(result > 0) {
			PR.printSuccessMessage("update");
		} else {
			PR.printErrorMessage("update");
		}
		
	}
	public void deleteSchedule(Integer delete) {
		int result = SS.deleteSchedule(delete);
				
		if(result > 0) {
			PR.printSuccessMessage("delete");
		} else {
			PR.printErrorMessage("delete");
		}
	}

}
