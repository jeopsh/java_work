public class TestLoop1 {
    public static void main(String[] args) {
        int n = 0;      //定义一个变量
        while (n < 10) {        //循环条件
            System.out.println("好好学习，天天向上！" + n);
            n++;        //n=n+1;变量变化
        }

        int i = 0;
        while (++i < 10) {
            System.out.println(i);
        }

        System.out.println("=========");

        int a = 0;
        while (a++ < 10) {
            System.out.println(a);
        }
    }
}
