package code_day17;
import java.util.Scanner;
import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入学生的成绩：（以负数代表输入结束）");
		//2.for(;;),从键盘依次获取学生的成绩，并填入由Vector v=new Vector()创建的对象v中。
		Vector v = new Vector(); 
		
		int maxScore = 0;//记录最高分
		for(;;){
			int score = s.nextInt();
			if(score < 0){
				break;
			}
			//3.求出所有输入的正的成绩中的最高分
			//获取学生成绩中的最高分
			if(maxScore < score){
				maxScore = score;
			}
			//依次将学生成绩村放入v中
			Integer  score1 = new Integer(score);
			v.addElement(score1);
			
		}
		
				
		//4.通过v.elementAt(i)依次获取填入v中的元素，同时判断一下各个分数的等级并输出。
				for(int i = 0;i < v.size();i++){
					Integer score = (Integer)v.elementAt(i);
					char level;
					if(maxScore - score <= 10){
						level = 'A';
					}else if(maxScore - score <= 20){
						level = 'B';
					}else if(maxScore - score <= 30){
						level = 'C';
					}else{
						level = 'D';
					}
					System.out.println("学生成绩为：" + score + ",等级为：" + level);
				}
		
		
		
		
		
		
	}
}
