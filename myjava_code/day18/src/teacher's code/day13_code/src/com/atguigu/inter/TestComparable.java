package com.atguigu.inter;

import java.util.Arrays;

/*
 * 经典的接口：
 * 	 java.lang.Comparable
 * 
 * 
 * 需求：
 * 我想自己设计一个数组工具类，操作数组。
 * 其中，我想设计一个方法，这个方法，可以为任意类型的数组实现从小到大排序
 * 
 * 
 */
public class TestComparable {
	public static void main(String[] args) {
		/*String[] arr = {"hello","world","java","chailinyan"};
		
		//用这个工具类，实现为arr数组排序
		MyArrays.sort(arr);//能用这个方法，说明String实现了java.lang.Comparable接口
		
		//验证结果
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		Student[] arr = new Student[3];
		arr[0] = new Student("张三",23);
		arr[1] = new Student("王小二",22);
		arr[2] = new Student("李四",24);
		
		//用这个工具类，实现为arr数组排序，希望按照年龄排序
		//如果要用这个工具类的sort方法排序，前提，这个数组的元素类型Student必须实现java.lang.Comparable接口
//		MyArrays.sort(arr);
		
		//这里也可以用java.util.Arrays工具类的排序方法
		Arrays.sort(arr);
		
		//验证结果
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
class MyArrays{
	public static void sort(Object[] arr){
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				//如果前面的元素arr[j]   > 后面的元素arr[j+1]，就交换
				//if(arr[j] > arr[j+1]){//错误的，因为对象不能直接用>比较大小
				/*
				 * 遇到坎了，因为我们不知道数组中存的是什么类型的对象。
				 * 可能是学生对象，可能是苹果对象，可能是String对象....
				 * 也不知道你这个对象是按什么比较，例如：是按照学生的成绩、还是年龄、还是身高。。。。
				 * 
				 * 在这里提出了一个标准的概念，Java中对象比较大小的标准
				 * （1）如果  对象1  大于 对象2 ，就用正整数表示
				 * （2）如果  对象1  小于 对象2 ，就用负整数表示
				 * （3）如果  对象1  等于 对象2 ，就用零表示
				 * 
				 * 设计一个这样的接口，java.lang.Comparable，然后它里面有一个抽象方法
				 * 		int compareTo(Object obj)
				 * （1）如果当前对象this 大于 obj ，就用正整数表示
				 * （2）如果当前对象this 小于 obj ，就用负整数表示
				 * （3）如果当前对象this 等于 obj ，就用零表示
				 * 
				 * 凡是需要比较大小的对象的类型就去实现这个标准/接口，如果没有实现这个接口，我就不帮你比较大小
				 * 
				 * 结论：你要用这个工具，来帮你排序，那么说明你的元素是实现这个java.lang.Comparable接口的，
				 * 那么这个元素就是java.lang.Comparable的一个实现类对象。
				 */
				//向下转型
				Comparable left = (Comparable)arr[j];//因为形参的数组是Object[]，元素被向上转型成Object
				if(left.compareTo(arr[j+1]) > 0){
					Object temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				} 
			}
		}
	}
}

class Student implements Comparable{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	@Override
	//这里为什么是Object形参，因为java.lang.Comparable接口中的抽象方法int compareTo(Object obj)，因为接口是要所有类遵守的标准，
	public int compareTo(Object o) {
		//你先按照年龄排序
		//当前对象this，和指定对象o比较大小
/*		if(this.age > o.age){
			return 正数;
		}else if(this.age < o.age){
			return 负数;
		}else{
			return 0;
		}*/
//		return this.age - o.age;
		//因为o被向上转型为Object,这里要向下转型回来
		Student other = (Student) o;
		return this.age - other.age;
	}
	
}