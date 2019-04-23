public class NumberTools {
		public double getMin(double a,double b) {
			return a>b?b:a;
		}
	    
		public int getSum(int a ,int b) {
			return a+b;
		}
		
		public void bubbleSort(int[] arr,String s) {
			if(s.equals("desc")||s.equals("asc")) {
			 if(s.equals("desc"))
				for(int i=0;i<arr.length;i++) {
				for(int j=1;j<arr.length-i;j++) {
					int temp =0 ;
					if(arr[j]>arr[j-1]) {
						temp = arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
					}
				}
			}
			else if(s.equals("asc"))
				for(int i=0;i<arr.length;i++) {
				for(int j=1;j<arr.length-i;j++) {
					int temp =0 ;
					if(arr[j]<arr[j-1]) {
						temp = arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
			else System.out.println("ÅÅÐò·½Ê½´íÎó");
		}
		
		
		public void printArr(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
		}
		
		
		
		public long xAndY (long x,long y) {
			int temp =1;
			for(int i=1;i<=y;i++) {
				temp *=x;
			System.out.print(temp+"\t");}
			return temp;
		}
		
		public void douNum(double i) {i=2*i;}
	//	public void douNum1( TestNumberTools t) {t.i=2*t.i;}

}
