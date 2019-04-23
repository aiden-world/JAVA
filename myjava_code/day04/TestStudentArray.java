import java.util.Scanner;
public class TestStudentArray {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("请输入要录入的学生数");
	int num = input.nextInt();
	Student[] stuArr = new Student[num];
	System.out.println("请依次输入"+stuArr.length+"个学生的名字和分数");
	for(int j=0;j<stuArr.length;j++) {
		System.out.println("请输入第"+(j+1)+"个学生的名字和分数");
		stuArr[j] = new Student();
		stuArr[j].name = input.next();
		stuArr[j].score = input.nextInt();
	}
	//在static main中调用非static方法需要用对象引用
	//TestStudentArray tsa = new TestStudentArray();
	HandleStudent hs = new HandleStudent();
	hs.printInfo(stuArr);
	hs.sort(stuArr) ;
	hs.printInfo(stuArr);
}
	
	
	
}
class HandleStudent{
	void sort(Student[] stuArr) {
	System.out.println("对数组按学生成绩升序进行冒泡排序");
	for(int j=0;j<stuArr.length-j;j++) 
	  for(int i=0;i<stuArr.length-j-1;i++) {
		if(stuArr[i].score>stuArr[i+1].score) {
			//Student temp = new Student();
			Student temp = stuArr[i];
			stuArr[i] = stuArr[i+1];
			stuArr[i+1] = temp;
		}
	}
}
	
	void printInfo(Student[] stuArr) {
		System.out.println("遍历显示学生信息");
		for(int j=0;j<stuArr.length;j++) {
			System.out.println("name  "+stuArr[j].name+'\t'+"score"+'\t'+stuArr[j].score);
		}
		}
}

class Student {
	String name ;
	int score ;
	void setInfo(String s,int i) {name = s; score = i;}
}