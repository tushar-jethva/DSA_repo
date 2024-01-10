package BinarySearch;

public class RotationCountInRotatedArray {
    public static void main(String[] args) {
        int []arr = {4,5,6,7,1,2,3};
        System.out.println(countRotation(arr));
    }

    static int countRotation(int []arr){
        int pivot = findPivot(arr);
        return pivot+1;
    }

    //when duplicate value is available
    static int findDuplicatePivot(int []arr){
        int start = 0;
        int end = arr.length - 1;

        while (start<=end){
            int mid = start + (end - start) / 2;
            //4 cases over here
            //why write mid < end bcz it can give ArrayIndexOutOfBound bcz arr[mid] > arr[mid +  1] if mid is last element
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates
                //NOTE: what if these elements at start and end were the pivot?

                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                //check whether end is pivot
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }

            //left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }


    //when not duplicate value
    static int findPivot(int []arr){
        int start = 0;
        int end = arr.length - 1;

        while (start<=end){
            int mid = start + (end - start) / 2;
            //4 cases over here
            //why write mid < end bcz it can give ArrayIndexOutOfBound bcz arr[mid] > arr[mid +  1] if mid is last element
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }


}
