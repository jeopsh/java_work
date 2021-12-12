import java.util.Scanner;

public class TestRandom {

    //    猜数字游戏
    public static void main(String[] args) {
//        如何生成一个随机数？
        double random = Math.random();  //电脑生成一个随机数；范围：0-1
        System.out.println(random);
        System.out.println("======循环输出随机数======");
        for (int i = 1; i <= 10; i++) {
            random = Math.random();
            System.out.println(random);
        }
    }
}
