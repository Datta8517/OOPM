public class Targget_in_PeakOfMountain {
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;

        System.out.println(findInMountain(arr, target));
    }

    static int findInMountain(int[] arr,  int target){
        int peak = peakIndexOfMountainArr(arr);

        int firstHalfArr = orderAgnosticBS(arr, target, 0, peak);
        int SecondHalfArr = orderAgnosticBS(arr, target, peak +1 , arr.length-1);
        
        if(firstHalfArr!=-1){
            return firstHalfArr;
        }

        return SecondHalfArr;
    }

    static int peakIndexOfMountainArr(int[] arr){
        int st = 0;
        int en = arr.length-1;

        while(st<en){
            int mid = st + (en-st)/2;

            if(arr[mid] < arr[mid+1]){
                st = mid+1;
            }
            else{
                en = mid;
            }
        }

        return st;
    }

    static int orderAgnosticBS(int[] arr, int target, int st, int en){

        boolean isAsc = arr[st]<arr[en];
        while(st<=en){
            int mid = st + (en-st)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target> arr[mid]){
                    st = mid+1;
                }
                else{
                    en = mid-1;
                }
            }
            else{
                if(target < arr[mid]){
                    st = mid+1;
                }
                else{
                    en = mid-1;
                }
            }
        }

        return -1;
    }
    

}
