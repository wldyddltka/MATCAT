package com.greedy.member.views;

import java.util.List;

import com.greedy.member.model.dto.ScheduleDTO;

public class PrintResult {

	public void printMenuList(List<ScheduleDTO> scheduleList) {
		for(ScheduleDTO s : scheduleList) {
			System.out.println(s);
		}
	}
	public void printMenu(ScheduleDTO schedule) {
		System.out.println(schedule);
	}


	public void printErrorMessage(String errorCode) {
		String errorMessage = "";
		switch(errorCode) {
		case "selectList" : errorMessage = "스케줄 목록 조회에 실패하였습니다."; break;
		case "selectOne" : errorMessage = "스케줄 조회에 실패하였습니다." ; break;
		case "insert" : errorMessage = "스케줄 등록에 실패하였습니다."; break;
		case "update" : errorMessage = "스케줄 수정에 실패하였습니다."; break;	
		case "delete" : errorMessage = "스케줄 삭제에 실패하였습니다."; break;
		}
		System.out.println(errorMessage);
	}
	
	public void printSuccessMessage(String successCode) {
		String successMessage = "";
		switch(successCode) {
		case "insert" : successMessage = "스케줄 등록에 성공하였습니다." ; break;
		case "update" : successMessage = "스케줄 수정에 성공하였습니다." ; break;
		case "delete" : successMessage = "스케줄 삭제에 성공하였습니다." ; break;
		}
		
		System.out.println(successMessage);
		
	}


}
