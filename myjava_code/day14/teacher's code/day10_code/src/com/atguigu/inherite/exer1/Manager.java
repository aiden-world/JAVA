package com.atguigu.inherite.exer1;

public class Manager extends Employee {
	private double bonus;

	public Manager() {
		super();
	}

	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String getInfo(){
		return super.getInfo() +"，奖金：" + bonus;
	}
	
}
