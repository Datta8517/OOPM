import java.util.Arrays;

public class Methods {
    public static void main(String[] args){

        String name = " Jamkhande Dattatray";

        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name);       // Original will not change everytime it will create new object for the name

        System.out.println("    MyLife  ".strip());     // .strip() use to remove extra space b4 and after the word

        

    }
}
