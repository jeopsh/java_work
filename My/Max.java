import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = input.nextInt();
        System.out.println("请输入第二个数：");
        int b = input.nextInt();
        System.out.println("请输入第三个数：");
        int c = input.nextInt();

        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("最大值为：" + max);

//        方法二
        int max2;
        max2 = a > b ? a : b;
        max2 = max2 > c ? max2 : c;
        System.out.println("****方法二求最大值****\n最大值为：" + max2);
    }
}
