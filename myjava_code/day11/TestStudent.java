public class TestStudent{
    public static void main(String[] args){
	Student s = new Student();
	s.setName("Cedric Chen");
	s.setAge(23);
	s.setScore(88.0);
	s.getInfo();		
}
}
 class Student{
	private String name;
	private int age;
	private double score;

	public String getName(){ return name; }
        public int getAge(){ return age; }
        public double  getScore (){ return score; }
        public void  setName(String s){ name = s; }
        public void setAge(int a){ age =a ; }
        public void  setScore(double s){score = s ; }
        public void getInfo(){
		System.out.println("name="+name+"\t"+"age="+age+"\tscore"+score); }


}
