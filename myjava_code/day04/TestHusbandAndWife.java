
public class TestHusbandAndWife {
	public static void main(String[] args) {	
	Husband h1 = new Husband();
    Wife w1 = new Wife();
    h1.setWife(w1);
    w1.setHusband(h1);
	w1.husbandInfo();
	h1.wifeInfo();
	w1.getInfo();
    h1.getInfo();
}
}

class Husband {
	String name ;
	int age ;
	//Wife ownWife = new Wife() ;
	Wife ownWife ;
	void setWife(Wife w) {ownWife = w;}
	public void wifeInfo() {
		System.out.println("My wife's name is "+ownWife.name+",age is"+ownWife.age);
	}
	void getInfo() {
		System.out.println("My name is "+name+",age is"+age);
		wifeInfo();
	}
	
}

class Wife{
	String name ;
	int age ;
	//Husband ownHusband = new Husband();
	Husband ownHusband;
	void setHusband(Husband h ) {ownHusband = h;}
	void husbandInfo() {
		System.out.println("My husband's name is "+ownHusband.name+",age is"+ownHusband.age);
	}
	void getInfo() {
		System.out.println("My name is "+name+",age is"+age);
		husbandInfo();
	}
	
}