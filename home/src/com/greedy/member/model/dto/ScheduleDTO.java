package com.greedy.member.model.dto;

public class ScheduleDTO {

	private int scheduleCode;
	private String scheduleName;
	private String scheduleDate;
	private String scheduleTime;
	private int schedulePay;
	private int categoryCode;
	private String scheduleNote;
	
	public ScheduleDTO() {}

	public ScheduleDTO(int scheduleCode, String scheduleName, String scheduleDate, String scheduleTime, int schedulePay,
			int categoryCode, String scheduleNote) {
		super();
		this.scheduleCode = scheduleCode;
		this.scheduleName = scheduleName;
		this.scheduleDate = scheduleDate;
		this.scheduleTime = scheduleTime;
		this.schedulePay = schedulePay;
		this.categoryCode = categoryCode;
		this.scheduleNote = scheduleNote;
	}

	public int getScheduleCode() {
		return scheduleCode;
	}

	public void setScheduleCode(int scheduleCode) {
		this.scheduleCode = scheduleCode;
	}

	public String getScheduleName() {
		return scheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}

	public String getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public int getSchedulePay() {
		return schedulePay;
	}

	public void setSchedulePay(int schedulePay) {
		this.schedulePay = schedulePay;
	}

	public int getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getScheduleNote() {
		return scheduleNote;
	}

	public void setScheduleNote(String scheduleNote) {
		this.scheduleNote = scheduleNote;
	}

	@Override
	public String toString() {
		return "ScheduleDTO [scheduleCode=" + scheduleCode + ", scheduleName=" + scheduleName + ", scheduleDate="
				+ scheduleDate + ", scheduleTime=" + scheduleTime + ", schedulePay=" + schedulePay + ", categoryCode="
				+ categoryCode + ", scheduleNote=" + scheduleNote + "]";
	}
	
	
}
