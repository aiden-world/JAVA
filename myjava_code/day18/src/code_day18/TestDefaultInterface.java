package code_day18;

public class TestDefaultInterface {
	public static void main(String[] args) {
		Baby b1 = new Baby();
		b1.method1();
		b1.method();
		Inter1.super.method1();
	}
}


interface Inter1 {
	static void method() {
		System.out.println("Inter1method");
	}
	default void method1() {
		System.out.println("Inter1method1");
	}
}

interface Inter2 {
	static void method() {
		System.out.println("Inter2method");
	}
	default void method1() {
		System.out.println("Inter2method1");
	}
}

class father {
	static void method() {
		System.out.println("fathermethod");
	}
}

class Baby extends father implements Inter1,Inter2 {
	public void method1() {
		Inter1.super.method1();
		Inter2.super.method1();
	}  
}


