import java.awt.Shape;
class FindMaxDemo{
	public static Comparable findMax(Comparable[] arr) {
		int maxIndex = 0 ;
		for (int i=1;i<arr.length;i++) {
			if(arr[i].compareTo(arr[maxIndex])>0)
				maxIndex = i;
		return arr[maxIndex];
		}
	}
	public static void main(String[] args) {
		Shape[] sh1 = { new Circle (2.0),
						new Circle (3.0),
						new Rectangle(3.0,4.0)};
		String[] st1 = {"Joe","Bob","Bill","Zeke"};
		System.out.println(findMax(sh1));
		System.out.println(findMax(st1));

		}
	}

class Circle {
	 double radius;
	 double getArea(){return Math.PI*radius*radius;}
	 void setRadius(double i) {radius = i;}
	 Circle(double r){ radius = r;}
}

class Rectangle {
	 double length;
	 double weight;
	 double getArea(){return length*weight;}
	 Rectangle(double a,double b){ length = a ; weight = b;}
}



