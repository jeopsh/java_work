public class Fish extends Animal{
    private String color;

    @Override
    public void eat() {
        System.out.println("鱼在吃……");
    }

    @Override
    public void shout() {
        System.out.println("鱼在吐泡泡……");
    }

    @Override
    public void run() {
        System.out.println("鱼在游……");
    }

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setBreed("金鱼");
        fish.setNickname("小金鱼");
        fish.setSex("公");
        fish.color = "红色";

        System.out.println("品种：" + fish.getBreed());
        System.out.println("昵称：" + fish.getNickname());
        System.out.println("性别：" + fish.getSex());
        System.out.println("颜色：" + fish.color);

        System.out.println();

        fish.eat();
        fish.shout();
        fish.run();
    }
}
