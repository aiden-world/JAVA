package code_day18;



public class Exer5 {
	public static void main(String[] args) {
		Other2 o = new Other2();
		new Exer5().addOne(o);
		System.out.println(o.i);
	}
	
	public void addOne(final Other2 o){
		o.i++;
	}
}
class Other2{
	public int i;
}
