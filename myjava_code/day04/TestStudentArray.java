import java.util.Scanner;
public class TestStudentArray {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("������Ҫ¼���ѧ����");
	int num = input.nextInt();
	Student[] stuArr = new Student[num];
	System.out.println("����������"+stuArr.length+"��ѧ�������ֺͷ���");
	for(int j=0;j<stuArr.length;j++) {
		System.out.println("�������"+(j+1)+"��ѧ�������ֺͷ���");
		stuArr[j] = new Student();
		stuArr[j].name = input.next();
		stuArr[j].score = input.nextInt();
	}
	//��static main�е��÷�static������Ҫ�ö�������
	//TestStudentArray tsa = new TestStudentArray();
	HandleStudent hs = new HandleStudent();
	hs.printInfo(stuArr);
	hs.sort(stuArr) ;
	hs.printInfo(stuArr);
}
	
	
	
}
class HandleStudent{
	void sort(Student[] stuArr) {
	System.out.println("�����鰴ѧ���ɼ��������ð������");
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
		System.out.println("������ʾѧ����Ϣ");
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