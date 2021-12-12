public class Dog {
    //属性
    String name;
    int age;
    String type;

    public void run() {
        System.out.println("跑");
    }

    public void shout() {
        // System.out.println("叫");
    }

    public void eat() {
        System.out.println("吃");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "旺财";
        d1.age = 1;
        d1.type = "藏獒";

        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.type);
        d1.shout();
        d1.run();
        d1.eat();
    }
}
