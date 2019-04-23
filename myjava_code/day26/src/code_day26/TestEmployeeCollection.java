package code_day26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class TestEmployeeCollection {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Collection emp = new ArrayList();
		emp.add(new Employee("一明",7883.27,23));
		emp.add(new Employee("二明",8983.21,21));
		emp.add(new Employee("三明",10183.212,35));
		emp.add(new Employee("四明",12383.32,32));
		emp.add(new Employee("五明",1353.5,45));
		emp.add(new Employee("六明",1443.9,19));
		emp.add(new Employee("七明",18883.1,49));
		emp.add(new Employee("八明",8993.0,29));
		emp.add(new Employee("九明",3333.4,33));
		emp.add(new Employee("十明",6663.3,66));
		
		for (Object object : emp) {
			System.out.println(object);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入查找员工名字");
		String fName = input.next() ;
		
		Object[] objs = emp.toArray() ;
		boolean flag = true;
		for (int i = 0; i < objs.length; i++) {
			if(((Employee)objs[i]).name.equals(fName)) {
				System.out.println("存在此员工"+objs[i]);
				flag = true;
				break;}
		}
		if(!flag)System.out.println("没有找到同名员工");
		
		
		System.out.println("删除40岁以上员工");
		for (int i = 0; i < objs.length; i++) {
			if(((Employee)objs[i]).age>40)
				emp.remove(objs[i]); //此语句在foreach里报错,因为foreach调用Iterator
		}
	
		for(Object obj : emp){
			System.out.println(obj);
			emp.remove(objs[2]);
		}
		
		System.out.println("给所有员工涨薪水到10000");
		for (int i = 0; i < objs.length; i++) {
			if(((Employee)objs[i]).salary<10000)
				((Employee)objs[i]).salary=10000.0;
		}
		
		
		for(Object obj : emp){
			System.out.println(obj);
		}	
		
		System.out.println("删除小于30岁的员工");
		Iterator itr = emp.iterator();
		while(itr.hasNext()) {
			Employee b = (Employee)itr.next(); 
			if(b.age<30) 
				itr.remove();
		}
		
		for(Object obj :emp) {
			System.out.println(obj);
		}
		
	}
}


class  Employee {
	 String name ;
	 double salary;
	 int age;
	public Employee(String name, double salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
	 
	
}
