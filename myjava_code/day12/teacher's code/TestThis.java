/*
类的成员：
（1）属性：成员变量
（2）方法：成员方法
（3）构造器

this：当前对象

含义：
（1）如果this出现在构造器中，正在创建的对象
（2）如果this出现在成员方法中，正在调用该方法的对象

什么情况下需要用到this？
（1）this.属性
当局部变量与实例变量（属性）同名时，可以在实例变量的前面加“this.”；  ---》主要记必须用的地方
如果没有局部变量与实例变量同名问题，完全可以省略属性前面的"this."。

（2）this.方法
在成员方法中访问本类的其他成员方法时，可以加"this."，但是完全可以省略"this."

（3）this()或this(实参列表)
this()表示调用本类的无参构造
this(实参列表)表示调用本类的有参构造

要求：必须在构造器的首行

*/
class TestThis{
	public static void main(String[] args){
		Circle c = new Circle(1.2);//创建圆对象的同时为半径赋值为1.2
		System.out.println(c.getInfo());
		
		/*
		需求：希望无论你通过无参构造还是有参构造，创建的圆对象，在创建时，都打印一句话：“一个圆正在被创建...”
		*/
		Circle c2 = new Circle();
	}
}

class Circle{
	private double radius;
	
	//无参构造
	public Circle(){
		System.out.println("一个圆正在被创建...");
	}
	
	//有参构造
	//变量的命名应该见名知意，而double r是形参，形参也是变量，也应该见名知意
	//double r的作用就是为radius赋值用的，它的值就是半径的值
	public Circle(double radius){
		this();
		this.radius = radius;		
	}
	
	public double getArea(){
		return 3.14 * radius * radius;
	}
	
	public String getInfo(){
		//return "半径：" + this.radius + "，面积：" + this.getArea();
		return "半径：" + radius + "，面积：" + getArea();
	}
}

class Customer{
	private String name;
	private String cardId;
	private String tel;
	private String address;
	
	//无参构造
	public Customer(){
		
	}
	//创建顾客对象时，为姓名和身份证号赋值
	public Customer(String name, String cardId){
		this();//调用上面的第一个无参构造
		this.name = name;
		this.cardId = cardId;
	}
	
	public Customer(String name, String cardId,String tel, String address){
		this(name,cardId);//调用上面的第二个构造器，有参构造
		//this.name = name;
		//this.cardId = cardId;
		this.tel = tel;
		this.address = address;
	}