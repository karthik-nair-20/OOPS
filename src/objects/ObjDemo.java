package objects;

public class ObjDemo {
    int num;

    public ObjDemo(int num) {
        this.num = num;
    }

    public ObjDemo() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjDemo obj = new ObjDemo(34);
        System.out.println(obj.hashCode()); //identify the object if its same or not.
        ObjDemo obj2 = obj;
        System.out.println(obj2.hashCode());
    }
}
