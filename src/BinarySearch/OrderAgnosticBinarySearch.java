package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int []arr = {77,76,65,60,55,45,33,12,11,9};
        int ans = orderAgnostic(arr,55);
        System.out.println(ans);

    }
    static int orderAgnostic(int []arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];



            while (start <= end) {
                // int mid = (start + end)/2;
                //might be possible that (start+end) exceed the range of intger

                int mid = start + (end - start) / 2;
                //it just like 2s + end - s / 2;


                if(arr[mid] == target){
                    return mid;}


                if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;

                } }
                else{
                    if(target < arr[mid]){
                        start = mid+1;
                    }
                    else if(target>arr[mid]){
                        end = mid - 1;
                    }
                }
            }


            return -1;
    }
}
