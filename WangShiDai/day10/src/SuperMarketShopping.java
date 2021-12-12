import java.util.Scanner;

public class SuperMarketShopping {
//    全局变量：成员变量
    static String[] names = {"瓜子", "花生", "矿泉水"};    //食品名称
    static float[] prices = {3.0f, 5.0f, 2.0f}; //价格
    static int[] nums = {900, 800, 700};    //库存

    static Scanner input = new Scanner(System.in);
    static int[] myNums = {0, 0, 0};

    public static void main(String[] args) {
        show(); //显示所有商品
        buy();
    }

    private static void buy() {
        int n = input.nextInt();
    }

    private static void show() {
        System.out.println("======超市系统=======");
        System.out.println("编号\t商品名称\t价格\t库存");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + "\t" + names[i] + "\t" + prices[i] + "\t" + nums[i]);
        }
    }
}
