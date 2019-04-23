package code_day34;

import java.util.*;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class TestMyLambda {
	@Test
	public void test11() {
		System.out.println(2<<3);
	}
	
	
	
	@Test
	public void test1() {
		//匿名内部类
		Runnable r = new Runnable() {
			public void run() {
				System.out.print("Hello World");
			}
		};
		new Thread(r).start();
		Stream<Double> s =  Stream.generate(()->Math.random());
		s.forEach(System.out::println);
		
	} 
	
	@Test
	public void test2() {
		//使用Lambda表达式实现Runnable接口
		Runnable r =()->System.out.println("HelloWorld");
		new Thread(r).start();
	} 
	
	
	@Test
	public void test3() {
		//使用Lambda表达式实现Runnable接口
		new Thread(()->System.out.println("HelloWorld")).start();
	} 
	
	
	
	@Test
	public void test4() {
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("java");
		list.add("world");
		//遍历集合
		for (String string : list) {
			System.out.println(string);
		}
	} 
	
	@Test
	public void test5() {
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("java");
		list.add("world");
		//使用forEach()方法遍历集合
		list.forEach(s->System.out.println(s));
	} 
	
	@Test
	public void test6() {
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("java");
		
		list.forEach(System.out::println);
	}
	
	

}







class Animal{
	private String name;
	private int age;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}











