import java.util.ArrayList;

public class operators {
    
    public static void main(String[] args){

        System.out.println((int)'b');

        System.out.println('a'+'b');    // Here + operator add the ascii value of a & b bcoz it is in single quates
        
        System.out.println('a' + 1);

        System.out.println("a" + 3);
        //when an integer is added to the string it convert the int into wrapper class Integer that wil call toString
        // This means after few step : "a" + "1";

        System.out.println("a" + "b");

        System.out.println("a" + 'c');


        // + Operator in Java is only applicable with primitives

                            // string      //Complex Object
        System.out.println("Dattatray" + new Integer(17));
        System.out.println("Jamkhande" + new ArrayList<>());
            // System.out.println(new Integer(17) + new ArrayList<>());    // atleast required one string else show an error like this
        // Use + Operator with complex object is possoble but 1 condition is atleast contain 1 string
        
    
    }
}
