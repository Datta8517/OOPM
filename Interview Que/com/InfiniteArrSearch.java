

public class InfiniteArrSearch {
    public static void main(String[] args){
        int[] arr = {2,4,6,8,9,15,18,20,21,22,28,31,46,51,58};
        int target = 46;

        int st = 0;
        int en =1;
        while(target > arr[en]){
            //to shift the st point from prev pt to new one
            int NewSt = en+1;
            //for new end we need to shift end to the double of nxt arr
            en = en + (en-st+1)*2;
            st  = NewSt;
        }
        System.out.println("Index is: " + binearySearch(arr,target,st,en));
    }

    static int binearySearch(int[] arr, int target, int st, int en){
        while(st<=en){
            int mid = st + (en-st)/2;

            if(target>arr[mid]){
                st = mid+1;
            }
            else if(target<arr[mid]){
                en = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
