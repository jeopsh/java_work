public class TestLoop5 {
    public static void main(String[] args) {
        int n = 0;
        do {        //先执行一遍，再判断条件
            System.out.println(n);
            n++;
        } while (n < 10);       //再判断条件
    }
}
