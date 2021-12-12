import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生分数：");
        int grade = input.nextInt();

        System.out.println("===== if-else方法计算结果：\t=====");
        if (grade >= 90) {
            System.out.println("优秀");
        } else if (grade >= 80) {
            System.out.println("良好");
        } else if (grade >= 60) {
            System.out.println("中等");
        } else {
            System.out.println("差");
        }

        System.out.println("===== Switch-case方法计算结果：=====");
        switch (grade/10) {
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 6:
                System.out.println("中等");
                break;
            default:
                System.out.println("差");
        }
    }
}
