package code_day18;

public class Exer6 {
	public static void main(String[] args) {
		Test2 Test2 = new Test2();
		System.out.println(Test2.getName());
	}
}

 class Father2 {
	private String name = "Father2";

	public String getName() {
		return name;
	} 
	
}


 class Test2 extends Father2{
	private String name = "Test2";
//	public String getName() {
//		return name;
//	} 
	
}

