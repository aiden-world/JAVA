package code_day18;


class Out1 {
    private int age = 12;
    class In {
        private int age = 13;
        public void print() {
            int age = 14;
            System.out.println("局部变量：" + age);
            System.out.println("内部类变量：" + this.age);
            System.out.println("外部类变量：" + Out1.this.age);
        }
    }
}
public class Homework4 {
    public static void main(String[] args) {
        Out1.In in = new Out1().new In();
        in.print();
    }
}
