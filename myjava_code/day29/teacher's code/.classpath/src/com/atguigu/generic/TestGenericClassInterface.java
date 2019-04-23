package com.atguigu.generic;

import org.junit.Test;

/*
 * 泛型的应用：
 * 一、泛型类与泛型接口
 * 1、泛型类与泛型接口的语法
 * 【修饰符】 class/interface 类名/接口名<泛型形参列表>{
 * 		在这个类，接口中，泛型形参就可以代表某种类型，正常使用
 * }
 * 
 * 例如：ArrayList<E>
 *    Collection<E>
 *    Map<K,V>
 *    Comparable<T>
 *    Comparator<T>
 * 
 * 特别说明：泛型类或泛型接口上面的泛型形参是不能用于静态成员上。
 * 
 * 2、什么时候为泛型类或泛型接口的泛型形参指定具体的类型
 * （1）创建该类的对象时
 * （2）继承这个类或实现这个接口，在父类或父接口的位置指定泛型实参
 * 
 */
public class TestGenericClassInterface {
	@Test
	public void test1(){
		//现在是语文老师在用这个类
		XueYuan<String> x1 = new XueYuan<String>("张三","优秀");
		
		ChineseXueYuan c1 = new ChineseXueYuan();
		c1.setScore("良好");
		
		ChineseXueYuan c2 = new ChineseXueYuan("李四","优秀");
		c2.setScore("良好");
	}
	
	@Test
	public void test2(){
		//现在是数学老师在用这个类
		XueYuan<Double> x1 = new XueYuan<Double>("张三",89.0);
	}
	
	@Test
	public void test3(){
		//现在是英语老师在用这个类
		XueYuan<Character> x1 = new XueYuan<Character>("张三",'A');
	}
	
	@Test
	public void test4(){
		MyXueYuan my = new MyXueYuan();
//		my.setScore(score);//这里就按照Object
	}
}

/*
 * 假设有一个复杂的需求，声明一个学生类型，这个学生类型，比较特殊，
 * 他的成绩的类型是未知的？
 * 成绩的表示方式：
 * 语文老师：优秀、良好、及格...
 * 数学老师：89.5, 90.2
 * 英语老师：A,B,C,D...
 * 
 * 这里用S代表score的类型
*/
class XueYuan<S>{
	private String name;
	private S score;
	public XueYuan(String name, S score) {
		super();
		this.name = name;
		this.score = score;
	}
	public XueYuan() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public S getScore() {
		return score;
	}
	public void setScore(S score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "XueYuan [name=" + name + ", score=" + score + "]";
	}
	
/*	public static void test(S s){
		
	}*/
	
}

/*语文老师说，不想在创建每一个学生对象时，指定泛型实参，嫌麻烦
*/
class ChineseXueYuan extends XueYuan<String>{

	public ChineseXueYuan() {
		super();
	}

	public ChineseXueYuan(String name, String score) {
		super(name, score);
	}
	
}

//MyXueYuan中score的类型是Object
class MyXueYuan extends XueYuan{
	
}
//延续父类未知的类型S
class YourXueYuan<S> extends XueYuan<S>{
	
}