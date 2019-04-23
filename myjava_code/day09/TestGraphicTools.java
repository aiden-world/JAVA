
public class TestGraphicTools {
	public static void main(String[] args) {
		Circle c = new Circle(3.0);
		Rectangle r = new Rectangle(3.0,4.5);
		Triangle t = new Triangle(4.0,5.0,3.0);
		GraphicTools tool = new GraphicTools();
		System.out.println("圆面积为"+tool.getCircleArea(c));
		System.out.println("矩形面积为"+tool.getRectangleArea(r));
		System.out.println("三角面积为"+tool.getTriangleArea(t));

	}
}



class Circle {
	 double radius;
	 Circle( double r) {radius = r;}
}


class Rectangle {
	 double length,width;
	 Rectangle(double a, double b){length=a; width =b;}
}

class Triangle {
	 double length1,length2,length3;
	 Triangle(double a,double b,double c){length1=a; length2=b; length3=c;}
}