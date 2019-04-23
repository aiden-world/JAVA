package code_day18;

public class Exer4 {
	public static void main(String[] args) {
		Father1 f = new Father1();
		Child1 c = new Child1();
	}
}
class Child1 extends Father1{
	public Child1(){
		System.out.println("Child1 create");
	}
	
	
}

 class Father1 {
	public Father1(){
		System.out.println("Father1 create");
	}
}
