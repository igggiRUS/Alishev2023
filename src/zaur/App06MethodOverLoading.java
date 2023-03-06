package zaur;
//TODO: overloading
public class App06MethodOverLoading {

    void show(int i1) {
        System.out.println(i1);
    }

    void show(boolean b1) {
        System.out.println(b1);

    }
    void show(String s1){
        System.out.println(s1);
    }

}

class MethodOverloadingTest{

    public static void main(String[] args) {
        App06MethodOverLoading mO = new App06MethodOverLoading();
        int a = 500;
        mO.show(a);
boolean b = true;
        mO.show(b);
        String s = "Privet";
        mO.show(s);

    }
}