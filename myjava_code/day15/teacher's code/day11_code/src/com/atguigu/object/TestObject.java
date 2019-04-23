package com.atguigu.object;

/*
 * java.lang.Object：
 * 	类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。所有对象（包括数组）都实现这个类的方法。 
 * 
 * 根类：
 * （1）Object类是所有类的父类。
 * 一个Java类如果没有显示声明它的父类，默认继承Object类。
 * （2）所有类型的对象都拥有Object类中的方法。
 * （3）所有对象的创建，最终都会调用到Object的无参构造。
 * 		super()
 * （4）Object类型的变量可以接收任意类型的对象，可以构成多态引用
 * Object[]的数组中可以存储所有类型的对象，
 * Object的形参，可以接收任意类型的对象作为实参。
 * 
 * 
 * API：Application Programming Interface，应用程序编程接口。
 * 通俗的讲就是帮助文档，说明书。
 * 
 * 总结：
 * java.lang.String
 * java.lang.System
 * java.lang.Math
 * 
 * Java中使用java.lang包的类不需要导包
 * 
 * 
 * java.lang.Object的方法：
 * （1）public String toString()：返回该对象的字符串表示
 *   ①Object根父类中，对该方法的实现：
 *   	对象的运行时类型@该对象的哈希码的十六进制形式
 *   ②建议子类重写，返回该子类对象的详细信息。
 *   ③当直接打印一个对象时，默认调用的是这个对象的toString方法
 *   或当一个对象与字符串进行拼接时，也是默认调用该对象的toString方法
 *   
 * （2）public int hashCode() ：返回该对象的哈希码值。
 * 把一个对象的所有信息，用一个“公式”计算出来的一个int值。
 * 希望用一个数字来代表一个对象，就好比，生活中用一个身份证号码来代表一个人。
 * 
 * 	实际上，由 Object 类定义的 hashCode 方法确实会针对不同的对象返回不同的整数。
 * 
 * 如果没有重写，不同的对象的hashCode值不一样，但是如果子类重写了，就不一定了，会导致不同的对象返回相同的hash码。
 * 
 * 以后，不能仅凭hash码来判断两个对象是否相等。
 * 
 * （3）public boolean equals(Object obj)：指示其他某个对象（obj）是否与此对象（this）“相等”。 
 * Object类中对equals方法的实现，等同于==，换句话说如果一个类没有重写equals方法，那么它的实现等同于==。
 * 如果重写了equals，那么看你重写时比较这两个对象的什么了。
 * 
 * 重写equals必须遵循如下几个原则：
 * ①自反性：  x.equals(x)必须返回true，x必须是非null
 * ②对称性：x.equals(y)和y.equals(x)结果必须一样
 * ③传递性：x.equals(y)相等，y.equals(z)相等，那么x.equals(z)也必须相等
 * ④一致性：只要两个对象参与比较的内容没有修改过，无论什么时候用equals比较的结果应该一样。
 * ⑤x.equals(null)返回false，x不为null
 * 
 * 结论：
 * （1）如果两个对象的hash值不相等，那么这两个对象一定不相等。
 * （2）如果两个对象的hash值相等，那么他们不一定相等，确认相等的方法是equals方法。
 * （3）如果两个对象equals相等，那么他们的hash值一定相等
 * 
 * 
 * （4）Class getClass()：返回此对象运行时类型
 * Person p = new Woman();
 * System.out.println(p.getClass());//Woman
 * 
 * Object obj  =new Woman();
 * System.out.println(p.getClass());//Woman
 * 
 */
public class TestObject {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.toString());
		//如果Circle没有重写toString(),那么结果：com.atguigu.object.Circle@15db9742
		//如果Circle重写了toString()，按照重写的打印
		
		System.out.println(c);//默认调用toString
		
		String info = "对象的信息：" + c;//与字符串拼接，默认也是调用toString
		System.out.println(info);
		
		String s1 = "BB";
		String s2 = "Aa";
		System.out.println(s1.hashCode());//2112
		System.out.println(s2.hashCode());//2112
		System.out.println("-----------------------------------");
		
		int a = 10;
		int b = 10;
		System.out.println(a==b);//比较的是数据值
		
		Circle c1 = new Circle(1.0);
		Circle c2 = new Circle(1.0);
		System.out.println(c1 == c2);//比较的是地址值
		System.out.println(c1.equals(c2));
		/*
		 * Circle没有重写equals，等同与==
		 */
		
		System.out.println(c1.equals(c1));//自己和自己比较
		System.out.println(c1.equals(null));//非空对象与null比较返回false
		System.out.println(c1.equals("张三"));//c1和"张三"的类型不一致
	}
}
class Circle{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)  //this对象和obj对象的地址相等，说明就是自己和自己比较，返回true
			return true;
		
		if (obj == null)//obj为空，就返回false，因此此时this一定非空
			return false;
		
		//getClass()：其实就是this.getClass()，当前对象的类型
		//obj.getClass()：obj编译时类型是Object,运行时类型得看你传入的实参对象
		if (getClass() != obj.getClass())
			return false;
		
		//如果代码运行到这里，说明：this!=obj，this和obj都非空，this和obj的运行时类型都是Circle
		Circle other = (Circle) obj;//向下类型转换
		
		//比较this对象和obj对象的半径是否相等
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))//other.radius也是Circle的radius，也是本类中访问
			return false;
		return true;
	}
	
	
}