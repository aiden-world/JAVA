/*
3、定义一个丈夫Husband类，有姓名、年龄、妻子属性，属性私有
   定义一个妻子Wife类，有姓名、年龄、丈夫属性，属性私有
   丈夫类中有一个getInfo方法，其中，能显示自己的姓名，年龄，和他的妻子的姓名，年龄
   妻子类中有一个getInfo方法，其中，能显示自己的姓名，年龄，和她的丈夫的姓名，年龄
   定义一个测试类，创建妻子和丈夫对象，然后测试
  */
class Day8_Homework3{
	public static void main(String[] args){
		Husband h = new Husband();
		h.setName("崔达伟");
		h.setAge(30);
		
		Wife w = new Wife();
		w.setName("如花");
		w.setAge(18);
		
		//结婚
		h.setWife(w);
		w.setHusband(h);
		
		System.out.println(h.getInfo());
		System.out.println(w.getInfo());
	}
}
class Husband{
	private String name;
	private int age;
	private Wife wife;
	
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	
	public void setWife(Wife w){
		wife = w;
	}
	public Wife getWife(){
		return wife;
	}
	
	public String getInfo(){
		return "丈夫的信息：姓名：" + name + "，年龄：" + age + "，他的妻子：姓名：" + wife.getName() + "，年龄：" + wife.getAge();
	}
}
class Wife{
	private String name;
	private int age;
	private Husband husband;
	
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	
	public void setHusband(Husband h){
		husband = h;
	}
	public Husband getHusband(){
		return husband;
	}
	
	public String getInfo(){
		return "妻子的信息：姓名：" + name + "，年龄：" + age + "，他的丈夫：姓名：" + husband.getName() + "，年龄：" + husband.getAge();
	}
}