import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args) {
//        冒泡排序
        int[] arrs = {5, 3, 2, 7, 88, 100, 10};
        for (int i = 0; i < arrs.length - 1; i++) {
            for (int j = 0; j < arrs.length - 1 - i; j++) {
                if (arrs[j] > arrs[j + 1]) {
                    int temp = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = temp;
                }
                System.out.println(i + ":" + j + ":" + Arrays.toString(arrs));
            }
        }
    }
}
