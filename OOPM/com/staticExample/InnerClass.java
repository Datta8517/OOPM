package com.staticExample;

public class InnerClass {
    // When we create a class inside a class it means it is dependent
    // So class inside the class require their own object or it should be in static to access it;
//    class A{
//        int age;
//        String name;
//        int sal;
//
//        A(int age, String name, int sal){
//            this.age = age;
//            this.name = name;
//            this.sal = sal;
//        }
//
//    }


    // Here we make the class which inside the innerclass static
    static class A{
        int age;
        String name;
        int sal;

        A(int age, String name, int sal){
            this.age = age;
            this.name = name;
            this.sal = sal;
        }

    }

    public static void main(String[] args) {

        A obj1 = new A(22, "RAmaji", 34232);
        System.out.println(obj1.age);

        A obj2 = new A(32, "Bakiji", 56443);

        System.out.println(obj1.age);
        System.out.println(obj2.age);
    }
}
