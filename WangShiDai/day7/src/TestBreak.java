public class TestBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
//                break;  //只输出0-4，到5中止循环；用在循环及switch中
                continue;   //跳过循环；用在循环中
            }
            System.out.println(i);
        }
    }
}
