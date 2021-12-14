public class Basics {
    
    public static void main(String[] args){

        String a = "Dattatray"; // here we create a pool in heap memory and stored the value in it 
        String b = "Dattatray"; // and we can point to the same object with diff var name

        System.out.println(a==b);

        String name = new String("Dattatray");
        String sample = new String("Dattatray");    // using this method all var pointing two different object  of the same value

        System.out.println(name == sample);     //  here == check that two diff var pointing to the same object or not
        System.out.println(name.equals(sample));    // here .equal is used to check the value stored in differernt var is same or not

        System.out.println(name.charAt(2));     // to print the index of the string
    }
}
