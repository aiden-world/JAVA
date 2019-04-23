package com.atguigu.polymorphism.exer;

import java.util.Scanner;

/*
 * 4、声明一个员工数组，存储各种员工，并遍历显示他们的实发工资，
	并计算工资总额
	
	//6、如果本月（从键盘输入）是生日月，多发100
 */
public class TestEmployee {

	public static void main(String[] args) {
		Employee[] arr = new Employee[3];
		
		Scanner input = new Scanner(System.in);
		System.out.print("请输入当前月份：");
		int mon = input.nextInt();
		
		//存储员工对象
		//new MyDate(1990, 12, 12)匿名对象
		arr[0] = new SalaryEmployee("小崔", new MyDate(1990, 12, 12), 10000, 22, 5);
		arr[1] = new SalaryEmployee("小张", 1995, 3, 8, 12000, 22, 0);
		arr[2] = new HourEmployee("小李", new MyDate(1992, 3, 4), 0, 50, 30);
		
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getBirthday().getMonth() == mon){
				System.out.println(arr[i].getName() + "实发工资：" + (arr[i].earning()+100));
				sum += arr[i].earning() +100;
			}else{
				System.out.println(arr[i].getName() + "实发工资：" + arr[i].earning());
				sum += arr[i].earning();
			}
			
		}
		System.out.println("工资总额：" + sum);
	}

}
 