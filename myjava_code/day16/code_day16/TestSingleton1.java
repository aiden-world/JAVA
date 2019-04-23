//懒汉式单例  
//懒汉式可能存在线程安全问题,需要修改
public class TestSingleton1 {
public static void main(String[] args) {
	Singleton s1 = Singleton.getIntance();
	Singleton s2 = Singleton.getIntance();
	System.out.println(s1.toString()+s2.toString());
}
}


class Singleton1 {
	//1 私有化构造器
	private Singleton1() {}
	private static Singleton1 instance = null;
	public static Singleton1 getInstance() {
		if(instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
}