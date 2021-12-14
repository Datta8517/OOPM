package com.staticExample;

public class Main {
//    Main obj = new Main();

    // why static use over here in psvm?
    // bcoz static means use the function without creating an object of that class it means it is independent of the class
    // Main class is the 1st thing which use to run the program
    // To run the Main function without creating an object we make it static
    // Static is belong to the class not to the object ......(Basic def of the static)
    public static void Main(String[] args) {
        Human Men1 = new Human(22, "Kashyap", 13000, false);
        System.out.println(Men1.name);
        System.out.println(Human.population);

        Human Men2 = new Human(34, "Drushyam", 30000, true);
        System.out.println(Men2.name);
//        System.out.println("Population for Kashyap is " + Men1.population);
//        System.out.println("Population for Drushyam is " + Men2.population);      // to access the population not to use object name to access it

        System.out.println("Population for Kashyap is " + Human.population);        // access the population by class name bcoz population is static
        System.out.println("Population for Drushyam is " + Human.population);       // this is right approach to acess the static things


    }
}
