import java.util.Scanner;

public class Book7Shop {
    public static void main(String[] args) {
        int[] price = new int[5];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入第" + (i + 1) + "笔购物金额：");
            price[i] = input.nextInt();
        }

        int sum = 0;
        System.out.println("序号\t金额");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "\t" + price[i]);
            sum = sum + price[i];
        }
        System.out.println("总金额：" + sum);
    }
}
