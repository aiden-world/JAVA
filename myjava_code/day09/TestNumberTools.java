
public class TestNumberTools {
	public static void main(String[] args) {
		NumberTools n = new NumberTools();
		System.out.println(n.getMin(21.4,2.8)); 
		System.out.println(n.getSum(2121,2)); 
		System.out.println(n.xAndY(5, 8)); 
		int[] arr = {1,3,8,7,9,9,1,3,2,9,2};
		n.printArr(arr);
		n.bubbleSort(arr, "desc");
		n.printArr(arr);
		n.bubbleSort(arr, "asc");
		n.printArr(arr);
		//System.out.println(arr.hashCode()); 
		int i =2;
		System.out.println(i); 
		n.douNum(i);
		System.out.println(i); 
//		n.douNum1(this);
//		System.out.println(i); 

		
	}
}
