package com.atguigu.polymorphism.exer;

//5、MyDate是有年，月，日属性的类型，有getInfo（）返回  xxxx年xx月xx日
public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate() {
		super();
	}

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getInfo() {
		return year + "年" + month + "月" + day + "日";
	}
}
