public class TestStaticExer1 {
	public static void main(String[] args) {
		Son son = new Son();
	}
}
class Father{
	static{
		System.out.println("（1）父类的静态代码块");
	}
	{
		System.out.println("（2）父类的构造器");
	}
	Father(){
		System.out.println("（3）父类的无参构造");
	}
}
class Son extends Father{
	static{
		System.out.println("（4）子类的静态代码块");
	}
	{
		System.out.println("（5）子类的构造器");
	}
	Son(){
		System.out.println("（6）子类的无参构造");
	}
}
