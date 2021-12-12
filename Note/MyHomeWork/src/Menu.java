import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请选择星期：");
        int week = input.nextInt();

        System.out.println("===== if-else方法计算结果：\t=====");
        if (week == 1) {
            System.out.println("星期一特价菜：水煮鱼");
        } else if (week == 2) {
            System.out.println("星期二特价菜：烧排骨");
        } else if (week == 3) {
            System.out.println("星期三特价菜：宫爆鸡丁");
        } else if (week == 4) {
            System.out.println("星期四特价菜：宫爆鸡丁");
        } else if (week == 5) {
            System.out.println("星期五特价菜：清蒸鲈鱼");
        } else if (week == 6) {
            System.out.println("星期六特价菜：清蒸鲈鱼");
        } else {
            System.out.println("星期天特价菜：烧排骨");
        }

        System.out.println("===== Switch-case方法计算结果：=====");
        switch (week) {
            case 1:
                System.out.println("星期一特价菜：水煮鱼");
                break;
            case 2:
                System.out.println("星期二特价菜：烧排骨");
                break;
            case 3:
                System.out.println("星期三特价菜：宫爆鸡丁");
                break;
            case 4:
                System.out.println("星期四特价菜：宫爆鸡丁");
                break;
            case 5:
                System.out.println("星期五特价菜：清蒸鲈鱼");
                break;
            case 6:
                System.out.println("星期六特价菜：清蒸鲈鱼");
                break;
            default:
                System.out.println("星期天特价菜：烧排骨");
        }
    }
}
