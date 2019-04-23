public class TestI{
	public static void main(String[] args){
		int i= 2;
		int j= ++i * i-- + i++ * --i;
		System.out.println(i+" "+j);
	}
	
}