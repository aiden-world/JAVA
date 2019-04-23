package code_day24;

public class TestGetSubStringTime {
	public static void main(String[] args) {
		String s1 = "ad";
		String s2 = "adadsasadasdaadad";
		String s3 = "cxzczxadzxczxaisdadzasdaada";
		System.out.println(getSubStringTime(s1,s2));	
		System.out.println(getSubStringTime(s1,s3));	
		System.out.println(getSubStringTime(s1,s1));	
	}
	
	public static int getSubStringTime(String ss , String fs ) {
		int i=-2,count=0;
		 i = fs.indexOf(ss);
		if(i!=-1) count++;
		while(i!=-1) {
		 i = fs.indexOf(ss, i+ss.length()) ;//IndexOf没找到一般返回-1
		 if(i!=-1) count++;}
		return count;
		
	}
}
