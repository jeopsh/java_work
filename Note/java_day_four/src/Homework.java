public class Homework {
    public static void main(String[] args) {
        int day = 2;        //星期天（一周第一天）
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
            case 3:
                System.out.println("星期二、星期三");
                break;
            case 4:
            case 5:
                System.out.println("星期四、星期五");
                break;
            case 6:
                System.out.println("星期六");
            case 7:
                System.out.println("退出！");
                System.exit(0);     //退出，exit(0)：正常退出程序；exit(1)：非0非正常退出程序
            default:
                System.out.println("其它");
                break;

        }
    }
}
