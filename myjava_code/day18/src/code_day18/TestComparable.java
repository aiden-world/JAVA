package code_day18;

public class TestComparable {
	public static void main(String[] args) {
		
	}
}



//interface myArray{
//	public void sort(Object obj)  ;
//	}


class Student implements Comparable{
	String name ;
	int score ;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public int compareTo (Object obj) {
		//Student c = (Student)obj;
		System.out.println(((Student)obj).getClass());
		score = (int)3.3;
		return this.score - ((Student)obj).score;
		//return this.score - c.score;

	}
}