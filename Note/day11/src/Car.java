public class Car {
    //属性
    String name;
    float price;
    String color;

    //方法
    public void start() {
        System.out.println("启动");
    }

    public void stop() {
        System.out.println("停下");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "法拉利";
        c1.price = 380000.0f;
        c1.color = "yellow";

        System.out.println(c1.name);
        System.out.println(c1.price);
        System.out.println(c1.color);
        c1.start();
        c1.stop();
    }
}
