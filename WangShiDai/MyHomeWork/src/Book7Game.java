import java.util.Scanner;

public class Book7Game {
    public static void main(String[] args) {
        int[] num = {8, 4, 2, 1, 23, 344, 12};
        int sum = 0;
        boolean exist = false;

        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int userInput = input.nextInt();

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
            sum = sum + num[i];
            if (userInput == num[i]) {
                exist = true;
            }
        }
        System.out.println("\n和为：" + sum);
        if (exist) {
            System.out.println("你输入的数字在该数列中！");
        } else {
            System.out.println("对不起！你输入的数组不在该数列中！");
        }
    }
}
