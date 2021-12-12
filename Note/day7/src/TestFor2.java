public class TestFor2 {
    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        for (int i = 0; i <= m; i++) {    //连续输出7行，控制行

            for (int j = 0; j <= i; j++) {
                System.out.print("*");    //每行连续输出5个*，不换行
            }

            System.out.println();    //循环7遍：每遍输出一个*
        }
    }
}
