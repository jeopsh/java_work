public class TestYinzi {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            int s = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    s += j;
                    System.out.print(j + "\t");
                }
            }
            System.out.println(i);

            if (i == s) {
                System.out.println(i + "完数");
            }
        }
    }
}
