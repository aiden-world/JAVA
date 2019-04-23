package code_day15;



/*
 * 多态的应用：
 * （1）多态数组
 * （2）多态参数
 *
 * 一、多态数组
 * 数组的元素类型是父类的类型，数组中存的是各种子类的对象。
 *
 * （1）有一个父类：图形Graphic类，有一个方法：求面积的方法。
 * （2）有一个子类：圆Circle类，重写该方法
 * （3）有一个子类：矩形Rectangle类，重写该方法
 * （4）声明一个数组，存储3个圆对象，2个矩形对象，遍历他们的面积，
 或者按照他们的面积大小排序...
 */
class TestPolymorphismArray {
    public static void main(String[] args) {
        Graphic[] g = new Graphic[5];
        g[0] = new Circle1(3);
        g[1] = new Circle1(4);
        g[2] = new Circle1(5);
        g[3] = new Rectangle(3, 4);
        g[4] = new Rectangle(4, 5);

        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i].getArea());
        }
        for (int i = 1; i < g.length; i++) {
            for (int j = 0; j < g.length - i; j++) {
                if (g[j].getArea() < g[j + 1].getArea()) {
                    Graphic temp = g[j];
                    g[j] = g[j + 1];
                    g[j + 1] = temp;

                }
            }
        }


        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i].getArea());
        }

    }
}

class Graphic {
    public double getArea() {
        return 0.0;
    }
}

class Circle1 extends Graphic {
    private double radius;

    public Circle1() {
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Graphic {
    private double chang;
    private double kuan;

    public Rectangle(double chang, double kuan) {
        this.chang = chang;
        this.kuan = kuan;
    }

    public double getChang() {
        return chang;
    }

    public void setChang(double chang) {
        this.chang = chang;
    }

    public double getKuan() {
        return kuan;
    }

    public void setKuan(double kuan) {
        this.kuan = kuan;
    }

    @Override
    public double getArea() {
        return chang * kuan;
    }
}


class TestPolyphismParam{
    public static void main(String[] args) {

        Circle1 c = new Circle1(3);
        Rectangle r = new Rectangle(3,4);

        printArea(c);
        printArea(r);




        public static void printArea(Graphic g){
            System.out.println("面积是："+g.getArea());
        }

    }
}


