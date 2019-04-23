package com.atguigu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

/*
 * Collection系列集合的遍历：
 * 1、Object[] toArray()
 * 2、Iterator iterator()
 * 
 * Iterator的方法：
 * （1）boolean hasNext()：判断是否还有元素可以遍历
 * （2）Object next()：取出下一个元素
 * （3）void remove() ：这个也是用来删除集合的元素的
 * 		区别与Collection的删除方法，就是可以在遍历的过程中根据条件删除
 * 
 * Iterator是一个接口，它的实现类在集合的内部，用内部类实现的。
 * 它的对象的创建，在iterator()方法中创建
 * 
 * 例如：ArrayList类中：
 * iterator()中：new Itr()
 * 在ArrayList类中：
 * 		 private class Itr implements Iterator<E> {....}
 * 
 */
public class TestCollectionIterator {
	@Test
	@SuppressWarnings("all")
	public void test2(){
		Collection coll = new ArrayList();
		
		coll.add("张三");
		coll.add("李四");
		coll.add("王五");
		coll.add("钱七");
		coll.add("张三丰");
		coll.add("柴林燕");
		
		//需求：删除coll集合中三个字的元素
//		coll.remove(o)//无法删除，因为不知道哪三个字
		
		Iterator iterator = coll.iterator();
		while(iterator.hasNext()){
			String obj = (String) iterator.next();
			if(obj.length()==3){
				iterator.remove();
			}
		}
		
		Object[] array = coll.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].getClass());//运行时类型
			System.out.println(array[i]);
		}
	}
	
	@Test
	@SuppressWarnings("all")
	public void test1(){
		Collection coll = new ArrayList();
		
		coll.add("张三");
		coll.add("李四");
		coll.add("王五");
		coll.add("钱七");
		
		Iterator iter = coll.iterator();//返回一个专门用来遍历当前集合的迭代器对象
		//iter对象的作用就是用来遍历coll集合用的
		while(iter.hasNext()){
			Object obj = iter.next();
			System.out.println(obj);
		}
	}
}
