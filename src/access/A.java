package access;

public class A {
    private int num;
    String name;
    int[] arr;

    public int getNum() { //getter to get the private value;
        return num;
    }

    public void setNum(int num) { //setter to change the private value;
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
