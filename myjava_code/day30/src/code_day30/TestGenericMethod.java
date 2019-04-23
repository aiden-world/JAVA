package code_day30;

import java.util.*;

public class TestGenericMethod {
	public static void main(String[] args) {
		println(3);
		println(new Student<>(33,"追命"));
		
		
			ArrayList<String> src = new ArrayList<String>();
			src.add("尚硅谷");
			src.add("atguigu");
			
			ArrayList<String> dest = new ArrayList<>();
			
			String last = copy(dest, src);                                      
			System.out.println(last);

	
	
	
	}
	
	
	 public static  <T> void println(T a) {
		System.out.println(a);
	}
	 
	 
//public static <T> T copy(Collection<T > dest,Collection<? extends T> src){
public static <T> T copy(Collection<? super T > dest,Collection<? extends T> src){

			T last = null;
			for (T t : src) {
				dest.add(t);
				last = t;
			}
			return last;
		}

// 以下两个方法报错,重复形参
//public static <T> T copy1(Collection<? super T> dest,Collection<T> src){
//	return null;
//	//....省略代码
//}
//
//public static <T> T copy1(Collection<T> dest,Collection<? extends T> src){
//	//....省略代码
//}




}



 

 