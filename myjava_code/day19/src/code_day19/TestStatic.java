package code_day19;

public class TestStatic {
	public static void main(String[] args) {
		
		Husband hus = new Husband();
		//Husband.wife.husband;
	}
		
}

class Husband{
	static Wife wife;
}

class Wife{
	static Husband husband;
}