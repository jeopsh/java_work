public class TestJieCheng2 {
    public static void main(String[] args) {
//        阶乘求和：1，+ 1/(1*2)，+ 1(1*2*3) + ……
        double sum = 0.0;  //求和
        double a = 1.0;    //初始值
        for (int i = 1; i <= 10; i++) {
            a = a * (1.0/i);
            System.out.println("a = " + a);
            sum = sum + a;
        }
        System.out.println("sum = " + sum);
    }
}
