public class Book7MaxMin {
    public static void main(String[] args) {
        int[] num = {90, 76, 65, 92, 89, 45};
        int max = num[0];
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
            System.out.print(num[i] + "\t");
        }
        System.out.println("\n最大值为：" + max + "，最小值为：" + min);
    }
}
