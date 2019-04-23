import java.util.Scanner;
public class CountStuScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入人数");
		int num = input.nextInt();
		int[] stuScore = new int[num];
		boolean flag = true;
		for(int i =0 ; i<stuScore.length;i++) {
			stuScore[i] = input.nextInt();
			if (stuScore[i]>100||stuScore[i]<0) {
				flag = false;
				System.out.println("输入错误");
				break;
			}		
		}
		if(flag) {
		int sum =0 ,max =0,min=101;
		for(int i =0 ; i<stuScore.length;i++) {
			//System.out.println(stuScore[i]);
			sum +=stuScore[i];
			if(max<stuScore[i]) max = stuScore[i];
			if(min>stuScore[i]) min = stuScore[i];
			}
		System.out.println("avg="+(double)sum/stuScore.length+ " min="+min+" max="+max);
	}
  }
}
