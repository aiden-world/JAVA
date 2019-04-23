package code_day18;

public class TestInterface {
public static void main(String[] args) {
	
}
}


interface Sleep {
	int   TIME  =  300;
	void sleeping();
}

class Biology{
	int age;
}
class Animal extends Biology implements Sleep{
	public void sleeping(){
		System.out.println("sleeping");
		}
}