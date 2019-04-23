public class TestPerson{
	public static void main(String[] args){
		Person  p1 = new Person();
		System.out.println(p1);
		System.out.println(p1.name+p1.age);
		p1.eat();
	}
}
 class Person{
	String name ;
    int age;
    public void eat(){
	System.out.println("???");
	}		
}