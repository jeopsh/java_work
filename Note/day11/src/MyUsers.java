public class MyUsers {
    //属性；
    String name;
    String pwd;


    //构造方法；  特点1，与类名一样！！！；2，没有返回值；3，是一种特殊的方法！构造器！
    public MyUsers(){
        System.out.println("你刚才调用了无参数的构造方法！！！");
    }

    public MyUsers(String uname){
        //这是显式的有参数的构造方法；
        name = uname;  //赋值；
    }

    public MyUsers(String uname,String upwd){
        //这是显式的有参数的构造方法；
        name = uname;
        pwd = upwd;
    }

    //方法，登录 ；
    public boolean login(String uName, String uPwd){
        if (uName.equals("admin") && uPwd.equals("123456")){
            return true;     //登录成功；
        }else {
            return  false ;  //登录失败；
        }
    }

    public static void main(String[] args) {
        MyUsers u1 = new MyUsers();
        //调用显式的构造方法；如果构造方法显式出来了，就不会再有隐式的构造方法了！

        u1.name = "admins";
        u1.pwd = "123456";

        boolean flag = u1.login(u1.name, u1.pwd);
        if (flag == true){
            System.out.println("登录成功！");
        }else {
            System.out.println("登录失败！！！");
        }

        System.out.println("==============");

        MyUsers u2 = new MyUsers("admin");
        u2.pwd = "123456";

        boolean flag2 = u2.login(u2.name, u2.pwd);
        if (flag2 == true){
            System.out.println("登录成功！");
        }else {
            System.out.println("登录失败！！！");
        }

        System.out.println("----------------------");
        MyUsers u3 = new MyUsers("admin","456");
        //调用有参数的构造方法；既创建了对象，同时 也初始化了数据！！！

        boolean flag3 = u3.login(u3.name, u3.pwd);
        if (flag3 == true){
            System.out.println("登录成功！");
        }else {
            System.out.println("登录失败！！！");
        }

    }
}
