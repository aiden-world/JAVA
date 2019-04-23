public class TestNumberTools {
	public static void main(String[] args) {
		NumberTools n = new NumberTools();
		System.out.println(n.getSum(3,1,5));
		System.out.println(n.getSum(3,1,5,8));
		System.out.println(n.getSum());
		System.out.println(n.getMin(3,1,5,8));
		System.out.println(n.getMin(3,5,8));
	}
	
	
}


class NumberTools{
	int getSum(int ... num){
		int sum = 0;
		for(int i =0 ;i<num.length;i++)	
		sum += num[i];
		return sum;	
	}
	
	int getMin(int a,int ... num){
		int min = a;
		for(int i =0 ;i<num.length;i++)	
		if(min>num[i])  min = num[i];
		return min;	
	}
}