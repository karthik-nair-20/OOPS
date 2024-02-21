package oop6.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class main {

    public static void main(String[] args) {
        Student karthik = new Student(17,88.34f);
        Student kunal = new Student(13,98.94f);
        //tell me how can i find which is bigger?
        //compare two or more classes using Comparables.
        Student rahul = new Student(5, 99.52f);
        Student arpit = new Student(2, 95.52f);
        Student karan = new Student(13, 77.52f);
        Student sachin = new Student(9, 96.52f);

        Student[] list = {karthik,kunal,rahul,arpit,karan,sachin};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int rollDiff = (int)(o1.rollno - o2.rollno);
                return rollDiff;
            }
        });
//        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
//        if(karthik.compareTo(kunal) > 0)
//        {
//            System.out.println("karthik is bigger");
//        }
//        else{
//            System.out.println("kunal is bigger");
//        }
    }



}
