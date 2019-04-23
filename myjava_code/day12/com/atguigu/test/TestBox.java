package com.atguigu.test;

import com.atguigu.bean.Box;

public class TestBox {
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(3.2,4.5,5.6);
		b1.setLength(5.1);
		b1.setWidth(6.2);
		b1.setHeight(7.7);
		b1.getInfo();
		b2.getInfo();
	}
}
