import java.util.Scanner;

//用while循环
public class Book8SuperMarketUseMethod {

    static String[] goods = {"瓜　子", "花　生", "矿泉水"};
    static float[] price = {3.00f, 5.00f, 2.00f};
    static int[] stock = {100, 200, 300};
    static int[] cart = {0, 0, 0};
    static int menu;
    static int amount;
    static float total = 0.00f;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        shop();
        cart();
    }

    private static void cart() {
        System.out.println("\n========================我的购物车=========================");
        System.out.println("编号\t\t\t商品名称\t\t\t价格\t\t\t库存\t\t\t小计");
        for (int i = 0; i < goods.length; i++) {
            if (cart[i] > 0) {
                System.out.println((i + 1) + "\t\t\t" + goods[i] + "\t\t\t" + price[i] + "\t\t\t" + cart[i] + "\t\t\t" + price[i] * cart[i]);
            }
        }

        System.out.print("请选择：（1.继续购物；2.去结算），按0退出：");
        menu = input.nextInt();

        if (menu == 0) {
            System.out.println("谢谢使用！再见！");
            System.exit(0);
        } else if (menu == 1) {
            shop();
        } else if (menu == 2) {
            for (int i = 0; i < goods.length; i++) {
                total = total + price[i] * cart[i];
            }
            System.out.println("总计消费：" + total + "元");
            System.exit(0);
        }
    }


    private static void shop() {
        System.out.println("\n=================欢迎进入深圳知领自动购物平台=================");
        System.out.println("编号\t\t\t\t商品名称\t\t\t\t价格\t\t\t\t库存");
        for (int i = 0; i < goods.length; i++) {
            System.out.println((i + 1) + "\t\t\t\t" + goods[i] + "\t\t\t\t" + price[i] + "\t\t\t\t" + stock[i]);
        }

        System.out.print("请选择：（1-3），按0退出：");
        menu = input.nextInt();

        if (menu == 0) {
            System.out.println("谢谢使用！再见！");
            System.exit(0);
        } else {
            System.out.print("请输入数量：（按0返回）");
            amount = input.nextInt();
            if (amount == 0) {
                shop();
            } else {
                cart[menu - 1] = cart[menu - 1] + amount;
                stock[menu - 1] = stock[menu - 1] - amount;
            }
        }

        cart();
    }
}