package code_day24;

public class TestReversalString {
	public static void main(String[] args) {
		String s = "HelloJava";
		System.out.println(reversalString(s,2,4));
		//System.out.println(reversalString(s,5,4));

	}
	
	
//	System.out.println(s.subSequence(0, 6));
//	System.out.println("asdas".indexOf("a".substring(1)));
	
	
	
	public static String reversalString(String s, int begin,int end) {
		if(begin>end||end>=s.length()) 
			throw new RuntimeException("索引输入错误");
		char[] arr = s.toCharArray();
		for(int i = begin,j=end;i< j;i++,j--){
			char temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		String s1 = new String(arr);
		return s1;

		
	}
}
