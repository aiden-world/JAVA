
public class TestArray {
	public static void main(String[] args) {
		int[] arr = new int[] {12,4,76,0,-98,-54,4,100};
		
		ArrayUtil au = new ArrayUtil();
		int  max = au.getMax(arr);
		System.out.println("���ֵΪ��" + max );
		
		int avg = au.getAverage(arr);
		System.out.println("ƽ��ֵΪ��" + avg );
		
		au.printArray(arr);

		System.out.println("��ת����" );
		au.reverse(arr);
		
		au.printArray(arr);
		
		System.out.println("�����齵������");
		au.sort(arr,"desc");
		au.printArray(arr);
		
		System.out.println("��������������");
		au.sort(arr,"asc");
		au.printArray(arr);
		
		System.out.println("������һλ�͵���λ��");
		au.swap(arr, 0, 2);
		au.printArray(arr);
		
	}

}
