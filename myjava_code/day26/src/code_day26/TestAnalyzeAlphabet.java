package code_day26;


public class TestAnalyzeAlphabet {
	public static void main(String[] args) {
		String s = "dsaa13sada asdkawqoiuoiuwqksaasijdk asljdksahdlalkalkajdksakaha";
		System.out.println(analyzeAlphabet(s));
	}

	
	static char  analyzeAlphabet(String s) {
		//此处可以先使用s.toLowerCase() 
		char[] all = s.toCharArray();
		int[]  allAlp = new int[26];
		for (int i = 0; i < all.length; i++) {
			if(all[i]<=122&&all[i]>=97)
				allAlp[all[i]-97]++;
			if(all[i]<=90&&all[i]>=65)
				allAlp[all[i]-65]++;
		}
		int max = -1;
		int res = 0;
		for (int j = 0; j < allAlp.length; j++) {
			 if(max<allAlp[j]) {
				 max = allAlp[j];
				 res = j;
			 }
		}
		System.out.println(max);
		//int i = Arrays.binarySearch(allAlp, max);//不行binarySearch必须先排序;
		//System.out.println(i);
		return (char)(res+97);
	}

	
}