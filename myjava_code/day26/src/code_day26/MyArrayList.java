package code_day26;

import java.util.Arrays;

public class MyArrayList {
	private Object all[];
	private int total;
	
	
	public MyArrayList() {
		all = new Object[5];
	}
	public MyArrayList(int n) {
		all = new Object[n];
	}
	
	public void lengthGrow() {
		all = Arrays.copyOf(all, 2*all.length);
	}
	public void add(Object a) {
		if(total==all.length) 
			lengthGrow();
		all[total] = a ;
		total++;
	}
	
	//返回有效元素
	public Object[] toArray() {
		return Arrays.copyOf(all, total);
	}
	
	//返回index位置的元素
	public Object getIndexElement(int i) {
		if(i>total||i<0)
			throw new IndexOutOfBoundsException(i+",输入索引错误");
		return all[i];
	}
	
	//查找该元素的下标,这里只考虑第一个
	public int findElement(Object obj) {
		for (int i = 0; i <total; i++) {
			if(all[i].equals(obj))
				return i;
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
