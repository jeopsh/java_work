public class TestSwitch3 {
    public static void main(String[] args) {
        String s = "ccb";
        switch (s) {
            case "icbc":
                System.out.println("工商银行");
                break;
            case "abc":
                System.out.println("农业银行");
                break;
            case "ccb":
                System.out.println("建设银行");
                break;
            default:    //default可以省略
                System.out.println("不支持银行！");
        }

        System.out.println("========================if else=========================");

//        能用swich的就能用if
        if (s.equals("icbc")) {
            System.out.println("工商银行");
        } else if (s.equals("abc")) {
            System.out.println("农业银行");
        } else if (s.equals("ccb")) {
            System.out.println("建设银行");
        } else {
            System.out.println("不支持的银行！");
        }
    }
}
