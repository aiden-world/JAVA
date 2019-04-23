class TestCircle1 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();	
		c1.setRadius(1.2);
		c2.setRadius(2.3);
		System.out.println(c1.radius);
		System.out.println(c2.radius);
		System.out.println(c1.findArea());
		System.out.println(c2.findArea());
	}
}

 
 class Circle1 {
	 double radius;
	 double findArea(){return Math.PI*radius*radius;}
	 void setRadius(double i) {radius = i;}
 }
 
 
 
 
 class PassObject1{
	 public void printArea(Circle c,int time){
		 for(int i=1;i<=time;i++) {
			 Circle 
			 
		 }
		 
	 }
 }