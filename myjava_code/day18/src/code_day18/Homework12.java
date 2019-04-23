package code_day18;

public class Homework12 {
	public class InterClass{
		public InterClass () {
			System.out.println("interClass create");
		}
	}
	
	public OuterClass() {
		InterClass ic = new InterClass();
		System.out.println("outerClass create");
	}
	
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
	}
	
	
}
