public class Book6Sum8 {
    public static void main(String[] args) {
//        计算8+88+888+……+8888888888
        long eight = 0;
        long sum = 0;
        for (int i = 1; i <= 10; i++) {
            eight = eight * 10 + 8;
            sum = sum + eight;
            if (i == 2) {
                System.out.println("8+" + eight + "=" + sum);
            } else if (i == 3) {
                System.out.println("8+88+" + eight + "=" + sum);
            } else if (i > 3) {
                System.out.println("8+88+…" + eight + "=" + sum);
            }
        }
    }
}
