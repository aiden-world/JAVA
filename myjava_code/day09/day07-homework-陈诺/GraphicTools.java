
public class GraphicTools {
	double getCircleArea(Circle c){return Math.PI*c.radius*c.radius;}
	double getRectangleArea(Rectangle r){return r.length*r.width;}
	double getTriangleArea(Triangle t){
		double p = (t.length1+t.length2+t.length3)/2;
		return Math.sqrt(p*(p-t.length1)*(p-t.length2)*(p-t.length3)) ;
		}
}
