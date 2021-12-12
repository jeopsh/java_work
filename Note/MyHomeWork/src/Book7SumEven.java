public class Book7SumEven {
    public static void main(String[] args) {
        int[] num = new int[20];
        num[0] = 1;
        num[1] = 1;
        num[2] = 2;
        int sumEven = 0;

//        按规律创建数列
        for (int i = 3; i < num.length; i++) {
            num[i] = num[i - 2] + num[i - 1];
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
            if (num[i] % 2 == 0) {
                sumEven = sumEven + num[i];
            }
        }

        System.out.println("\n该数列的偶数和为：" + sumEven);
    }
}
