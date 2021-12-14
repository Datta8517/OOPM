import java.util.Scanner;

// import com.Basics.sum;

public class SplitArr {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<nums.length; i++){
            nums[i] = in.nextInt();
        }

        int m = in.nextInt();

        splitArray(nums, m);

        System.out.println(splitArray(nums,m));
    }

    static int splitArray(int[] nums, int m){

        int st =0;          // low : is always = max element of the arr
        int en = 0;         // high : is always = sum of all the element of the arr

        for(int i=0; i<nums.length; i++){
            en+=nums[i];
            st = Math.max(st, nums[i]);
        }

        int ans =0;             // Our final ans initilize with 0

        while(st<=en){          // check wether our low is <= high or not
            int mid = st + (en - st)/2;

            if(isPossible(nums, m, mid)==true){     // distribution is <= m 
                ans = mid;                          // update ans = mid , may be it can be better ans 
                en = mid-1;                     // try to minimize the ans by updating en = mid -1
            }
            else{                       // after updating en =mid -1 , our distribution take more than required
                st = mid+1;             // then increase the (st) by updating st = mid+1
            }
        }

        return ans;                     //return minimum sum of the distributed
    }

    static boolean isPossible(int[] nums, int m, int mid){

        int pieces = 1;             // minimum distribution is 1;
        int sum=0;              // sum var use to add the contigues sub arr in it which <= mid

        for(int i =0; i<nums.length; i++){
            sum+=nums[i];       // initialize to add each elem till <= mid

            if(sum> mid){       // if sum become mmore than mid it means it required 2nd piece
                pieces++;        // so update piece by 1 
                sum = nums[i];  // start sum with next elem of piece 1  
            }
        }

        if(pieces<=m){          // if piece is less than = m then return true
            return true;
        }

        return false;       // if pieces/ distribution is more than m return false
    }
    
}
