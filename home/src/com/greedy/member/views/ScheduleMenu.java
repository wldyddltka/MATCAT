package com.greedy.member.views;

import java.util.Scanner;

import com.greedy.common.SearchCriteria;
import com.greedy.member.Controller.ScheduleController;
import com.greedy.member.model.dto.ScheduleDTO;

public class ScheduleMenu {

	private Scanner sc = new Scanner(System.in);
	private ScheduleDTO good;
	private SearchCriteria search;
	public void displayMenu() {
		
		ScheduleController SC = new ScheduleController();
		
		do {
			
			System.out.println("나를 위한 스케줄 관리 프로그램");
			System.out.println("1. 전체 스케줄 조회");
			System.out.println("2. 새 스케줄 추가");
			System.out.println("3. 스케줄 검색");
			System.out.println("4. 스케줄 수정");
			System.out.println("5. 스케줄 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("번호를 입력하세요 : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 : SC.selectAllSchedule() ; break;
			case 2 : SC.insertSchedule(inputSchedule()) ; break;
			case 3 : SC.searchByThis(searchSchedule()) ; break;
			case 4 : SC.modifySchedule(choiceSchedule()) ; break;
			case 5 : SC.deleteSchedule(delete()) ; break;
			case 0 : return;
			}
		} while(true);
		
		
	}

	private Integer delete() {
		System.out.print("삭제할 스케줄의 코드를 입력해주세요 : ");
		int code = sc.nextInt();
		return code;
	}

	private ScheduleDTO choiceSchedule() {
		ScheduleController SC = new ScheduleController();
		System.out.println("내 스케줄을 수정해봅시다.");
		SC.selectAllSchedule();
		System.out.printf("이 중에서 몇번을 수정할건가요? %n코드로 입력해주세요! : ");
		int code = sc.nextInt();
		sc.nextLine();
		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();
		System.out.print("수정할 날짜 : ");
		String date = sc.nextLine();
		System.out.print("수정할 시간 : ");
		String time = sc.nextLine();
		System.out.print("수정할 금액 : ");
		int pay = sc.nextInt();
		System.out.print("수정할 상위 카테고리 코드 : ");
		int categoryCode = sc.nextInt();
		sc.nextLine();
		System.out.print("수정할 특이사항 : ");
		String note = sc.nextLine();
		
		good = new ScheduleDTO(code, name, date, time, pay, categoryCode , note);
		
		return good;
	}

	private SearchCriteria searchSchedule() {
		sc.nextLine();
		System.out.println("내 스케줄을 검색해보자구요 !");
		System.out.println("어떤걸로 찾아볼까요 ? ");
		System.out.println("행사 이름, 요일 , 연주 , 레슨 ");
		System.out.print("넷중에 하나 입력해주세요 : ");
		String condition = sc.nextLine();
		String value = "";
		if(condition.equals("행사 이름")) {
		System.out.print("검색어는요 ? :");
		value = sc.nextLine();
		}
		if(condition.equals("요일")) {
		System.out.print("무슨 요일 ? : ");
		value=sc.nextLine();
		}
		
		search = new SearchCriteria(condition , value);
		
		return search;
	}

	private ScheduleDTO inputSchedule() {
		sc.nextLine();
		System.out.println("스케줄 추가 시스템!");
		System.out.println("시간과 날짜는 아직 모르면 입력 안해도 괜찮음");
		System.out.print("추가할 행사 이름 ? : ");
		String name = sc.nextLine();
		System.out.print("추가할 행사 날짜 ? : ");
		String date = sc.nextLine();
		System.out.print("추가할 행사 시간 ? : ");
		String time = sc.nextLine();
		System.out.print("얼마준대? : ");
		int pay = sc.nextInt();
		System.out.print("연주=1, 레슨=2 : ");
		int no = sc.nextInt();
		int categoryCode = 0;
		switch(no) {
		case 1 : System.out.print("정기=5 , 비정기=6 입력해 : ");categoryCode = sc.nextInt(); break;
		case 2 : System.out.print("방과후=7 , 새끼레슨 =8 , 취미생 레슨=9 입력해 : ");categoryCode = sc.nextInt(); break;
		}
		sc.nextLine();
		System.out.print("추가로 할 말 : ");
		String note = sc.nextLine();
		
		good = new ScheduleDTO(0,name,date,time,pay,categoryCode,note);
		
		return good;
	}
	
}
