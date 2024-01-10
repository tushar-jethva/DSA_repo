package BinarySearch;

public class MountainArrayPeakElement {
    public static void main(String[] args) {
        int []arr = {1,2,3,5,6,4,3,2};
        System.out.println(peakIndexInMountainArray(arr));
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
}
