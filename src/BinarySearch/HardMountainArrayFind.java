package BinarySearch;

public class HardMountainArrayFind {
    public static void main(String[] args) {

        int []a = {0,1,2,4,2,1};
        System.out.println(search(a,4));

    }

    public static int search(int []arr, int target){
        int peak = peakIndexInMountainArray(arr);


        int findElementFirst = orderAgnostic(arr,target, 0,peak);
        if(findElementFirst != -1){
            return findElementFirst;
        }
        //Now try to search in second halve
        // Why we use orderAgnostic because second halve will be in desc. order

        return orderAgnostic(arr,target,peak+1,arr.length - 1);

    }

    public static int peakIndexInMountainArray(int []arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                //if it is greater no need to check in right side bcz right side it will in decresing order
                //we will not find the greater element as array is sorted

                end = mid;
            }
            else{
                //you are in ascending part of array
                start = mid + 1;
                //bcz we know that mid + 1 is largest so no need to start with mid so start with mid + 1

            }
        }

        //in the end, start == end and pointing to the largest element
        //start and end are always trying to find max element in above 2 cases
        //hence pointing to just one element, that is max element

        return start; // or can return end
    }

    static int orderAgnostic(int []arr, int target,int start, int end) {


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
