package code_day18;

public class TestMyRunnable {
	public static void main(String[] args) {
		MyRunnable[] myTest = new MyRunnable[3];
		myTest[0]= new Car();
		myTest[1]= new Person();
		myTest[2]= new Dog();
		for (int i = 0; i < myTest.length; i++) {
			myTest[i].run();		
			}
	}
}

interface MyRunnable{
	void run();
}


class Car implements MyRunnable{
	public  void run() {
		 System.out.println("车速炸穿");
	 }
	
}
class Person implements MyRunnable{
	public  void run() {
		System.out.println("小步慢跑");
	 }
	
}
class Dog implements MyRunnable{
	public  void run() {
		System.out.println("狂犬飞奔");
	 }
	
}

