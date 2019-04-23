package code_day21;

public class MyTryCatch {
	public static void main(String[] args) {
		  try{
			  int num1 = Integer.parseInt(args[0]);
			  System.out.println(num1);
		  }catch(Exception e) {
			  System.err.println("错了");
			  e.printStackTrace();
		  }
		  finally {
			  System.out.println("祈年殿");
		  }
		  
		  	try {
				int num2 = Integer.parseInt(args[0]);
				System.out.println(num2);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("第二段错误");
			}
	}
}
