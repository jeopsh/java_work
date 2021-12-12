public class TestReturn {
    public static void main(String[] args) {
        int n = 100;
        int sum = sum(n);
        System.out.println(sum);
    }

//    定义一个方法，累加求和
    private static int sum(int n) {
        int all = 0;
        for (int i = 0; i <= n; i++) {
            all += i;
        }
        return all;
    }
}
