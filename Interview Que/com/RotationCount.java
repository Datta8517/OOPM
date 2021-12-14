public class RotationCount{

    //////  ARRAY SHOULD BE SORTED TO APPLY BINARY SEARCH
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,7};
        System.out.println(countRotation(arr));
    }

    static int countRotation(int[] arr){

        int pivot = findPivot(arr);
        
        return pivot+1;
        //if arr is non-roteted then pivot = -1 & hence it return 0;
        //if arr is roteted then countRotation = pivot+1;
    }

    // If the elem of arr is not duplicate
    static int findPivot(int[] arr){

        int st =0;
        int en = arr.length-1;

        while(st<= en){
            int mid = st + (en-st)/2;
            // If elem of the mid is greater than nxt one it means mid elem is pivot
            if(mid<en && arr[mid]>arr[mid+1]){
                return mid;
            }
            //elem of mid is less than mid-1 then mid -1 is pivot
            if(mid> st && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            // if arr obey the above case than short the arr
            // 1) if mid elem is <= arr of start than shift en to mid -1
            // bcoz pivot is betwn st to mid
            if(arr[mid]<= arr[st]){
                en = mid-1;
            }
            //if arr of start is <= arr of mid than shift start to mid +1;
            // bcoz pivot is betwn mid to en  
            else{
                st = mid +1;
            }
        }

        return -1;
    }

}


