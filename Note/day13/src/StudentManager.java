public class StudentManager {
    int t;

    static int Num;

    public Student getStudent() {
        Student s1 = new Student ("tom", "123", 23, "男", "深圳");
        return s1;
    }

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        Student student = sm.getStudent();
        System.out.println(student.getName());
        System.out.println(student.getPwd());
        System.out.println(student.getAge());
        System.out.println(student.getSex());
        System.out.println(student.getAdd());

        StudentManager s1 = new StudentManager();

    }
}
