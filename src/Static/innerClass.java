package Static;

public class innerClass {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test obj1 = new Test("karthik");
        Test obbj2 = new Test("kanishk");
        System.out.println(obj1.name);
        System.out.println(obbj2.name);
    }
}

