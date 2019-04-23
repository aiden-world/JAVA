package com.atguigu.polymorphism;

public class Rectangle extends Graphic{
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public Rectangle() {
		super();
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	//求矩形面积
	public double getArea() {
		return length * width;
	}
	
}