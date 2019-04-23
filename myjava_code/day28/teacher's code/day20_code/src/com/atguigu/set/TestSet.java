package com.atguigu.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/*
 * Set：抽象数学中的集
 * 数学中集合：（1）互异性，不可重复（2）无序性（3）确定性
 * 
 * Java中的Set：也是无序的（无下标信息），不可重复
 * Java中的List：可以重复，有序（有下标信息），哪怕是链表，也是可以有下标操作的方法，虽然效率低
 * 
 * 接口：Collection，Set，List都是接口
 * 		Iterable,Iterator,接口
 * 		Comparable，Comparator接口
 * 
 * 1、Set的实现类们：
 * （1）HashSet
 * （2）TreeSet
 * （3）LinkedHashSet
 * 
 * 2、Set/List是Collection的子接口，Collection是继承了Iterable，所以可以使用foreach
 * 3、Set接口的方法就是Collection接口的方法。没有增加其他方法，不像List增加了和index相关的操作，所以Set是无法通过index操作。
 * 
 * 4、实现类们有什么不同呢？
 * （1）HashSet：底层实现：JDK1.8之前（数组+链表），JDK1.8之后（数组+链表/红黑树）
 * （2）TreeSet：底层实现：二叉树
 * （3）LinkedHashSet：它是HashSet的子类，比HashSet多维护了一项内容，元素添加顺序
 * 
 * 因为Set是无序的，但是有的时候，开发中需要用到这样的一种集合：
 * （1）既要保证元素的添加顺序，（2）又希望元素不可重复，
 * 那么此时可以选择考虑LinkedHashSet
 * LinkedHashSet效率低，因为在添加和删除它的元素时，还要维护它的添加的顺序。
 * 
 * 
 * HashSet：元素的存储的位置和hashCode值有关，元素的是否重复和equals有关
 * 		添加到HashSet中的元素，一定会用到它的hashCode()和equals()
 * TreeSet：元素的存储的位置、元素的是否重复，都和和元素的大小有关。
 * 		即如果两个元素“大小”相等，就是“重复的”元素，就无法添加。
 * 	   结论：要存到TreeSet中的元素，必须实现java.lang.Comparable接口，重写int compareTo(x)方法
 * 		如果元素实在没有实现Comparable接口，或者你的实现不符合当前的需求，那么可以选择用java.util.Comparator接口的实现类对象来比较大小
 */
public class TestSet {
	@SuppressWarnings("all")
	@Test
	public void test9(){
//		Set set = new TreeSet();按照元素的自然排序，java.lang.Comparable接口
//		Set set = new TreeSet(Comparator的对象);//定制比较器排序
		
		Set set = new TreeSet(new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				if(s1.getAge() == s2.getAge()){
					return s1.getName().compareTo(s2.getName());
				}
				return s1.getAge() - s2.getAge();
			}
			
		});
		
		set.add(new Student("Alice",23));//添加失败，因为Student类型的对象无法比较大小
		set.add(new Student("Irene",27));
		set.add(new Student("Tome",21));
		set.add(new Student("Jack",22));
		
		System.out.println("元素的个数：" + set.size());
		for (Object object : set) {
			System.out.println(object + "，类型：" + object.getClass());
		}
	}
	
	@SuppressWarnings("all")
	@Test
	public void test8(){
		Set set = new TreeSet();
		
		set.add(new Employee("Alice",23));//添加成功，因为Employee类型实现了java.lang.Comparable接口，
		/*
		 * 在add方法中会把Employee类型的对象，强转为Comparable类型的对象，然后调用compareTo()方法，比较两个元素的大小
		 * 因为Employee实现了java.lang.Comparable接口，说明Employee的对象，同时也是Comparable类型的对象
		 */
		set.add(new Employee("Irene",27));
		set.add(new Employee("Tome",21));
		set.add(new Employee("Lily",22));
		set.add(new Employee("Jack",22));
		
		System.out.println("元素的个数：" + set.size());
		for (Object object : set) {
			System.out.println(object );
		}
	}
	
	@SuppressWarnings("all")
	@Test
	public void test7(){
		Set set = new TreeSet();
		
		set.add(new Student("Alice",23));//添加失败，因为Student类型的对象无法比较大小
		set.add(new Student("Irene",27));
		set.add(new Student("Tome",21));
		set.add(new Student("Jack",22));
		
		System.out.println("元素的个数：" + set.size());
		for (Object object : set) {
			System.out.println(object + "，类型：" + object.getClass());
		}
	}
	
	@SuppressWarnings("all")
	@Test
	public void test6(){
		Set set = new TreeSet();
		
		set.add("hello");
		set.add("hellt");
		set.add("java");
		set.add("Hello");
		set.add("hello");//String的对象大小，实现了java.lang.Comparable接口，重写int compareTo(Object obj)，每一个字符逐个比较，第一个不一样的字符的大小
		
		System.out.println("元素的个数：" + set.size());
		for (Object object : set) {
			System.out.println(object + "，类型：" + object.getClass());
		}
	}
	
	@SuppressWarnings("all")
	@Test
	public void test5(){
		Set set = new TreeSet();
		
		set.add(3);
		set.add(1);
		set.add(5);
		set.add(3);//Integer的对象大小，就是它包装的int值的大小，因为Integer它实现了java.lang.Comparable接口，重写int compareTo(Object obj)
		
		System.out.println("元素的个数：" + set.size());
		for (Object object : set) {
			System.out.println(object + "，类型：" + object.getClass());
		}
	}
	
	
	@SuppressWarnings("all")
	@Test
	public void test4(){
		Set set = new HashSet();
		
		set.add("张三");
		set.add("李四");
		set.add("王五");
		set.add("赵六");
		
		System.out.println(set.contains("张三"));
	}
	
	@SuppressWarnings("all")
	@Test
	public void test3(){
		Set set = new HashSet();
		
		set.add("张三");
		set.add("李四");
		set.add("王五");
		set.add("赵六");
		
		System.out.println("元素：" + set.size());
		for (Object object : set) {
			System.out.println(object);
		}
	}
	
	@SuppressWarnings("all")
	@Test
	public void test1(){
		Set set = new HashSet();
		
		set.add("张三");
		set.add("张三");
		set.add("张三");
		set.add(new String("张三"));//发现set里面判断元素是否相同用的是equals，不是==。String重写了equals
		set.add("张三");
		
		System.out.println("元素：" + set.size());
		for (Object object : set) {
			System.out.println(object);
		}
	}
	
	@SuppressWarnings("all")
	@Test
	public void test2(){
		Set set = new HashSet();
		
		set.add(new Student("张三",23));
		set.add(new Student("张三",23));//如果Student没有重写equals方法，那么就会有两个("张三",23)，因为Object继承过来的equals等价于==
		
		System.out.println("元素：" + set.size());
		for (Object object : set) {
			System.out.println(object);
		}
	}
}


class Student{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}

class Employee implements Comparable{
	private String name;
	private int age;
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	/*@Override
	public int compareTo(Object o) {
		Employee emp = (Employee) o;
		return this.age - emp.age;
	}*/
	
	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee) o;
		if(this.age == emp.age){
			//按照姓名比较，因为name是String，字符串的比较大小就用compareTo
			return this.name.compareTo(emp.name);//这里区分大小写，如果不想区分大小写，就调用String的compareToIgnoreCase(x)
		}
		return this.age - emp.age;
	}
	
	
}