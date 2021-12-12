import java.util.Scanner;

public class Book5Exam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("学生编写程序完成，是否合格（合格请输入 1，不合格请输入 0）？");
        int menu = input.nextInt();
        while (menu == 0) {
            System.out.println("学生修改程序完成，是否合格（合格请输入 1，不合格请输入 0）？");
            menu = input.nextInt();
        }

        if (menu == 1) {
            System.out.println("恭喜该学生编写程序成功！");
        }
    }
}
