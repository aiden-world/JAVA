/*
����Ĳ��ң�
��1��˳�����
	�����Ԫ���ǿ�����������
��2�����ֲ���
    ǰ�᣺�����Ԫ���������

*/
class ArrayBinarySearch{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("������������");
		int num = input.nextInt();
		
		/*
		//���������Ԫ���Ǵ�С����
		��һ��������num��������м��Ԫ�ؽ��бȽϣ����Ƿ���Ҫ���ҵ���
		�м��Ԫ�أ�arr.length/2  ���磺length��10  �м��Ԫ��  arr[5]  
										length��9   �м��Ԫ��  arr[4]
		���num���м��Ԫ�ز����
		if(num > �м��Ԫ��){
			������
		}else if(num < �м��Ԫ��){
			������
		}else{
			�ҵ���
		}
		*/
		int index = -1;
		int left = 0;
		int right = arr.length - 1;
		int mid = (left + right + 1) /2;
		
		while(left < right){
			if(num == arr[mid]){
				index = mid;
				break;
			}else if(num < arr[mid]){
				//�������
				right = mid -1;//����right = mid;
			}else{
				//���ұ���
				left = mid + 1;//����left = mid;
			}
			mid = (left + right + 1) /2;
		}	
		
		if(index == -1){
			System.out.println("û�ҵ�");
		}else{
			System.out.println("�±꣺" + index);
		}
	}
}