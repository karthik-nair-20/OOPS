package Introduction;

public class main {
    public static void main(String[] args) {
        //store 5 rollNo
        int[] roll = new int[5];
        //store 5 names
        String[] name = new String[5];
        //store 5 marks
        float[] marks = new float[5];

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Student stud1 = new Student(18,"virat khoil",88.8f); //object created;
        Student rahul = new Student(17,"rahul",9.9f);
//        System.out.println(stud1);
//        stud1.rollNo = 17;
// Student arpit = new Student(17, "Arpit", 89.7f);
// here, this will be replaced with arpit
//        System.out.println(rahul.rollNo);
//        System.out.println(rahul.name);
//        System.out.println(rahul.mark);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Student one = new Student();
        Student two = one;
//        System.out.println(two.mark);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        one.greeting();
//        one.changeName("kanishk");
//        one.greeting();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    Student random = new Student(stud1);
//        System.out.println(random.rollNo);
//        System.out.println(random.name);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Student random2 = new Student();
        System.out.println(random2.rollNo);
        System.out.println(random2.name);
        System.out.println(random2.mark);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// when a non primitive is final, you cannot reassign it.
//final int bonus =2;
//bonus = 3;
        final Object val = new Object("karthik");
        System.out.println(val.val);
        val.val = "kanishk";
        System.out.println(val.val);

        for (int i = 0; i < 100; i++) {
//            val= new Object("Random name"); //see we cannot reasign object using final.
        }


    }
}

class Student{
    int rollNo;
    String name;
    float mark;

    void greeting()
    {
        System.out.println("Hello! My name is " + this.name);
    }
    void changeName(String name) {
        this.name = name;
    }

    Student(){
//        rollNo = 17;
//        name = "karthik";
//        mark = 99.99f;
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this(17,"karthik",99.9f);
    }
    Student(int rollNo, String name, float mark){
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
    Student(Student other)
    {
        this.name = other.name;
        this.rollNo = other.rollNo;
    }

}

class Object{
    int num;
    String val;

    Object(String val){
        this.val = val;
    }


}
