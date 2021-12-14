package com.Assignment;

import java.util.ArrayList;
import java.util.List;

public class KidsWithExtraCandie {
    
    public static void main(String args[]){

        int[] candies = {2,3,5,1,3};
        int n = 3; 
        System.out.println(extraCandies(candies, n));;
    }

    static List<Boolean> extraCandies(int[] candies, int extraCandies){

        int max = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }

        List<Boolean> ans = new ArrayList<>(10);

        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies >=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }

        return ans;
    }
}
