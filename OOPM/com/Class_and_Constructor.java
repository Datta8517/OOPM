package com;

import java.util.Arrays;

public class Class_and_Constructor {
    public static void main(String[] args){

//        Student[] Stud1 = new Student[3];
//        System.out.println(Arrays.toString(Stud1));


        Student sample;
        sample = new Student();

        sample.rno = 13;
        sample.name = "Unique";
        sample.marks = 99.65f;
        System.out.println(sample.rno + " " + sample.name + " " + sample.marks);        // defined val in the class already so print it as it is;
        sample.greet();

        Student sam1;
        sam1 = new Student(20, "Rajesh", 82.54f);
        System.out.println(sam1.rno + " " + sam1.name + " " + sam1.marks);        // using Student(val) constructor
        sam1.greet();

        Student sam2;
        sam2 = new Student();
        System.out.println(sam2.rno + " " + sam2.name + " " + sam2.marks);       // using student() constructor
        sam2.greet();

        Student sam3;
        sam3 = new Student(44, "Rrehsam", 89.12f);
        System.out.println(sam3.rno + " " + sam3.name + " " + sam3.marks);


        //                      key final

        int c = 10;
        final int d = 20;       // final b4 datatype work as a constant, it can't be modified later
        // declared it while initializing
        // int d is primitive datatype, so it can't be modified after final it

        // But when constructor become final still it can be modified but can't be reassigned it;
        final Student umesh = new Student(34, "Umesh", 34.34f);
//        umesh = new Student("Yash");          // if i use final over here b4 Student than  change in the Umesh name can't possible by constructor
        umesh.name = "dj fssde";    // it can be possible
        System.out.println(umesh.name);

    }
}

class Student {
    // this all is default value
    int rno ;
    String name;
    float marks;


    void greet(){
        System.out.println("Hello! My kname is " + this.name);
    }

    // this is a constructor used to avoid repeat the object name again and again
    Student(){
        this.rno = 24;
        this.name = "Anamica";
        this.marks = 88.34f;
    }

//    Student(int roll, String naam, float mark){       // if function variable and class variable is diff than no need to use this.
//        rno = roll;
//        name = naam;
//        marks = mark;
//    }


//    Student Bro = new Student(53, "Bro Code", 743.34);
//    here this is replaced with Bro

    Student(int rno, String name, float marks){ // if passing variable in the functions are same as the variable in class than use this. to access the value
        this.rno = rno;     // if not use this. then it will print the null value
        this.name = name;
        this.marks = marks;
    }

    Student(String other){
        this.name = other;
    }
}
