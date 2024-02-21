package oop6.generics.comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float mark;

    public Student(int rollno, float mark) {
        this.rollno = rollno;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return rollno + " "+ mark;
    }

    @Override
    public int compareTo(Student o) {
//        System.out.println("in compareto method");
        int diff = (int)(this.mark - o.mark);
        return diff;
    }
}
