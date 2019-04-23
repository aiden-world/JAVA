/*
命令行参数：给main方法传递的参数

运行Java程序：
java 类名 实参1  实参2  实参3...
用空格分隔
例如：
java TestCommandParam
java TestCommandParam chai lin yan
是否可以传整数？
java TestCommandParam 1 2 3
*/
public class TestCommandParam{
	//形参：String[] args
	public static void main(String[] args){
		System.out.println(args);
		System.out.println(args.length);
		
		for(int i=0; i<args.length; i++){
			System.out.println("第" + (i+1) + "个参数的值是：" + args[i]);
		}
		
		//求和
		int sum = 0;
		for(int i=0; i<args.length; i++){
			//sum += args[i];//编译错误，args[i]是String类型
			sum += Integer.parseInt(args[i]);//把String转成int
		}
		System.out.println("sum = " + sum);
	}
}
