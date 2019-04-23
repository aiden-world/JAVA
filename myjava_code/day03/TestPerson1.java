import java.util.Scanner;
public class TestPerson1 {
	public static void main (String[] args){
		Person p1 = new Person();
		System.out.println("依次输入名字，年龄，性别");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int age = input.nextInt();
		String sex  = input.next();
		p1.setPerson(name,age,sex);
		Person p2 =p1;
		p1.student();
		System.out.println(p1.age());
		System.out.println(p2.age());
		p1.ageAdd(2);
		System.out.println(p1.age());
		System.out.println(p2.age());
		System.out.print();
	}
}

class Person {
      String name ;
	  int age;
	  String sex  ;
	  public void student(){System.out.println("studying"); }
	  public int  age(){return age;}
	  public void ageAdd(int i){age +=i;}
	  public void setPerson(String a,int b,String c){
	  name =a ; 
	  age =b;
	  sex = c;
	  }
}
