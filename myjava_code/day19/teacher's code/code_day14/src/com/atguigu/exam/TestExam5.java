package com.atguigu.exam;

import java.util.Comparator;

/*
 * 5、假设已知一个接口java.util.Comparator，它有一个抽象方法
int compare(Object o1, Object o2)，要求实现类实现该抽象方法时，按照如下原则：
如果o1大于o2，返回正整数，
如果o1小于o2，返回负整数，
如果o1等于o2，返回0，
用匿名内部类实现这个接口，用于比较两个学生对象，按照成绩比较
class Student{
	private String name;
	private int score;
}
 */
public class TestExam5 {
	public static void main(String[] args) {
		Student s1 = new Student("张三",67);
		Student s2 = new Student("李四",67);
		
		//向上转型，把Comparator它匿名实现类的对象赋值给Comparator的c
/*		Comparator c = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				return s1.getScore() - s2.getScore();
			}
			
		};
		int result = c.compare(s1, s2);*/
		
		int result = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				return s1.getScore() - s2.getScore();
			}
			
		}.compare(s1, s2);
		
		if(result > 0){
			System.out.println("s1 > s2");
		}else if(result <0){
			System.out.println("s1 < s2");
		}else{
			System.out.println("s1 = s2");
		}
	}
}
class Student{
	private String name;
	private int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
}