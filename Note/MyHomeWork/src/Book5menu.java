import java.util.Scanner;

public class Book5menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu;
        do {
            System.out.println("请输入商品编号：1.苹果；2.矿泉水；3.杯子；4.毛巾。输入 n 结束选择");
            menu = input.next();
            switch (menu) {
                case "1":
                    System.out.println("苹果的单价为 3.00 元");
                    break;
                case "2":
                    System.out.println("矿泉水的单价为 2.00 元");
                    break;
                case "3":
                    System.out.println("杯子的单价为 6.00 元");
                    break;
                case "4":
                    System.out.println("毛巾的单价为 11.00 元");
                    break;
                case "n":
                    System.out.println("谢谢光临！欢迎下次再来！");
                    break;
            }
        } while (!menu.equals("n"));

    }
}
