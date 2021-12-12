public class Calculate {

    //方法重载的典型案例；
    public int add(int a, int b){
        return  a+b;
    }

    public float add(float f1, float f2){
        return f1 + f2;
    }





    public static void main(String[] args) {
        Calculate c1 = new Calculate();
        float n = c1.add(1.3f,2);
        System.out.println("n = " + n);
        float m = c1.add(9.2f, 5);
        System.out.println("m = " + m);
    }
}
