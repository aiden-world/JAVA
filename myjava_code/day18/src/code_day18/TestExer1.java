package code_day18;


public class TestExer1 {
	public static void main(String[] args) {
		Other op1 = new Other();
		op1.method();
		Other1 op2 = new Other1(new Outer());
		op2.method();
	}
	
}
class Outer{
	abstract class Inner{
		public abstract void method();
	}
}

//让Other去继承Inner,自己写的方法
class Other extends Outer.Inner {	
	static Outer out = new Outer();
	public Other() {		
		out.super();
	}
	public void method() {
		System.out.println("飞龙在天");
	}
}

//老师的方法
class Other1 extends Outer.Inner{
	public Other1(Outer out) {		
		out.super();
	}
	public void method() {
		System.out.println("见龙在野");
	}
}



