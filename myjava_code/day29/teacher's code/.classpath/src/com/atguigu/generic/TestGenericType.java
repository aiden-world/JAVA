package com.atguigu.generic;

/*
 * 1、泛型：泛化的类型。
 * 
 * 例如：JDK在设计ArrayList这个集合时，不知道程序员会用它来装什么对象，但是在实现，编写ArrayList的相关方法时，
 * add(E obj)
 * E get(index)
 * 
 * E:element元素，用E代表元素的类型，这个E就可以说是泛化的类型，可能是String，可能是Student，也可能是任意的引用数据类型。
 * 
 * 2、泛型的声明和使用
 * 先声明后使用
 * （1）如何声明泛型
 * 例如：在声明类的时候，声明接口的时候，可以声明泛型
 * public class ArrayList<E>
 * public interface Comparable<T>
 * 
 * 这个E，T我们称为泛型形参，或类型形参，它代表未知的类型，
 * 在声明这个E，T这些泛型形参的类中，那么可以把E，T当做某种已知的类型一样使用，可以用它来表示返回值类型、形参的类型、属性的类型等。
 * 
 * 
 * （2）如何确定泛型
 * 如何为泛型形参，类型形参，指定具体的泛型实参，类型实参。
 * 例如：
 * 	ArrayList<String> list = new ArrayList<String>();
 *  类型形参：E
 *  类型实参：String   用String代替E
 * 
 * 例如：
 * class Student implements Comparable<Student>{
 * 		int compareTo(Student o)
 * }
 * 	类型形参：T
 *  类型实参：Student  用Student代替T
 * 
 * 形参：
 * 	数据形参		数据实参		实参给形参传值（数据值，地址值）
 * 	类型形参		类型实参		实参给形参传类型（只能是引用数据类型，不能基本数据类型）
 * 
 * 
 * 泛型形参的命名：一般是用一个单个的大写字母表示。
 * E：element
 * T：Type
 * K：key
 * V：value
 * R：returnValue
 * ....
 * 符合见名知意
 * 
 */
public class TestGenericType {
	
	//为什么要声明形参？
	/*
	 * 因此在设计这个方法时，关于比较哪两个数的大小不知道。所以用形参来表示两个未知的数。
	 * 方法的形参的类型是知道的，是值不知道，所以用a,b数据形参来表示。
	 */
	public int getMax(int a ,int b){
		/*
		 * 这声明a,b的方法中，就可以把a,b当做已知的值一样使用就可以
		 */
		return a>b?a:b;
	}
}
