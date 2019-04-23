package code_day24;

public class TestMyTrim {
	public static void main(String[] args) {
		String s ="  hello   ";
		System.out.println(s);
		System.out.println(myTrim(s));
		String s1 = "       长路漫漫     唯剑作伴     ";
		System.out.println(s1);
		System.out.println(myTrim(s1));
		
	}
	
	
	
	
	
	public static String myTrim(String s) {
		int p= 0;
		int q = 0;
		int noEmptyCount = 0;
		for(int i= 0 ;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				noEmptyCount++;
				if(noEmptyCount==1)
					p=i;
			}	
		}
//		System.out.println(noEmptyCount);
		int count = 0;
		for(int i= 0 ;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
//				System.out.println(count);
				if(count==noEmptyCount) {
//					System.out.println(i);
					q=i ;
					}
//					System.out.println(q);
			}	
		}
//		System.out.println(p+" "+q);
		return s.substring(p, q+1);
}
}
