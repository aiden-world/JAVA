package day31;

import java.io.Serializable;
import java.util.ArrayList;

public class TestErase {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Integer> list  = new ArrayList<Integer>();
		System.out.println(list.toArray().getClass());
		
		ArrayList list1  = new ArrayList<Double>();
		System.out.println(list1.toArray().getClass());	
		
		ArrayList<?> list2  = new ArrayList<Integer>();
		System.out.println(list1.toArray().getClass());	
		
		
		list.add(1);
		list.add(22);
//		list.add(3.3);
		 
		list1.add(1);
		list1.add(3.2);
		
		//list2.add((Integer)1); //<?>不能add
		
		
		System.out.println(list.toArray(new Integer[1] ).getClass());
		//下面语句报错,java.lang.ArrayStoreException,因为list1中存储了不同类型的数据
		//System.out.println(list1.toArray(new Double[1] ).getClass());
		
		System.out.println(list2.toArray(new Integer[1] ).getClass());
	
		for (Integer i : list.toArray(new Integer[3] )	) {
			System.out.println(i);
		}
		
		//虽然打印的都是Integer,但是IDE给出的提示baby是Number,感觉是final native的getClass方法处理原因
		Student baby = new Student<Integer>("狂龙",11);		
		System.out.println(baby.score.getClass());
		Student baby1 = new Student<Integer>("狂龙",11);
		System.out.println(baby1.score.getClass());
		

		
	}

}




class Student<T extends Number & Serializable> {
		String name ;
		T score ;
		public Student(String name, T score) {
			super();
			this.name = name;
			this.score = score;
		}
		
	
}












