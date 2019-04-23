
public class TestObjectArray{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.name = "崔达伟";
		s1.age = 30;
		s1.score = 59;
		
		Student s2 = new Student();
		s2.name = "李信信";
		s2.age = 23;
		s2.score = 95;
		
		Student s3 = new Student();
		s3.name = "徐朝强";
		s3.age = 28;
		s3.score = 88;
		
		//用一个数组统一管理他们
		Student[] array = new Student[3];
		
		//让学生对象入住这个数组
		array[0] = s1;
		array[1] = s2;
		array[2] = s3;
		
		//遍历显示
		for(int i=0; i<array.length; i++){
			//System.out.println(array[i]);
			//array[i]是一个Student的对象
			//System.out.println(array[i].name + "\t" + array[i].age + "\t" + array[i].score);
			System.out.println(array[i].getInfo());
		}
//      错误,没有对数组排序而是将成绩改了	
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
		return "姓名：" + name + "，年龄：" + age +"，成绩：" + score;
	}
}