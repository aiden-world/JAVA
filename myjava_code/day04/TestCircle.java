class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		new	PassObject().printAreas(c1 , 5);
		
	}
}

 
 class Circle {
	 double radius;
	 double getArea(){return Math.PI*radius*radius;}
	 void setRadius(double i) {radius = i;}
 }
 
 
 
 
 class PassObject{
	 public void printAreas(Circle c,int time){
		 System.out.println("radius"+'\t'+"area"+'\t');
		 for(int i=1;i<=time;i++) {
			 c.setRadius(i);
			//System.out.println("��ǰ�뾶"+'\t'+c.radius+"��ӦԲ���"+'\t'+c.getArea());
			 System.out.println(c.radius+"\t"+c.getArea());
		 } 
	 }
 }