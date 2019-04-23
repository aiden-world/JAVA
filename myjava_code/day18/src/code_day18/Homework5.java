package code_day18;


class Out3 {
    public int age = 12;
    public void Print(final int x) {
        class In {
            public void inPrint() {
                System.out.println(x);
                System.out.println(age);
            }
        }
        new In().inPrint();
    }
}
public class Homework5 {
    public static void main(String[] args) {
        Out3 out = new Out3();
        out.Print(3);
        out.age = 13;
    }
}
