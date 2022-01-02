//封装 : 属性私有化，对外提供公有的get,set方法；
public class Teacher {

    //属性；封装；  private 只能本类中可以 访问；
    private String name;
    private int age;

    //get方法没有参数，有返回值；
    public String getName() {
        return name;
    }

    //set方法，有参数，没有返回值；
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Teacher t2 = new Teacher();
        t2.name = "tony";
        t2.age = 21;

        System.out.println(t2.name);
        System.out.println(t2.age);
    }


}
