
public class TestObjectArray{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.name = "�޴�ΰ";
		s1.age = 30;
		s1.score = 59;
		
		Student s2 = new Student();
		s2.name = "������";
		s2.age = 23;
		s2.score = 95;
		
		Student s3 = new Student();
		s3.name = "�쳯ǿ";
		s3.age = 28;
		s3.score = 88;
		
		//��һ������ͳһ��������
		Student[] array = new Student[3];
		
		//��ѧ��������ס�������
		array[0] = s1;
		array[1] = s2;
		array[2] = s3;
		
		//������ʾ
		for(int i=0; i<array.length; i++){
			//System.out.println(array[i]);
			//array[i]��һ��Student�Ķ���
			//System.out.println(array[i].name + "\t" + array[i].age + "\t" + array[i].score);
			System.out.println(array[i].getInfo());
		}
//      ����,û�ж�����������ǽ��ɼ�����	
//		for(int i=1;i<array.length;i++) 
//			for(int j=0;j<array.length-i;j++) {
//				if(array[j].score>array[j+1].score) {
//					int temp = array[j].score;
//					array[j].score = array[j+1].score;
//					array[j+1].score = temp;
//				}
//			}
//		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i].name+"\t"+array[i].score);
		}
	}
}



class Student{
	String name;
	int age;
	int score;
	
	String getInfo(){
		return "������" + name + "�����䣺" + age +"���ɼ���" + score;
	}
}