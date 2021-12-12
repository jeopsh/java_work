import java.util.Scanner;

public class TestMethod1 {  //类
    //定义一个方法，无返回值
    public void test() {
        System.out.println("无返回值方法");
    }

    //定义一个有返回值方法
    public int getNum() {
        System.out.println("输入数字：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // float f = 2.0f;
        return n;
    }

    //定义无返回值但有return
    public void play (int n) {
        if (n == 0) {
            this.test(); //调用同类中的并列方法；this可以省略
            System.out.println("n == 0，返回");
            return;
        } else {
            System.out.println("n == 1");
        }
    }

    public static void main(String[] args) {
        TestMethod1 t1 = new TestMethod1(); //先创建对象
        t1.test();  //对象调方法
        int t = t1.getNum();
        System.out.println("t = " + t);
        t1.play(0);
    }
}
