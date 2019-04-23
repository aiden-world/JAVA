/*
 * 题目一：
 * 编写程序，定义三个重载方法并调用。方法名为mOL。
 三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，
 相乘并输出结果，输出字符串信息。
 在主类的main ()方法中分别用参数区别调用三个方法。
题目二：
定义三个重载方法max()，第一个方法求两个int值中的最大值，
第二个方法求两个double值中的最大值，
第三个方法求三个double值中的最大值，并分别调用三个方法。
 */
 
 
 public class TestOverLoad {
	public static void main (String[] args){
		mOL t = new mOL();
		
	 System.out.println(t.mOL(2));
	 t.mOL(2,4);
	 t.mOL("暴风雪"); 
	}	 
	
 }
 class mOL{
	int mOL(int i){
			System.out.println(i*i) ;
			return i*i;
			}
			
		int mOL(int i1 ,int i2){
			System.out.println(i1*i2);
			return i1*i2;
		}
		void mOL(String s){
		System.out.println(s);
		}
 
 }
 
 
 
 
 
 