package code_day19;

//import code_day19.Enum1.Gender;

public class Enum1 {
	public static void main(String[] args) {
		Gender s = Gender.MAN  ;
		@SuppressWarnings("static-access")
		Gender s1 = Gender.WOMAN.MAN.WOMAN.MAN.WOMAN;

		Employee e1 = new Employee("小米",s);
		Employee e2 = new Employee("大米",s1);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
	}
	
	
	class We extends Employee{}
	enum Gender {
		 MAN,
		WOMAN;
	}
	static class Employee{
		String name ;
		Gender sex ;
		@Override
		public String toString() {
			return "employee [name=" + name + ", sex=" + sex.name()+"]";
		}
		public Employee(String name, Gender sex) {
			super();
			this.name = name;
			this.sex = sex;
		}
		public Employee() {}
	}
		
		
	}



//class Employee{
//	String name ;
//	Gender sex ;
//	@Override
//	public String toString() {
//		return "employee [name=" + name + ", sex=" + sex.getClass()+"]";
//	}
//	public Employee(String name, Gender sex) {
//		super();
//		this.name = name;
//		this.sex = sex;
//	}
//}