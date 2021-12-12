public class Book6SumN {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        while (sum <= 8888) {
            sum = sum + n;
            n++;
        }
        System.out.println("1+2+3+……+" + n + "=" + sum + "，大于8888");
    }
}
