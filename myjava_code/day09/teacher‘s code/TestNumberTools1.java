/*1、练习

（3）声明一个方法，功能：
	求出a和b两个int值的和并返回
（4）声明一个方法，功能：
	用冒泡排序实现给一个int[]的一维数组排序
（5）声明一个方法，功能：
	求一个x的y次方，并返回结果
*/
class TestNumberTools1{
	public static void main(String[] args){
		
		NumberTools nl = new NumberTools();
		
		int count = nl.sum(3,5);
		System.out.println("a和b的和是："+ count);
		System.out.println("a和b的和是："+ count);
		System.out.println("a和b的和是："+ count);
		System.out.println("a和b的和是："+ count);
		
		
	}

}



class NumberTools{
	
	int sum(int a,int b){
		int he = a +b;
		return he;
	} 


}




