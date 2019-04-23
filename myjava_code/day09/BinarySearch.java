public class BinarySearch{
	public static void main(String[] args) {
		//int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] arr = {1,2,3,4,5,6,7,8,9};
		//for(int i =-1 ;i<15;i++) {
		int i= 1;
		boolean flag = false ;
		int left = 0;
		int right = arr.length-1;
		int mid = (left+right+1)/2;
		do {
			if(i<arr[mid])  right = mid-1 ; 
			if(i>arr[mid])  left = mid+1;
			mid = (left+right+1)/2;
			if(i==arr[mid])  {
				System.out.println("找到了，"+i+"的数组下标为"+mid);
				flag = true;
				break;
			}
			}while(left<right);
		   if(!flag) System.out.println("没找到");
		//}
		
	}
}