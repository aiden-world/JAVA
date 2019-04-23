
public class TestRectangle {
	Rectangle rt = new Rectangle();
	rt.setInfo(4.6,3.2);
	rt.printInfo();
}

 class Rectangle{
	double length;
	double weight;
	void setInfo(double i,double j) {
		length =i;
		weight =j;
	}
	
	void printInfo() {
		System.out.println(length);
		System.out.println(weight);
		System.out.println(length*weight);
		}
}