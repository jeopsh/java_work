public class TestExe {
    public static void main(String[] args) {
        float rate = 0.25f;
        int a = 80000;
        int sum = a;    //累加人数
        while (sum < 200000) {
            sum = (int) (sum + a * (1 + rate));
            System.out.println("sum = " + sum);
        }
    }
}
