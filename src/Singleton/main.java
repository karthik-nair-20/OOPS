package Singleton;

public class main {
    @Override
    public String toString() {
        return Singleton.getInstance().toString();
    }

    public static void main(String[] args) {


        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();


        System.out.println(obj1);
    }
}
