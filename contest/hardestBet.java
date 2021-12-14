import java.util.Scanner;

public class hardestBet {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t--){
            int A= in.nextInt();
            int B= in.nextInt();
            int C = in.nextInt();

            int mn = A;
            if(B<mn){
                mn = B;
            }
            else if(C<mn){
                mn = C;
            }
            else{
                mn = A;
            }
            
            if(mn==B && mn==C){
                System.out.println("Draw");
            }
            if(mn==B){
                System.out.println("Bob");
            }
            else if(mn==C){
                System.out.println("Alice");
            }
            else{
                System.out.println("Draw");;
            }
        }
    }
}
