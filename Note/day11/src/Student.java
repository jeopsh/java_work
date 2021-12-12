public class Student {  //定义一个类：class
    //属性：全局变量
    String names;
    int age;
    float height;

    //方法；动作
    public void studyJava() {
        System.out.println(names + "学习Java");
    }

    //主方法
    public static void main(String[] args) {
        //创建一个对象；调用默认的构造方法
        Student s1 = new Student(); //创建一个新对象s1，（实例）

        s1.names = "zdw";   //赋值
        s1.age = 20;    //赋值
        s1.height = 1.80f;  //赋值

        System.out.println(s1.names);
        System.out.println(s1.age);
        System.out.println(s1.height);
        s1.studyJava();

        //再创建一个对象
        Student s2 = new Student(); //创建一个新对象s1，（实例）

        s2.names = "zdw2";   //赋值
        s2.age = 18;    //赋值
        s2.height = 1.90f;  //赋值
        s2.studyJava();

        //…… Student s140 = new Student();
    }
}
