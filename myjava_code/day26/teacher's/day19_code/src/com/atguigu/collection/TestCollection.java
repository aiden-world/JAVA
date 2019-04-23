package com.atguigu.collection;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

/*
 * JDK提前已经给我们设计很多种的数据结构的集合。
 * 分为两大类：
 * 1、Collection系列：保存一组对象
 * 		单身party
 * 2、Map系列：保存一组映射关系的
 * 		情侣party
 * 映射关系(key,value)
 * 
 * 集合：java.util
 * 
 * 一、Collection系列集合
 * 动态数组、双向链表、队列（先进先出）、栈（先进后出/后进先出）....
 * 这些都是保存一组对象的集合，那么它们有共同的行为特征，例如：添加、删除、遍历....
 * 
 * 抽取出一个公共的接口：Collection接口
 * 
 * 1、Collection接口
 * Collection 层次结构 中的根接口。Collection 表示一组对象。Collection不提供直接的实现类。
 * Collection系列又分为：
 * （1）List系列：有序的，可重复
 * （2）Set系列：无序，不可重复
 * 
 * 2、Collection的方法
 * （1）添加
 * boolean add(Object obj)：添加一个对象到当前集合中
 * boolean addAll(Collection coll)：添加一组对象到当前的集合中
 * 
 * （2）删除
 * boolean remove(Object o) ：从集合中删除一个对象
 * boolean removeAll(Collection c) ：从集合中删除一组对象，this = this - this ∩ c
 * void clear() ：清空
 * 
 * （3）查找
 * boolean contains(Object o) ：是否包含某个对象
 * boolean containsAll(Collection c)：是否包含c集合中的所有对象，即判断c是否是当前集合的子集 
 * boolean isEmpty() ：是否是空集合
 * 
 * （4）修改（没有提供修改某个元素的方法）
 * 
 * （5）和遍历相关
 * Object[] toArray() ：把集合中的所有元素，用一个数组返回
 * Iterator iterator() ：返回用于遍历当前集合的迭代器对象
 * 
 * （6）其他方法
 *  int size()  ：返回当前集合的实际的元素个数
 *  boolean retainAll(Collection c) ：保留当前集合和c集合的交集，this = this ∩ c
 */
public class TestCollection {
	@Test
	@SuppressWarnings("all")
	public void test5(){
		Collection coll = new ArrayList();//ArrayList是Collection系列集合的一个实现类
		//添加
		coll.add("张三");
		coll.add("李四");
		coll.add("张三");
		
		Collection other = new ArrayList();
		other.add("王五");
		other.add("张三");
		
		coll.retainAll(other);
		
		//遍历
		Object[] array = coll.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	@SuppressWarnings("all")
	public void test4(){
		Collection coll = new ArrayList();//ArrayList是Collection系列集合的一个实现类
		//添加
		coll.add("张三");
		coll.add("李四");
		coll.add("张三");
		
		Collection other = new ArrayList();
		other.add("王五");
		other.add("张三");
		
		coll.removeAll(other);
		
		//遍历
		Object[] array = coll.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	@SuppressWarnings("all")
	public void test3(){
		Collection coll = new ArrayList();//ArrayList是Collection系列集合的一个实现类
		//添加
		coll.add("张三");
		coll.add("李四");
		coll.add("张三");
		
		//遍历
		Object[] array = coll.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("----------------");
		
		coll.remove("张三");
		
		//遍历
		array = coll.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	@SuppressWarnings("all")
	public void test2(){
		Collection coll = new ArrayList();//ArrayList是Collection系列集合的一个实现类
		//添加
		coll.add("张三");
		coll.add("李四");
		
		Collection other = new ArrayList();
		other.add("王五");
		other.add("张三");
		
		coll.add(other);//把other当做一个整体
//		coll.addAll(other);
		
		System.out.println("元素的个数：" +coll.size());
		
		//遍历
		Object[] array = coll.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	@SuppressWarnings("all")
	public void test1(){
		Collection coll = new ArrayList();//ArrayList是Collection系列集合的一个实现类
		
		//添加
		coll.add("张三");
		coll.add("李四");
		
		//遍历
		Object[] array = coll.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
