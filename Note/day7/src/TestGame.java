import java.util.Scanner;

public class TestGame {

    //    猜数字游戏
    public static void main(String[] args) {
//        如何生成一个随机数？
        double random = Math.random();  //电脑生成一个随机数；范围：0-1
        int n = (int) (random * 10);    //范围变为0-9
//        System.out.println("random = " + random);

        System.out.println("猜随机数，范围0-9");
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();    //用户输入一个数
        int c = 0;  //计算猜的次数
        while (n != m) {
            if (m > n) {
                System.out.println("过大！");
            } else if (m < n) {
                System.out.println("过小！");
            }
            System.out.println("猜随机数，范围0-9");
            m = input.nextInt();
            c++;
        }
        System.out.println("猜对了");
        if (c == 0) {
            System.out.println("一次猜对！");
        } else if (c == 1) {
            System.out.println("两次猜对！");
        } else if (c == 2) {
            System.out.println("三次猜对！");
        } else if (c == 3) {
            System.out.println("四次猜对！");
        }
    }
}
