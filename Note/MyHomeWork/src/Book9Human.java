public class Book9Human {
    private String name;
    private String sex;
    private int age;

    public void eat() {
        System.out.println(name + "正在吃饭……");
    }

    public void sleep() {
        System.out.println(name + "正在睡觉……");
    }

    public void work() {
        System.out.println(name + "正在工作……");
    }

    public static void main(String[] args) {
        Book9Human p1 = new Book9Human();
        p1.name = "Joseph";
        p1.sex = "male";
        p1.age = 25;

        System.out.println("姓名：" + p1.name +
                "\n性别：" + p1.sex +
                "\n年龄：" + p1.age);

        p1.eat();
        p1.sleep();
        p1.work();
    }
}
