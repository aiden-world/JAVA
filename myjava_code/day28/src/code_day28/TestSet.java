package code_day28;

import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class TestSet {
	
	@Test
	public void test() {
		Set set = new TreeSet();
		set.add(new Student1("犁牛",888888));
		set.add(new Student1("黑牛",888));
		set.add(new Student1("黄牛",8888));
		set.add(new Student1("青牛",88888));
		for (Object obj : set) {
			System.out.println(obj);
		}
		
	}
	
	
	
}

class Student1 implements Comparable {
	String name ;
	int age ;
	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Student1 o1 = (Student1)o;
		return age-o1.age;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}


