//练习4：为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
public class CountTime{
	public static void main(String[] args) {
		int allHours = 89;
		int day = allHours/24;
		int hour = allHours%24;
		System.out.println("总共"+day+"天零"+hour+"个小时");
	}
}