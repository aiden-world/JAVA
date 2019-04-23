public class TestGC{
	public static void main(String[] args)throws Exception{
		for(int i=0; i<10; i++){
			MyClass m = new MyClass();//杩欓噷鏈寰幆瀹岋紝鏈鍒涘缓鐨勫璞″氨鎴愪负鍨冨溇浜�
			System.out.println("鍒涘缓绗�" + (i+1) + "鐨勫璞★細" + m);
		}
		
		
		System.gc();
		
		for(int i=0; i<10; i++){
			Thread.sleep(1);
			System.out.println("延迟...");
		}
	}
}
class MyClass{
	public void finalize(){
		System.out.println("轻轻的我走了.....");
	}
}
