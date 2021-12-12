public class TestJieCheng {
    public static void main(String[] args) {
//        阶乘求和：1，+ 1*2，+ 1*2*3 + ……
        long sum = 0L;  //求和
        long a = 1L;    //初始值
        for (int i = 1; i <= 10; i++) {
            a = a * i;
            System.out.println("a = " + a);
            sum = sum + a;
        }
        System.out.println("sum = " + sum);
    }
}
