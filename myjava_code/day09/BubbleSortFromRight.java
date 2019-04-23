public class BubbleSortFromRight {
	public static void main(String[] args) {
		char[] arr = {'h','e','l','l','o','j','a','v','a'} ;
		for (int j=0;j<arr.length;j++)
			for(int i=arr.length-1;i>j;i--)
				if(arr[i]>arr[i-1]) {
					char temp = arr[i];
					arr[i] =arr[i-1];
					arr[i-1] = temp;
				}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
	}  
}