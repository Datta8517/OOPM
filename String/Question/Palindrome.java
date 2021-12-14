package Question;

public class Palindrome {

    public static void main(String[] args){
        String name = "abcaa";

        if(isPalindrome(name)){
            System.out.println("Yes! It's Palindrome");
        }
        else{
            System.out.println("It's not Palindrome");
        }
        
    }

    static boolean isPalindrome(String str){
        

        for(int i=0; i<=str.length()/2; i++){
            char st = str.charAt(i);
            char en = str.charAt(str.length()-1-i);

            if(st!=en){
                return false;
            }

        }
        return true;
    }

}