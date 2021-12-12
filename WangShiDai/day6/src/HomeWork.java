import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 1;
        int sum = 0;
        while (n < 6) {
            System.out.println("第" + n + "门课成绩：");
            int n1 = input.nextInt();
            sum = sum + n1;
            n++;
        }
        System.out.println("平均分：" + sum/5);

    }
}
