public class TestTriangle {	
	public static void main(String[] args) {
	Triangle t= new Triangle(3.0,4.0,5.0);	
	System.out.println("���������Ϊ:"+t.getTriangleArea());
	System.out.println("�������ܳ�Ϊ:"+t.getSumLength());
	t.printInfo();
	t.setA(7.0);
	t.setB(16.0);
	t.printInfo();
	t.setB(7.0);
	t.printInfo();
	}
}



class Triangle {
	private  double a,b,c;
	public Triangle(double a1,double b1,double c1){a=a1; b=b1; c=c1;}
	public Triangle() {}
	public boolean isTriangle() {
		if(a>=(b+c)||b>=(a+c)||c>=(b+a)) return false;
		else return true ;
	}
	
	public boolean isRightTriangle() {
		if(a*a==(b*b+c*c)||b*b==(a*a+c*c)||c*c==(b*b+a*a)) return true;
		else return false ;
	}
	public boolean isIsoscelesTriangle() {
		if(this.isTriangle()) {
			if(a==b||a==c||b==c) 
				return true;
			else return false ;
			}
		else return false ;
	}
	public double getSumLength() {
		return a+b+c;
	}
	public double getTriangleArea(){
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c)) ;
		}
	public double getA() {return a ;}	
	public double getB() {return b ;}	
	public double getC() {return c ;}	

	public void setA(double a1) {a= a1;}
	public void setB(double b1) {b= b1;}
	public void setC(double c1) {c= c1;}
	
	public void printInfo() {
		System.out.println("���߳�Ϊ"+"\t"+a+"\t"+b+"\t"+c);
		if(isRightTriangle()) System.out.println("�ܹ���������");
		else System.out.println("���ܹ���������");
		if(isIsoscelesTriangle()) System.out.println("�ܹ��ɵ���������");
		else System.out.println("���ܹ��ɵ���������");
		if(isRightTriangle()) System.out.println("�ܹ���ֱ��������");
		else System.out.println("���ܹ���ֱ��������");
	}
	
	
}
