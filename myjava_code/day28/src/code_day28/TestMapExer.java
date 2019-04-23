package code_day28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class TestMapExer {
	public static void main(String[] args) {
		
		Integer i =10;
		Student2 stu1 = new Student2("黄猿",88);
		Student2 stu2 = new Student2("青稚",91);
		Student2 stu3 = new Student2("赤犬",93);
		Student2 stu4 = new Student2("白胡子",96);
		Student2 stu5 = new Student2("黑胡子",95);
		Student2 stu6 = new Student2("路飞",78);
		Student2 stu7 = new Student2("索隆",76);
		Student2 stu8 = new Student2("山治",74);
		Student2 stu9 = new Student2("娜美",68);
		Student2 stu10 = new Student2("鹰眼",90);
	
		Collection stuarr1= new ArrayList();
		Collection stuarr2= new ArrayList();
		Collection stuarr3= new ArrayList();
		
		stuarr1.add(stu4);
		stuarr1.add(stu5);
		stuarr1.add(stu10);

		stuarr2.add(stu1);
		stuarr2.add(stu2);
		stuarr2.add(stu3);
		
		stuarr3.add(stu6);
		stuarr3.add(stu7);
		stuarr3.add(stu8);
		stuarr3.add(stu9);
		
		
		Map map1 = new  HashMap();
		//Map map1 = new  TreeMap();
		map1.put(stu4, stuarr1);
		map1.put(stu3, stuarr2);
		map1.put(stu6, stuarr3);
		
		
		Set key = map1.keySet();
		Collection value = map1.values();
		int count=1;
		for (Object obj1 : key) {
			System.out.println("第"+count+"组组长"+obj1);
				System.out.println("第"+count+"组组员"+value.toArray()[count-1]);
			count++;
		}
		
//		Properties pro = System.getProperties() ;
//		Set pset = pro.entrySet();
//		for (Object object : pset) {
//			System.out.println(object);
//		}
		
		
		
		
	}
}






class Student2  implements Comparable{
	String name;
	double score;
	public Student2(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", score=" + score + "]";
	}
	@Override
	public int  compareTo(Object o) {
		Student2 o1 = (Student2) o;
		return (int)(score-o1.score);
	}
	
	
	
	
}