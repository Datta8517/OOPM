// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
import java.util.Arrays;

public class FirstAndLast_Pos {

    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};

        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    static int search(int[] nums, int target, boolean firstindex){
        int ans = -1;
        int st = 0;
        int en = nums.length-1;

//        System.out.println(arr[arr.length-1]);

        while(st<=en){
            int mid = st + (en-st)/2;

            if(target>nums[mid]){
                st = mid+1;
            }
            else if(target<nums[mid]){
                en = mid-1;
            }
            else {
                ans = mid;
                if(firstindex){
                    en = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
        }
        return ans;
    }
}
