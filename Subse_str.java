public class Subse_str {

    public static void main(String [] args){
        subse("ABC", "");
    }

    static void subse(String s, String ans){
        if(s.length()==0){
            System.out.print(ans + " ");
            return ;
        }

        char ch = s.charAt(0);
        String ros = s.substring(1);

        subse(ros, ans);
        subse(ros, ans + ch);
    }
    
}
