
public class TestHusbandAndWife {
	public static void main(String[] args) {	
	Husband h1 = new Husband("¡ı«ø∂´",46);
    Wife w1 = new Wife("’¬‘ÛÃÏ",26);
    h1.setWife(w1);
    w1.setHusband(h1);
	w1.getInfo();
    h1.getInfo();	
}
}

class Husband {
	private String name ;
	private int age ;
	//Wife ownWife = new Wife() ;
	Wife ownWife ;
	public Husband() {}
	public Husband(String s,int a) {
		name = s;
		age = a;
	}
	public void setWife(Wife w) {ownWife = w;}
	public String getName() {return name;}
	public int getAge() {return age;}
	public void wifeInfo() {
		System.out.println("My wife's name is "+ownWife.getName()+",age is "+ownWife.getAge());
	}
	public void getInfo() {
		System.out.println("My name is "+name+",age is "+age);
		wifeInfo();
	}
	
}

class Wife{
	private String name ;
	private int age ;
	//Husband ownHusband = new Husband();
	Husband ownHusband;
	public Wife() {}
	public Wife(String s,int a) {
		name = s;
		age = a;
	}
	public void setHusband(Husband h ) {ownHusband = h;}
	public String getName() {return name;}
	public int getAge() {return age;}

	void husbandInfo() {
		System.out.println("My husband's name is "+ownHusband.getName()+",age is "+ownHusband.getAge());
	}
	void getInfo() {
		System.out.println("My name is "+name+",age is "+age);
		husbandInfo();
	}
	
}