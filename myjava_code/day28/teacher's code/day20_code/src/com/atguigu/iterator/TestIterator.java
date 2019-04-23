package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 集合是用来装对象
 */
public class TestIterator {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		
		coll.add(1);//Integer的对象
		coll.add(2);
		coll.add(3);
		coll.add(4);
		
/*		Iterator iter = coll.iterator();
		while(iter.hasNext()){
			Object obj = iter.next();
			if(obj.equals(2)){
	//			coll.remove(obj);//java.util.ConcurrentModificationException  快速失败，避免后面导致迭代器不知道真实的元素的个数，出现其他问题
				
				 * 迭代器好比乘务员
				 * 	现在是乘务员在数乘客的人数，检票的过程。
				 * 
				 * 此时上车，下车需要和乘务员说，你不说，那么乘务员会出错。
				 
				iter.remove();
			}
		}*/
		
		/*
		 * foreach底层使用Iterator的遍历，相当于它用了一个隐含的Iterator迭代器对象在操作集合。
		 */
		for (Object object : coll) {
//			coll.remove(object);
//			coll.add(7);
		}
	}
}
