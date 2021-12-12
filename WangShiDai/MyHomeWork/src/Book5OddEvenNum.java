public class Book5OddEvenNum {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {   //奇数
                odd = odd + i;
            } else {
                even = even + i;
            }
        }

        System.out.println("1到100之间所有的奇数和为：" + odd + "，偶数和为：" + even);
    }
}
