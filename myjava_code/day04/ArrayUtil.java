public class ArrayUtil {
	//���������ֵ
	public int getMax(int[] arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			
		}
		return max;
	}
	//��������Сֵ
	public int getMin(int[] arr) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min<arr[i]) {
				min = arr[i];
			}
			
		}
		return min;
	}
	//��������Ԫ��
	public void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("]");
	}
	//�������ƽ����
	public int getAverage(int[] arr) {
		int sum = getSum(arr);
		return  sum/arr.length;
	} 
	//��������ܺ�
	public int getSum (int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) 
			sum += arr[i] ;	
		return sum;
	}
	//����ķ�ת
	public int[] reverse(int[] arr) {
		for(int x=0,y=arr.length-1;x<y;x++,y--) {
			int temp = arr[y];
			arr[y] = arr[x];
			arr[x] = temp;
			}
		return arr;	
	}
 	//ʵ������ĸ���
	public int[] copy(int[] arr){
		//int[] arr1 =arr; ���󣬶ѿռ������黹��ֻ��һ��
		int[] arr1 =new int[arr.length];
		for(int i = 0;i < arr.length];i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}
	//�������������
	public void sort(int[] arr,String type) {
		if(type == "asc") {
		for (int i = 0; i < arr.length - 1; i++) 
			for (int j = 0; j < arr.length - 1 - i; j++) 
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		}
		else if(type == "desc") {
			for (int i = 0; i < arr.length - 1; i++) 
				for (int j = 0; j < arr.length - 1 - i; j++) 
					if (arr[j] < arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
		}
		else System.out.println("��������ʽ��������");
	}
	//������ָ��Ԫ�ؽ��н�������������Ϊi��j������Ԫ��
	public void swap(int[] arr ,int i,int j) {
		int temp =arr[j];
		arr[j] = arr[i];
		arr[i] = temp ;
	}
	
	
	
	
}
