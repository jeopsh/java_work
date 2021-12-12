import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        while (true) {
            System.out.println("自动存款机");
            System.out.println("1.存款；2.取款；3.查余额；4.退出");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.println("输入存款：");
                    System.out.println("完成，继续操作……");
                    break;
                case 2:
                    System.out.println("输入取款：");
                    System.out.println("完成，继续操作……");
                    break;
                case 3:
                    System.out.println("余额：");
                    System.out.println("完成，继续操作……");
                    break;
                default:
                    System.out.println("退出");
                    System.exit(0);
            }
        }
    }
}
