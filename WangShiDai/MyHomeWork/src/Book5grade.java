import java.util.Scanner;

public class Book5grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第" + i + "门课的成绩：");
            sum = sum + input.nextInt();
        }
        System.out.println("该学生5门课程的平均分为：" + sum/5);
    }
}
