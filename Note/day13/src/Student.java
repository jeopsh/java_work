public class Student {
    //学生信息：属性
    private String name;    //用户名
    private String pwd; //密码
    private int age;    //年龄
    private String sex; //性别
    private String add; //地址

    public Student(String name, String pwd, int age, String sex, String add) {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.sex = sex;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}
