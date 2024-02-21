package Static;

public class Static2 {
    static int a = 4;
    static int b;
//static block will only run o once ie : when the class is loaded for the first time.
    static  {
        System.out.println("hi from static block");
        b = a*10;
    }

    public static void main(String[] args) {
        Static2 obj = new Static2();
        System.out.println( Static2.a);
        Static2 obj2 = new Static2();
        System.out.println(Static2.b);


    }
}
