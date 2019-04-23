package com.atguigu.utils;

import java.util.Arrays;
import java.util.Comparator;

/*
 * java.util.Arrays：此类包含用来操作数组（比如排序和搜索）的各种方法。
 * 
 * 1、public static xxx[] copyOf(xxx[] original, int newLength) 
 * 例如：
 * public static int[] copyOf(int[] original, int newLength) 
 * 
 * 2、public static String toString(xxx[] arr)
 * 
 * 3、public static void sort(xxx[] a)
 * 例如：public static void sort(Object[] a)
 * 根据元素的自然顺序对指定对象数组按升序进行排序。数组中的所有元素都必须实现 Comparable 接口。
 * 
 * 4、public static <T> void sort(T[] a, Comparator<? super T> c)
 * 例如：public static void sort(Object[] a, Comparator c)
 * 按照指定的比较器的排序规则对指定对象数组按升序进行排序。
 * 指定的比较器就是Comparator的实现类的对象。
 * 
 * Comparable 接口的实现：自然排序
 * Comparator接口的实现：定制排序
 * 
 * 5、public static int binarySearch(xxx[] a,xxx key)
 * 例如：
 * public static int binarySearch(int[] a,int key)
 * 在a数组中查找key是否存在，不存在返回(-(插入点) - 1),存在返回下标
 * 前提：数组必须是有序的
 */
public class TestArrays {
	public static void main(String[] args) {
/*		//使用Arrays工具实现复制一个数组的功能
		int[] arr = {1,2,3,4,5};
		
		int[] newArr1 = Arrays.copyOf(arr, 3);
		newArr1[0] = 100;
		int[] newArr2 = Arrays.copyOf(arr, 5);
		int[] newArr3 = Arrays.copyOf(arr, 10);
		
		System.out.println("原数组：" + Arrays.toString(arr));
		System.out.println("新数组1：" + Arrays.toString(newArr1));
		System.out.println("新数组2：" + Arrays.toString(newArr2));
		System.out.println("新数组3：" + Arrays.toString(newArr3));*/
		
		//使用Arrays工具类实现排序
		Student[] arr = new Student[3];
		arr[0] = new Student("张三",89);
		arr[1] = new Student("李四",67);
		arr[2] = new Student("王五",99);
		
		Arrays.sort(arr);//自然排序，要求数组的元素实现java.lang.Comparable接口
		
		System.out.println(Arrays.toString(arr));
		
		Employee[] all = new Employee[3];
		all[0] = new Employee("张三",6900);
		all[1] = new Employee("李四",8800);
		all[2] = new Employee("王五",5500);
		
		//也希望用Arrays.sort对数组进行排序，但是如果此时Employee不方便修改，让它实现java.lang.Comparable
		//或者说原来的实现不满足当前的要求
		//这里只能单独再传一个java.util.Comparator接口的实现类对象
		Arrays.sort(all, new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Employee e1 = (Employee) o1;
				Employee e2 = (Employee) o2;
				if(e1.getSalary() > e2.getSalary()){
					return 1;
				}else if(e1.getSalary() < e2.getSalary()){
					return -1;
				}
				return 0;
			}
			
		});//按照薪资排序
		
		System.out.println(Arrays.toString(all));
		
	/*	int[] arr = {1,3,5,7,9};
		int index1 = Arrays.binarySearch(arr, 3);
		int index2 = Arrays.binarySearch(arr, 11);
		System.out.println("3在数组中的下标：" + index1);
		System.out.println("11在数组中的下标：" + index2);*/
	}
}
class Employee{
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}

class Student implements Comparable{
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
	
	//自然顺序，凡是实现java.lang.Comparable接口的排序规则，就叫做自然排序
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		return this.score - other.score;
	}
	
}