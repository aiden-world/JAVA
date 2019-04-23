package code_day30;

import java.io.*;

public class TestGeneric {
	public static void main(String[] args) {
		Student<Integer,String> stu1 = new Student<Integer, String>(99,"无情");
		Student<Integer,String> stu3 = new Student<Integer, String>(89,"冷血");
		Student<Double,Character> stu2 =  new Student<Double,Character>(3.1415, 'X');
		Student<Double,Character> stu4 =  new Student<Double,Character>(2.714, 'Z');

		stu1.printK();
		stu1.printT();
	
		stu2.printK();
		stu2.printT();
		
		stu1.printOtherT(stu1);
		stu1.printOtherT(stu3);

		
		Student<Long,String> stu5 = new Student<Long, String>(213213L,"铁手");
		Student<Long,String> stu6 = new Student<>(213213L,"铁手");
		
		TestNum tn = new TestNum();
		Student<TestNum,String> stu7 = new Student<>(tn,"铁手");

		
	}
	
	

	
}



class Student<K extends Number&Serializable&Comparable<?>,T> {
	K  id;
	T  name;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	

	public Student(K id, T name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public void printK() {
		System.out.println(id);
	}
	
	public void printT() {
		System.out.println(name);
	}

	public void printOtherK(Student<K,T> a) {
		System.out.println(a.id);
	}
	
	public void printOtherT(Student<K,T> a) {
		System.out.println(a.name);
	}
	
}


class TestNum extends Number implements Comparable<?>{

	
	
	
	
	
	
	
	
	private static final long serialVersionUID = 1L;

	@Override
	public int intValue() {
		
		return 0;
	}

	@Override
	public long longValue() {
		
		return 0;
	}

	@Override
	public float floatValue() {
		
		return 0;
	}

	@Override
	public double doubleValue() {
		return 0;
	}

	

	@Override
	public int compareTo(Number o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


