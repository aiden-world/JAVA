package code_day18;

public class Homework1 {
	
	 	public static void main(String[] args) {
	  		Out.In in = new Out().new In();
	  		in.print();
	  		Out out = new Out();
	  		Out.In i = out.new In();
	  		i.print();
	 	}
	}
	class Out {
	    private int age = 12;
	    //内部类
	    class In {
	        public void print() {
	            System.out.println(age);
	        }
	    }

}
	
