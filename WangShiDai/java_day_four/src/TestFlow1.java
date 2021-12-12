public class TestFlow1 {
    public static void main(String[] args) {
        int score = 90;
        if (score == 100) {
            System.out.println("学霸！");      //String 比较的方法，不能用==比较，要用equals方法,
        } else if (score >= 90) {       //不用写score<100，因为这里默认分数不会超过100
            System.out.println("优秀！");
        } else if (score >= 80) {
            System.out.println("良好！");
        } else if (score >= 70) {
            System.out.println("中等！");
        } else if (score >= 60) {
            System.out.println("及格！");
        } else {
            System.out.println("不及格！");
        }
    }
}
