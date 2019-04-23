package code_day19;

/*
 * 3、JDK1.5之后，简化了枚举类的声明和实现
 * 语法格式：
 * 	【修饰符】  enum 枚举类型名{
 * 		枚举的常量对象列表【;
 * 		  其他成员列表
 * 		】
 * }
 * 
 * 要求：枚举的常量对象列表必须在枚举类的首行
 * 
 * 4、枚举也是类，也可以有其他的成员
 * 5、枚举类的父类
 * 枚举类的父类是java.lang.Enum
 * (1)String toString()：父类中重写了Object的toString,返回常量对象的名称，不建议重写，但是可以手动重写
 * (2)String name()：常量名
 * (3)int ordinal()：常量对象的顺序
 * (4)int compareTo(Object o)：枚举类型的自然排序规则是常量对象的顺序
 * 
 * 6、switch
 * switch()中表达式的类型从JDK1.5之后支持枚举类型。
 * 
 * 7、API中没见到的方法
 * (1)枚举[] values()：返回该枚举的所有常量对象
 * (2)枚举   valueOf("常量名")：把字符串转为枚举对象
 * 
 *
 * 回忆：
 * 首行
 * （1）package在源文件首行
 * （2）this()和this(实参列表)
 * （3）super()和super(实参列表)
 * （4）枚举常量对象
 * 
 */
public class TeacherEnum1 {
	public static void main(String[] args) {
		Week mon = Week.MONDAY;
		System.out.println(mon);
		System.out.println(mon.getDes());
		
		System.out.println(mon.name());
		System.out.println(mon.ordinal());
		
		Week w = Week.TUESDAY;
		//switch()中的表达式类型：byte,short,int,char,枚举，String
		switch(w){
		case MONDAY:
			System.out.println("星期一");
			break;
		case TUESDAY:
			System.out.println("星期二");
			break;
		}
		
		Week[] weeks = Week.values();
		for (int i = 0; i < weeks.length; i++) {
			System.out.println(weeks[i]);
		}
		
		Week xing = Week.valueOf("SUNDAY");
		System.out.println(xing);
	}
}
//声明一个星期的枚举类型
enum Week{
	MONDAY("星期一是最困的一天"),
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY("星期六是最开心的一天"),
	SUNDAY;
	
	private String des;//描述

	private Week(){}
	private Week(String des) {
		this.des = des;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
}