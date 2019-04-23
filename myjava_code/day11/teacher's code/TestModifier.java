/*
权限修饰符：也称为访问控制修饰符
1、权限修饰符有哪些？
private（私有的）
缺省：（省略的）
protected（受保护的）
public（公共的）

2、权限修饰符可以修饰什么？
（1）类的声明格式
【修饰符】 class 类名{
	//....
}

（2）属性的声明格式
【修饰符】 数据类型 属性名;

（3）方法的声明格式
【修饰符】 返回值类型 方法名（【形参列表】）{
	方法体
}

3、分别可以修饰什么？
（1）类（外部类）：public和缺省
	如果类是public的，要求源文件名和类名必须一致
（2）属性和方法：四种都可以

4、修饰后有什么不同？
			本类		本包的其他类		其他包的子类		其他包的非子类
private		 √				×					×					×
省略		 √				√					×					×
protected	 √				√					√					×
public		 √				√					√					√

换句话说，private表示仅限于本类中。
换句话说，缺省的表示仅限于本包中。
*/
public class TestModifier{
	public static void main(String[] args){
		Circle c = new Circle();
		//c.radius = 2.0;
	}
}
class Circle{
	private double radius;
	
	public double getArea(){
		return 3.14 * radius * radius;
	}
}