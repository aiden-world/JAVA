/*
2���Ӽ���ȷ���༶���������ڴӼ�������ÿһ���������������ÿһ��ѧԱ�ĳɼ����������
ÿһ���ƽ���֣�ȫ����ƽ���֣�ÿһ�����߷֣�ȫ������߷֣�����ʾ���
*/
class Homework2{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//�Ӽ���ȷ���༶������  --> ���Ƕ�ά���������
		System.out.print("������һ���м��飺");
		int count = input.nextInt();
		
		//������ά���飬������ɼ�
		int[][] scores = new int[count][];
		
		//ȷ��ÿһ�������--->ȷ��ÿһ�е�����
		for(int i=0; i<scores.length; i++){
			System.out.print("�������" + (i+1) +"���������");
			int ren = input.nextInt();
			scores[i] = new int[ren];
		}
		
		//ȷ��ÿһ���˵ĳɼ� -->Ϊ��ά�����Ԫ�ظ�ֵ
		for(int i=0; i<scores.length; i++){
			for(int j=0; j<scores[i].length; j++){
				System.out.print("�������" + (i+1) +"��ĵ�" + (j+1) + "��ѧԱ�ĳɼ���");
				scores[i][j] = input.nextInt();
			}
		}
		
		//��ʾ
		for(int i=0; i<scores.length; i++){
			for(int j=0; j<scores[i].length; j++){
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
		}
		
		//����ȫ���ƽ���֣�����߷�
		double sum = 0;
		int total = 0;
		int max = scores[0][0];//�����һ��ĵ�һ��ѧԱ�ĳɼ����
		//��max�������˶��Ƚ�һ��
		for(int i=0; i<scores.length; i++){
			for(int j=0; j<scores[i].length; j++){
				
				sum += scores[i][j];
				total++;
				
				if(scores[i][j] > max){
					max = scores[i][j];
				}
			}
		}
		System.out.println("ȫ���ƽ���֣�" + sum/total);
		System.out.println("ȫ�����߷֣�" + max);
		
		//ÿһ���ƽ���ֺ���߷�
		//���Ҫ�洢ÿһ���ƽ���ֺ���߷֣��м�����м���ƽ���ֺ���߷�
		double[] avgs = new double[scores.length];
		int[] maxs = new int[scores.length]; 
		for(int i=0; i<scores.length; i++){
			double groupSum = 0;//��¼ÿһ����ܷ�
			
			//����ÿһ���һ��ѧԱ�ɼ����
			maxs[i] = scores[i][0];
			
			for(int j=0; j<scores[i].length; j++){
				groupSum += scores[i][j];
				
				if(scores[i][j] > maxs[i]){
					maxs[i] = scores[i][j];
				}
			}
			
			//��������ƽ���� = ������ܷ�/���������
			avgs[i] = groupSum/scores[i].length;
		}
		
		//��ʾ���
		System.out.println("ÿһ���ƽ���ֺ���߷֣�");
		for(int i=0; i<scores.length; i++){
			System.out.println("��"+(i+1)+"���ƽ�����ǣ�"+avgs[i]+"����߷֣�" + maxs[i]);
		}
	}
}