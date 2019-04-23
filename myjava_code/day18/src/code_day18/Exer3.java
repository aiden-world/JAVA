package code_day18;


public class Exer3 {
	public static void main(String[] args) {
		Father f = new Son();
		System.out.println(f.x1);
	}
}
class Father{
	int x1 = 10;
	public Father(){
		this.print();
		print();
		x1 = 20;
	}
	public void print(){
		System.out.println("Father.x = " + x1);
	}
}
class Son extends Father{
	int x = 30;
	public Son(){
		this.print();
		x = 40;
	}
	public void print(){
		System.out.println("Son.x = " + x);
	}
}
