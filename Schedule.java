package com.src.AirWay.TravellingandBooking;

public class Schedule {
	private int day;
	private int hour;
	private int minute;
	
	public Schedule(int day,int hour,int minute) {
		this.day=day;
		this.hour=hour;
		this.minute=minute;
		
	}
	public int getDay() {
		return day;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
}
