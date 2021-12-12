public class Teacher {
    public void test2() {
        TestMethod1 t = new TestMethod1();
        t.test();   //调用别的类中的方法，先创建对象，再用对象去调用方法
        int m = t.getNum();
        System.out.println("m = " + m);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.test2();
    }
}
