import java.util.*;
public class GroupScore {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("������༶������");
			int group = input.nextInt();
			int[][] stu = new int[group][];
			int[] sum = new int[stu.length]; 
			int[] stuGrpMax = new int[stu.length];
			for(int i=0;i<stu.length;i++) {
			System.out.println("������"+(i+1)+"�������");
			int stuNum = input.nextInt();
			 stu[i] = new int[stuNum];
			 sum[i] = 0;
			 stuGrpMax[i]=-1;
			System.out.println("����������"+(i+1)+"��ͬѧ�ĳɼ�");
			for(int j=0;j<stu[i].length;j++) {
				stu[i][j]= input.nextInt();
				sum[i] +=stu[i][j]; 
				if(stu[i][j]>=stuGrpMax[i]) stuGrpMax[i]=stu[i][j];
			}
			}		
			int sumAll = 0;
			double maxAll = -1; 
			int allStuNum = 0;
			for(int i=0;i<stu.length;i++) {
				System.out.println(i+1+"���ͬѧ��ƽ����Ϊ"+(double)sum[i]/stu[i].length);
				System.out.println(i+1+"���ͬѧ����߷�Ϊ"+stuGrpMax[i]);
				sumAll +=sum[i];
				allStuNum += stu[i].length;
				if(maxAll<=stuGrpMax[i]) maxAll =stuGrpMax[i];
			}
			System.out.println("����ͬѧ��ƽ����Ϊ"+(double)sumAll/allStuNum);
			System.out.println("����ͬѧ����߷�Ϊ"+maxAll);		
		}
}
