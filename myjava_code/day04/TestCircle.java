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
			//System.out.println("当前半径"+'\t'+c.radius+"对应圆面积"+'\t'+c.getArea());
			 System.out.println(c.radius+"\t"+c.getArea());
		 } 
	 }
 }