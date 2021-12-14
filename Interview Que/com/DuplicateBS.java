public class DuplicateBS {
    
    public static void main(String[] args){
        int[] arr = {2,3,3,4,8,9,1,1,2};
        int target = 1;

        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        int pivot = duplicatePivot(arr);

        if(pivot == -1){
            return  binarySearch(arr, target, 0, arr.length-1);
        }
        if(arr[pivot] == target ){
            return pivot;
        }
        if(arr[0] <= target){
            return binarySearch(arr, target,  0, pivot-1);
        }
        return binarySearch(arr, target, pivot+1, arr.length-1);
    }

    static int binarySearch(int[] arr, int target, int st, int en){

        while(st<=en){
            int mid = st + (en-st)/2;

            if(target == arr[st]){
                return st;
            }
            if(target< arr[mid]){
                en = mid-1;
            }
            else if(target > arr[mid]){
                st = mid+1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }

    static int duplicatePivot(int[] arr){
        int st =0;
        int en = arr.length-1;

        while(st <= en){
            int mid = st + (en-st)/2;

            // If elem of the mid is greater than nxt one it means mid elem is pivot
            if(mid<en && arr[mid]>arr[mid+1]){
                return mid;
            }
            //elem of mid is less than mid-1 then mid -1 is pivot
            if(mid> st && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] == arr[st] && arr[mid] == arr[en]){
                // Skip the duplicate
                //NOTE: what if st or en will be the pivot
                // check  wether st or en is pivot or not
                if(st<en && arr[st]>arr[st+1]){
                    return st;
                }
                st++;

                if(arr[en] < arr[en-1]){
                    return en-1;
                }
                en--;
            }
            //sort either left or right side according to pos of pivot
            else if(arr[mid]> arr[st] || arr[st] == arr[mid] && arr[en]< arr[mid]){
                //left side is sorted it means pivot is on right side so st = mid+1;
                st = mid+1;
            }
            else{
                // right side is sorted then pivot is on left side so en = mid -1;
                en = mid -1; 
            }
        }
        return -1;
    }
}
