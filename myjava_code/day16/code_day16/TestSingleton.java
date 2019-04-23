//饿汉式单例
public class TestSingleton {
public static void main(String[] args) {
	Singleton s1 = Singleton.getIntance();
	Singleton s2 = Singleton.getIntance();
	System.out.println(s1.toString()+s2.toString());
}
}

class Singleton{
	//1 私有化构造器
	private Singleton() {}
	//2 类内部创建一个实例
	private static Singleton instance = new Singleton();
	//3私有化对象,通过公共方法调用,因为调用方法须为静态,故创建实例也需为静态
	public  static Singleton getIntance() {
		return instance ;
	}
	
}
