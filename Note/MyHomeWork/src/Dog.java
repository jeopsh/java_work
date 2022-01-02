public class Dog extends Animal{
    private String age;

    @Override
    public void eat() {
        System.out.println("狗在吃骨头……");
    }

    @Override
    public void shout() {
        System.out.println("狗在叫……");
    }

    @Override
    public void run() {
        System.out.println("狗在跑……");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setBreed("哈士奇");
        dog.setNickname("二哈");
        dog.setSex("公");
        dog.age = "2";

        System.out.println("品种：" + dog.getBreed());
        System.out.println("昵称：" + dog.getNickname());
        System.out.println("性别：" + dog.getSex());
        System.out.println("年龄：" + dog.age);

        System.out.println();

        dog.eat();
        dog.shout();
        dog.run();
    }
}
