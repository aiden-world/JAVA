
public class TestGraphicTools {
	public static void main(String[] args) {
		Triangle t = new Triangle(4.0,5.0,3.0);
		GraphicTools tool = new GraphicTools();
		System.out.println("三角面积为"+tool.getTriangleArea(t));
		System.out.println("三角面积为"+tool.getTriangleArea(3.0,4.0,5));
		System.out.println("三角面积为"+tool.getTriangleArea(3.0,4.0));

	}
}




class Triangle {
	 double length1,length2,length3;
	 Triangle(double a,double b,double c){length1=a; length2=b; length3=c;}
}


 class GraphicTools {
	double getTriangleArea(Triangle t){
		double p = (t.length1+t.length2+t.length3)/2;
		return Math.sqrt(p*(p-t.length1)*(p-t.length2)*(p-t.length3)) ;
		}
	double getTriangleArea( double length1,double length2,double length3){
		double p = (length1+length2+length3)/2;
		return Math.sqrt(p*(p-length1)*(p-length2)*(p-length3)) ;
		}
	double getTriangleArea( double length,double height){
		return length*height/2 ;
		}
	
	
	
}
