public class MyUsers {
    //属性：全局变量有默认值；
    String name;    // null;
    String pwd;     // null;
    int role;       //  0

    public void show(){
        int age;    //局部 变量； 没有默认值；必须要先赋值，否则无法使用；
        age = 24;
        System.out.println("我是："+name+",密码是："+pwd + "，角色id:"+role + ",年龄："+age);
    }

    public void test(){
        System.out.println(name);
        //System.out.println(age);
    }


    public static void main(String[] args) {
        MyUsers u1 = new MyUsers();
        u1.show();
    }

}
