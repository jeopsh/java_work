public class TestTeacher {


    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        t1.setName("minlaoshi");
        t1.setAge(19);
/*
        t1.name = "minlaoshi";
        t1.age = -3;

        System.out.println(t1.name);
        System.out.println(t1.age);
*/

        System.out.println(t1.getName());
        System.out.println(t1.getAge());

    }
}
