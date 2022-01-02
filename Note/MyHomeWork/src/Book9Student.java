public class Book9Student {
    private String name;
    private String sex;
    private int age;
    private String stuClass;

    public void introduce() {
        System.out.println("我名字叫" + name);
        System.out.println("我是" + sex + "生");
        System.out.println("我今年" + age + "岁");
        System.out.println("我来自" + stuClass);
    }

    public void study() {
        System.out.println(name + "正在学习中……");
    }

    public static void main(String[] args) {
        Book9Student s1 = new Book9Student();
        s1.name = "Joseph";
        s1.sex = "男";
        s1.age = 25;
        s1.stuClass = "计算机科学与技术2班";

        s1.introduce();
        s1.study();
    }
}
