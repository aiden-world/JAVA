package com.atguigu.review;

import java.util.HashMap;

public class TestHashMap {
	public static void main(String[] args) {
		
		System.out.println(HashMap.Entry.class);
		
		System.out.println(A.B.class);
		System.out.println(C.B.class);
		
		System.out.println(Outer.Inner.class);
		System.out.println(Zi.Inner.class);
		
		Zi.Inner i = new Zi().new Inner();
		
	}
}
interface A{
	interface B{
		
	}
}
class C implements A{
	
}

class Outer{
	class Inner{
		
	}
}
class Zi extends Outer{
	
}