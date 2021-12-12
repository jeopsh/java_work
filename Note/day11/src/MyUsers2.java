
public class MyUsers2 {

    String name;
    String pwd;

    //alt + insert  +  Fn (新电脑需要)


    //创建无参数的构造方法；
    public MyUsers2() {

    }
    //创建有参数的构造方法；一个参数；
    public MyUsers2(String name) {
        this.name = name;
    }

    //创建有参数的构造方法；2个参数；
    public MyUsers2(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    //方法的重载； 方法名相同，参数列不同！！！
}
