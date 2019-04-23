package code_day29;

import org.junit.Test;

public class TestStaticExtends {
	
	public void print() {System.out.println("非静态方法");}
	 { System.out.println("外部内非静态代码块打印"); }
	static { System.out.println("外部内静态代码块打印"); }
	public InF getAA() {return new InF();}
	
	 static class InF{
		 static void aaStaticPrint() {System.out.println("静态父内部类aa静态打印方法");}
		 void aaPrint(){System.out.println("静态父内部类aa非静态打印方法");}
		 { System.out.println("静态内部父类非静态代码块的实例化打印"); }//语句要在代码块内运行
		 
		 static {System.out.println("静态内部父类的静态代码块打印"); }
		 
	 }
	 
	 class InSon extends InF {
//此处不能静态修饰,非静态内部类不能有静态方法,
// static void bbStaticPrint() {System.out.println("静态子类bb静态打印方法");}
//报错The method bbStaticPrint cannot be declared static; 
//static methods can only be declared in a static or top level type // 
	 void bbPrint(){System.out.println("静态内部类非静态子类bb非静态打印方法");}
	 static final  int i1 = 10;
	 
		 int i = 10;
		 {
			 System.out.println("静态内部父类aa的非静态子类bb非静态代码块实例化打印");
		 }
//		 static{  //不能static修饰,报错Cannot define static initializer in inner type TestStaticExtends.bb
//			 System.out.println("静态内部父类aa的非静态子类bb静态代码块打印");
//		 }

		}
	 
	static class InSon2 extends InF {
		 	 static void inson2StaticPrint() {System.out.println("静态内部父类静态子类2打印方法");}
			 void bb2Print(){System.out.println("静态内部父类静态子类2非静态打印方法");}
			 static final  int i1 = 10;		 
				 int i = 10;
				 {
					 System.out.println("静态内部父类aa的静态子类2非静态代码块实例化打印");
				 }
				}
	 
	 @SuppressWarnings("all")
	 @Test
	 public  void printBB() {
		 System.out.println("AA"); //Test会初始并实例化所在对象
			//TestStaticExtends topF = new TestStaticExtends();
			 //topF.getAA();
			//TestStaticExtends.bb bb1 = new TestStaticExtends.bb();
	}

		@SuppressWarnings("all")
	 public static void main(String[] args) {
		TestStaticExtends topF = new TestStaticExtends();
		System.out.println("------------------");
		InF.aaStaticPrint();
		System.out.println("------------------");
		InF f = new InF();
		 f.aaPrint();
		System.out.println("------------------");
//		TestStaticExtends.InSon bb1 = new TestStaticExtends.InSon();
//		InSon bb2=new InSon();
//		No enclosing instance of type TestStaticExtends is accessible. 
//		Must qualify the allocation with an enclosing instance of type 
//		TestStaticExtends (e.g. x.new A() where x is an instance of TestStaticExtends).
  
		System.out.println("------------------");
//		InSon bb2=new InSon();
		InSon.aaStaticPrint();
		System.out.println("------------------");
		System.out.println(f.getClass());
		InSon2.inson2StaticPrint();
		InSon2 is2 = new InSon2();
		is2.bb2Print(); 
		//静态内部类可以被内部类继承,继承子类如果是非静态不能被实例化只能调取非静态类中的静态变量和静态方法
		//继承子类如果是静态内部子类,则子类可以被实例化,子类也可以调用父类的static方法
		OutSon os = new OutSon();
		os.print();
		System.out.println(os.i+"\t"+os);
		os.aaPrint();
		os.aaStaticPrint();
		//外部类也可以继承内部类,由于是非内部类因此只有非静态类,可以实例化并调用非静态类的非静态方法
		}
		
	
}

class OutSon extends TestStaticExtends.InF{
	static int i =10;
	public void print() {
		System.out.println("外部类继承内部静态类非静态打印");
	}
	
}
 


