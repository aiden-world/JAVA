/*
1��ʹ�ö�ά�����ӡһ�� 10 ���������.
1
1 1
1 2 1
1 3 3  1
1 4 6  4  1
1 5 10 10 5 1
 ....
  
����ʾ��
 1. ��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
 2. ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
 3. �ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ��. 
     yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
     yanghui[2][1] = yanghui[1][0] + yanghui[1][1] = 1+1 =2
     yanghui[3][1] = yanghui[2][0] + yanghui[2][1] = 1+2 =3
     yanghui[3][2] = yanghui[2][1] + yanghui[2][2] = 2+1 =3
*/
class Homework1{
	public static void main(String[] args){
		//ʹ�ö�ά�����ӡһ�� 10 ���������
		int[][] yanghui = new int[10][];
		
		//ȷ��ÿһ�е�����
		for(int i=0; i<yanghui.length; i++){
			//��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
			yanghui[i] = new int[i+1];
		}
		
		//����ά���鸳ֵ
		for(int i=0; i<yanghui.length; i++){
			
			//ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
			yanghui[i][0] = 1;
			yanghui[i][yanghui[i].length-1] = 1;//yanghui[i][i] = 1;
			
			//Ϊ�ǵ�һ�������һ��Ԫ�ظ�ֵ
			for(int j=1; j<yanghui[i].length-1; j++){
				//�ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ��
				yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
			}
		}
		
		//������ʾ
		for(int i=0; i<yanghui.length; i++){
			for(int j=0; j<yanghui[i].length; j++){
				System.out.print(yanghui[i][j]  + "\t");
			}
			System.out.println();
		}
	}
}	 