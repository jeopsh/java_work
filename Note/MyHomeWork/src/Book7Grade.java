import java.util.Scanner;

public class Book7Grade {
    public static void main(String[] args) {
        int[] grade = new int[5];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "位同学的成绩：");
            grade[i] = input.nextInt();
        }

        int max = grade[0];
        int min = grade[0];
        int sum = 0;
        System.out.println("5位同学的成绩如下：");
        for (int i = 0; i < 5; i++) {
            System.out.print(grade[i] + "\t");
            sum = sum + grade[i];
            if (grade[i] > max) {
                max = grade[i];
            }
            if (grade[i] < min) {
                min = grade[i];
            }
        }
        System.out.println("\n5名同学成绩最高分：" + max + "，最低分：" + min + "，平均分：" + sum / 5);
    }
}
