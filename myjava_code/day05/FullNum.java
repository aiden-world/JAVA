public class FullNum {
	public static void main(String[] args) {
		System.out.println("打印1000以内的所以完数");
		int n =0 ;
		for(n=1;n<1000;n++) {
		 int sum = 0;
		 for(int i=1;i<n;i++) {
			 if(n%i==0) sum += i ; 
		 }
		 if(sum == n) System.out.println(n);
	}
	}
}
