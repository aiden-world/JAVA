/*
������㷨��
1������ֵ
2������ֵ�±�
3������
��1��˳�����
��2�����ֲ���
4�����������ƽ��ֵ
5�����鸴��
6������ķ�ת
7�����������
��1��ð������
��2��ֱ��ѡ������
��������...
*/
class SelectSort{
	public static void main(String[] args){
		int[] arr = {4,8,2,9,1};
		
		//ѡ������
		for(int i=1; i<arr.length; i++){//����
			//ÿһ�ֶ� 
			/*
			��һ�֣�i=1����arr[0]����arr[i-1]���Ƚ�4�Σ�arr[0]��arr[1]��arr[2]��arr[3]��arr[4]
			�ڶ��֣�i=2����arr[1]����arr[i-1]���Ƚ�3�Σ�arr[1]��arr[2]��arr[3]��arr[4]
			�����֣�i=3����arr[2]����arr[i-1]���Ƚ�2�Σ�arr[2]��arr[3]��arr[4]
			�����֣�i=4����arr[3]����arr[i-1]���Ƚ�1�Σ�arr[3]��arr[4]
			*/
			for(int j=i; j<=arr.length-1; j++){
				if(arr[i-1] > arr[j]){
					int temp = arr[i-1];
					arr[i-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//��ʾ���
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
