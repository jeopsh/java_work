import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请选择银行：1.中国银行、2.中国农业银行、3.中国工商银行");
        int bank = input.nextInt();
        while(bank < 1 || bank > 3) {
            System.out.println("你输入的值有误，请重新输入1-3的整数：");
            bank = input.nextInt();
        }

        switch (bank) {
            case 1:
                System.out.println("中国银行：BOC");
                break;
            case 2:
                System.out.println("中国农业银行：ABC");
                break;
            case 3:
                System.out.println("中国工商银行：ICBC");
        }
    }
}
