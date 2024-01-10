package BinarySearch;

public class CeilingOfTarget {
    public static void main(String[] args) {
        int []arr = {-19,-10,-2,-1,0,10,11,24,43,45,50};
        int ans = CeilingNumber(arr,24);
        System.out.println(ans);
    }

    //Ceiling means smallest element greater than target or equal to target
    static int CeilingNumber(int []arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            // int mid = (start + end)/2;
            //might be possible that (start+end) exceed the range of intger

            int mid = start+ (end - start)/2;
            //it just like 2s + end - s / 2;


            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;

            }
            else{
                //answer found
                return mid;
            }
        }
        return start;
    }
}


