package com.atguigu.polymorphism;

public class Circle extends Graphic{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	//圆求面积的方法
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
}