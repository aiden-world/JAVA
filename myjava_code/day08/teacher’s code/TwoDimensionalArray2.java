/*
��ά���飺
	��ά���������������ά������.length
	ÿһ�У���ά������[���±�]   ���±� [0, ��ά������.length-1]
	ÿһ�е������� ��ά������[���±�].length
	ÿһ��Ԫ�أ���ά������[���±�][���±�]  ���±�[0, ��ά������[���±�].length-1]
*/
class TwoDimensionalArray2{
	public static void main(String[] args){
		//����һ����ά����
		int[][] scores;
		
		//������ά����
		//��һ������ָ������
		scores = new int[3][];
		
		System.out.println("��ά��������" + scores);
		
		for(int i=0; i<scores.length; i++){
			System.out.println("��" +(i+1)+ "�У�" + scores[i]); 
		}
		
		//��2��Ϊÿһ�е�����������
		//���û����һ��������Ĵ���ᱨNullPointerException��ָ���쳣
		scores[0] = new int[4];//����һ�з���4��
		scores[1] = new int[5];//���ڶ��з���5��
		scores[2] = new int[3];//�������з���3��
		
		//������ά����
		for(int i=0; i<scores.length; i++){
			for(int j=0; j<scores[i].length; j++){
				System.out.print(scores[i][j] +"\t");
			}
			System.out.println();
		}
	}
}