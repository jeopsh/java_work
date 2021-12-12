public class TestSwitch {
    public static void main(String[] args) {
        int n = 2;
//        switch开关、旋转;等值判断，建议用switch
        switch(n) {     //n——这里只能支持的数据类型有：byte,short,int,char,String,枚举
            case 1:
                System.out.println("1档风");
                break;  //中断
            case 2:
                System.out.println("2挡风");
                break;
            case 3:
                System.out.println("3挡风");
                break;
            default:
                System.out.println("已关闭");
                break;
        }
    }
}
