import java.util.Scanner;
public class ExchangeDayName {
	public static void main(String[] args) {
		System.out.println("�����������֣����������Ӧ����");
		Scanner input = new Scanner (System.in);
		String[] weeks ={"Monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		int i = input.nextInt();
		System.out.println(weeks[i-1]);
	}
}
