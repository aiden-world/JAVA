package com.atguigu.bean;

public class Box {
	private double length ;
    private double width  ;
    private double height ;
    
    public Box() {}
	public Box(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
    

	public double  getVolume() {
		return this.length*this.height*this.width ;
	}
    
	public void getInfo() {
		System.out.println("������ĳ�Ϊ"+this.getLength()+"  ������Ŀ�Ϊ"+this.getWidth()
				+"  ������ĸ�Ϊ"+this.getHeight()+"����������Ϊ"+this.getVolume());
	}
    
    
}
