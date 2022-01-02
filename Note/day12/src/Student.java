public class Student {
    //属性；全局变量；
    String name;    // 默认修饰符： friendly 友好的！！！ default
    int age;
    String major;

    //无参数的构造方法；
    public Student() {

    }
    //有参数的构造方法；
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    //与上面的两个方法构成了方法的重载！！！
    public Student(String name,  String major, int age) {
        this.name = name;
        this.age = age;
        this.major = major;
    }


    //方法；
    public void show(){
        System.out.println("我叫："+name +"，年龄："+age + ",专业是："+major);
    }


    public static void main(String[] args) {
        Student s1 = new Student();    //调用无参数的构造方法；创建了一个对象s1;
        s1.name = "zhangweiyan";
        s1.age = 20;
        s1.major = "计算机";

        s1.show();


        //调用有参数的构造方法，创建一个对象s2;
        Student s2 = new Student("zhoutao",23,"英语");
        s2.show();

        //调用有参数的构造方法，创建一个对象s3;
        Student s3 = new Student("zhangyunxin","销售",25);
        s3.show();

    }
}
