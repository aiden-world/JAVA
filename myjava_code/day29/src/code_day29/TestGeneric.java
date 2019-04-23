package code_day29;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TestGeneric {
	public static void main(String[] args) {
		double a = 1.3;
		double b = 1.5;
		long c = Double.doubleToLongBits(a)-Double.doubleToLongBits(b);
		long e = Double.doubleToLongBits(b)-Double.doubleToLongBits(a);
		System.out.println(c+"\n"+e);
		int d = (int)c;//损失精度,不能在比较时候这样用
		System.out.println(d);
		
//		OutSon os = new OutSon();
//		os.print();
//		os.aaPrint();
	}
	
	
	@Test
	public void test1() {
		 Student stu1 = new Student("大明",53);
		 Student stu2 = new Student("二明",43);
		 Student stu3 = new Student("三明",33);
		Collection<Student> arr1 = new ArrayList<Student>(); 
		arr1.add(stu1);
		arr1.add(stu2);
		arr1.add(stu3);

		for (Student stu : arr1) {
			System.out.println(stu);
		}
		
		Iterator<Student> itr = arr1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}

	@Test
	public void test2() {
		
		//Map map1 = new HashMap<Province p, Object>();
		
		
	}
	
	@Test
	public void test3() {
		
		
		Set<Employee> emp = new TreeSet<Employee>();
		emp.add(new Employee(1,"李磊",3005.2));
		emp.add(new Employee(1,"李磊",3004.2));
		emp.add(new Employee(1,"李磊",3004.2));
		
		for (Employee e : emp) {
			System.out.println(e);
		}
		
//		Object[] objs = new Object[] {1,2,3,4,5,6,7};
//		 for (Object object : objs) {
//			System.out.println(object);
//		}
	}
	
	
	
	
	

}



class Student{
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}	
}

class Province {
	
}

class  City{
	
}

class Employee implements Comparable<Employee>{
	int id;
	String name ;
	double salary;
	

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		
		//return Double.compare(salary, o.salary);//double类型比大小时返回的不是两者之差
		return  (Double.doubleToLongBits(salary)==Double.doubleToLongBits(o.salary)?0:
				Double.doubleToLongBits(salary)>Double.doubleToLongBits(o.salary)?1:-1);

	}
	
	
	
}



	



