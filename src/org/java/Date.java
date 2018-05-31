package org.java;

public class Date {
	int month;
	int year;
	int day;
	public Date()
	{
		
	}
	public Date( int day,int year,int month) {
		this.day = day;
		this.year = year;
		this.month = month;
		
		
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
public void displayDate() {
	System.out.println(day+"/"+month+"/"+year);
}
}
