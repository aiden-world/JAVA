package com.atguigu.collect;

import java.util.Arrays;
import java.util.Iterator;

/*
 * 希望MyArrayList代表一种数据结构：动态数组
 * 底层物理结构：数组
 * 
 * MyArrayList是一种我们自己设计的容器类型，它可以添加、删除、修改、查询元素
 */
public class MyArrayList implements Iterable{
	private Object[] all;
	private int total;
	
	public MyArrayList(){
		all = new Object[5];//初始长度为5
	}
	
	//添加元素
	public void add(Object obj){
		//当数组已满后，应该实现自动扩容
		isGrow();
		all[total++] = obj;
	}

	//如果数组已满，就扩容
	private void isGrow() {
		if(total >= all.length){
			//我这里设计为，不够了就扩大为2倍
			if(all.length*2 > Integer.MAX_VALUE){
				throw new RuntimeException("内存不够");
			}
			all = Arrays.copyOf(all, all.length*2);
		}
	}
	
	//返回所有有效元素
	public Object[] toArray(){
		return Arrays.copyOf(all, total);
	}
	
	//返回index位置的元素
	public Object get(int index){
		checkIndex(index);
		return all[index];
	}

	//检查下标
	private void checkIndex(int index) {
		if(index<0 || index>=total){
			throw new IndexOutOfBoundsException(index + "越界");
		}
	}
	
	//查找该元素的下标，这里只考虑找到的第一个
	public int indexOf(Object obj){
		int index = -1;
		
		if(obj == null){
			for (int i = 0; i < total; i++) {
				if(obj==all[i]){
					return i;
				}
			}
		}else{
			for (int i = 0; i < total; i++) {
				if(obj.equals(all[i])){
					return i;
				}
			}
		}
		
		return index;
	}
	
	//删除index位置的元素
	public void remove(int index){
		checkIndex(index);
		System.arraycopy(all, index+1, all, index, total-index-1);
		all[--total] = null;
	}
	
	//删除obj元素，这里只考虑找到的第一个
	public void remove(Object obj){
		//(1)先找到obj的位置
		int index = indexOf(obj);
		if(index!=-1){
			remove(index);
		}
	}
	
	//在index位置插入元素
	public void insert(int index,Object obj){
		checkIndex(index);
		//先判断数组是否已满
		isGrow();
		/*
		 * 假设total=4,index=0，移动[0][1][2][3]
		 */
		System.arraycopy(all, index, all, index+1, total-index);
		all[index] = obj;
		total++;
	}
	
	//替换index位置的元素为obj
	public void set(int index, Object obj){
		checkIndex(index);
		all[index] = obj;
	}
	
	//替换某个元素为新的obj，只考虑找到的第一个
	public void set(Object old ,Object newObj){
		int index = indexOf(old);
		if(index!=-1){
			set(index,newObj);
		}
	}

	@Override
	public Iterator iterator() {
		return new Itr();
	}
	
	private class Itr implements Iterator{
		private int cursor = 0;//当前遍历到哪里了

		@Override
		public boolean hasNext() {
			return cursor<total;
		}

		@Override
		public Object next() {
			System.out.println("-----------");
			return all[cursor++];
		}
		
	}

}
