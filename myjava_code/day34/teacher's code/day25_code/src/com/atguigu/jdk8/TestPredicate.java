package com.atguigu.jdk8;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

/*
 * 三：判断型接口：
 * 
 * 1、核心接口：Predicate<T>
 * 	它的抽象方法：boolean test(T t)  有参，并且返回值类型是固定boolean  因为对于调用者来说，你调用时需要给它“实参”，但是得到的结果只有true,false，这个实参就是用于条件判断。
															这里也说明了这个接口的Lambda表达式是“条件判断”
 *
 * 2、变形接口	
 * BiPredicate<T,U>			boolean test(T t, U u)  	接收两个对象，用于条件判断
 * 
 * DoublePredicate			boolean test(double value)  接收一个double值
 * IntPredicate				boolean test(int value)  	接收一个int值
 * LongPredicate			boolean test(long value) 	接收一个long值
 * 
 * 
 */
public class TestPredicate {
	/*
	 * 示例一：
	 * 	 Collection系列的集合，在Java8增加了一个方法：
	 * 		default boolean removeIf(Predicate<? super E> filter)
	 *  removeIf方法的作用：这个方法会遍历集合，当集合的元素满足 Predicate接口的抽象方法的实现的条件时，就删除它
	 */
	@Test
	public void test1(){
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("张三",10000));
		list.add(new Employee("李四",20000));
		list.add(new Employee("王五",8000));
		list.add(new Employee("赵六",9000));
		
		/*
		 * Predicate接口：
		 * 		boolean test(T t) 
		 * Lambda表达式的形参列表：	(Employee e)
		 * Lambda表达式的Lambda体：判断条件   {判断e的薪资是否低于10000}
		 */
		list.removeIf((Employee e) -> e.getSalary()<10000);
		
		System.out.println("删除后：");
		
		list.forEach(e->System.out.println(e));
	}
	
	@Test
	public void test2(){
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("张三",10000));
		list.add(new Employee("李四",20000));
		list.add(new Employee("王五",8000));
		list.add(new Employee("赵六",9000));
		
		/*
		 * 删除薪资低于10000元的
		 */
		
		//错误：
/*		for (Employee employee : list) {
			if(employee.getSalary() < 10000){
				list.remove(employee);
			}
		}*/
		Iterator<Employee> iterator = list.iterator();
		while(iterator.hasNext()){
			Employee next = iterator.next();
			if(next.getSalary()<10000){
				iterator.remove();
			}
		}
		
		System.out.println("删除后：");
		for (Employee employee : list) {
			System.out.println(employee);
		}
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
