import java.util.Scanner;

public class LoginMenu {
    public static void main(String[] args) {
        System.out.println("*************************************");
        System.out.println("*\t\t\t\t\t\t\t\t\t*");
        System.out.println("*\t\t【我行我素购物管理系统】\t\t*");
        System.out.println("*\t\t\t\t\t\t\t\t\t*");
        System.out.println("*\t\t\t1.登录系统\t\t\t\t*");
        System.out.println("*\t\t\t\t\t\t\t\t\t*");
        System.out.println("*\t\t\t2.退出\t\t\t\t\t*");
        System.out.println("*\t\t\t\t\t\t\t\t\t*");
        System.out.println("*************************************");

        System.out.println("请输入数字选择菜单：");
        Scanner input = new Scanner(System.in);
        int menu = 0;
        if (input.hasNextInt()){        //不懂这一行代码
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("*************************************");
                    System.out.println("*\t\t\t\t\t\t\t\t\t*");
                    System.out.println("*\t\t\t欢迎光临！\t\t\t\t*");
                    System.out.println("*\t\t\t\t\t\t\t\t\t*");
                    System.out.println("*************************************");
                    break;
                case 2:
                    System.out.println("谢谢你的使用！");
                    break;
                default:
                    System.out.println("你输入的数字有误，请按菜单显示进行输入！");
//                    将这里改进为继续输入直到输入正确为止
                    break;
            }
        } else {
            System.out.println("你输入的为非数字，请按菜单显示进行输入！");
//            将这里改进为继续输入直到输入正确为止
        }
    }
}