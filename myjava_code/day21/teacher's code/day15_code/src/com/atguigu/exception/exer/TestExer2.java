package com.atguigu.exception.exer;

/*
 * 先完成TestExer2类的初始化，和静态的变量和静态的代码块有关。-->"a"
 * 执行main，main又调用了getOut()，因为getOut()的finally中有return，其他return都失效，所以返回3，然后打印出3
 *
 *	因为没有创建TestExer2对象，所以非静态代码块和构造器不会走
 */
public class TestExer2 {
	TestExer2(){
		System.out.println("c");
	}
	{
		System.out.println("b");
	}
	static{
		System.out.println("a");
	}

	public static String getOut(){
		try{
			return "1";
		}catch(Exception e){
			return "2";
		}finally{
			return "3";
		}
	}

	public static void main(String[] args) {
		new TestExer2();
		System.out.println(getOut());
	}

}
