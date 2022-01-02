public class Book9Calculator {
    private int num1;
    private int num2;

    public void add() {
        System.out.println("两数之和为：" + (num1 + num2));
    }

    public void subtract() {
        System.out.println("两数之差为：" + (num1 - num2));
    }

    public static void main(String[] args) {
        Book9Calculator cal = new Book9Calculator();
        cal.num1 = 9;
        cal.num2 = 7;

        cal.add();
        cal.subtract();
    }
}
