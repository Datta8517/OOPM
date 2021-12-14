import java.util.Scanner;

public class CeilingOfNumArr {
    public static void main(String[] args){

        System.out.println("********Ceiling of the given num*************\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Size of the arr: ");
        int n= in.nextInt();


        System.out.println("Enter the element of the arr: ");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = in.nextInt();

        System.out.println("smallest element in an arr which is >=target");
        System.out.println(ceilingNum(arr, target));

    }

    static int ceilingNum(int[] arr, int target){
        int st = 0;
        int en = arr.length-1;

        if(target>arr[arr.length-1]){
            return -1;
        }
//        System.out.println(arr[arr.length-1]);

        while(st<=en){
            int mid = st + (en-st)/2;

            if(arr[mid] == target){
                return arr[mid];
            }

            if(target>arr[mid]){
                st = mid+1;
            }
            else if(target<arr[mid]){
                en = mid-1;
            }
        }
        return arr[st];
    }
}
