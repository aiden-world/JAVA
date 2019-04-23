package code_day25;




public class TestSingleton {
	public static void main(String[] args) {
		Single1 s1 = Single1.INSTANCE;
		Single2 s2 = Single2.INSTANCE;
		Single3 s3 = Single3.getSingle3();
		
		Lazy1 l1 = Lazy1.getInstance();
		
//		Lazy2.method();
		
		Lazy2 l2 = Lazy2.getInstance();
		Lazy2 l3 = Lazy2.getInstance();
		
		
		
		
		
	}
}

//饿汉式(1)
enum Single1{
	INSTANCE
}

//饿汉式2
class Single2{
	public static final Single2 INSTANCE = new Single2();
	private Single2() {}
}

//饿汉式3
class Single3{
	private Single3() {}
	private static final Single3 INSTANCE = new Single3();
	public static Single3 getSingle3() {return INSTANCE ;}
}


//懒汉式 不调用不生成类
//懒汉式1  

class Lazy1{
	private static  Lazy1 instance ;
	private Lazy1() {}
	
//这样写有线程安全问题
//	public static  Lazy1  getLazy1() {
//		if(instance == null) {
//		instance = new Lazy1();
//		}
//		return instance ;
//	}
	
//修正线程安全问题,但是性能不好    其实只需在instance为空时进行安全保护
//	public synchronized static  Lazy1  getLazy1() { 
//		if(instance == null) {
//		instance = new Lazy1();
//		}
//		return instance ;
//	}
//	

public static Lazy1 getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	//优化性能
	public static Lazy1 getLazy1(){
		if(instance == null ){
			synchronized (Lazy1.class) {
				if(instance ==null ) {
					instance =new Lazy1();
				}
			}
			
		}
		return instance ;
	}
}



//懒汉式2
class Lazy2{
	private Lazy2() {}
	
	static class Inner{
		public static final Lazy2 INSTANCE = new Lazy2();
	}
	
	public static Lazy2 getInstance() {
		return Inner.INSTANCE;
	}
}






















