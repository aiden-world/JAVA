/*
����Ĵ�����
���ȵ�һ������Ҫ�������
    �����ĸ���Ķ���ʵ����

1��������������
	���� ������;
	
2����������
	������ = new ����();
	
3��ʹ�ö���
	������.���� = ֵ;
	System.out.println(������.����);
	
	������.����();
*/
import java.util.Scanner;
import java.util.Random;

class TestCreateObject{
	public static void main(String[] args){
		//����1������Teacher��Ķ���
		//Teacher��������t1���Ƕ�����
		//��һ������������
		//Teacher t1;
		
		//�ڶ�������������
		//t1 = new Teacher();
		
		//���԰ѵ�һ���͵ڶ���������
		Teacher t1 = new Teacher();
		
		//Ϊt1�����name���Ը�ֵ
		t1.name = "����";
		//Ϊt1�����age���Ը�ֵ
		t1.age = 23;
		
		//����t1�����name����ֵ
		System.out.println("������" + t1.name);
		//����t1�����age����ֵ
		System.out.println("���䣺" + t1.age);
		
		//���䣺
		/*
		Scanner input = new Scanner(System.in);
		//input�Ƕ�������nextInt()�Ƿ���
		int num = input.nextInt();
		
		Random rand = new Random();
		//rand�Ƕ�����,nextInt(100)Ҳ�Ƿ���
		int sui = rand.nextInt(100);
		*/
	}
}
class Teacher{
	String name;
	int age;
}