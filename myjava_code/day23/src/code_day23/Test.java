package code_day23;

public class Test {
	public static void main(String[] args) {
		staticFunction();
	}
	
	static Test st = new Test();
	int a=110;
	static int b = 112;
	static {
		System.out.println("1");
	}
	
	{
		System.out.println("2");
	}
	
	Test(){
		System.out.println("3");
		System.out.println("a="+a+"b="+b);
	}
	
	public static void staticFunction() {
		System.out.println("4");
	}
	
}
