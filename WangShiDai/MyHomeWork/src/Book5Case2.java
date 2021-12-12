public class Book5Case2 {
    public static void main(String[] args) {
        int year = 2007;
        int person = 80000;
        float rate = 0.25F;
        while (person < 200000) {
            person = (int) (person + person * rate);
            System.out.println(year + "年，培训" + person + "人");
            year++;
        }
        System.out.println(year-1 + "年，年培训人达到20万人");
    }
}
