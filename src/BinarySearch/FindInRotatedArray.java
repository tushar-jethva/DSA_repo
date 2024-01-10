package BinarySearch;

public class FindInRotatedArray {
    public static void main(String[] args) {
        int []a = {5,1,2};
        int target = 5;
        System.out.println(search(a,target));
    }

    static int search(int []arr, int target){
        int pivot =  findPivot(arr);

//        int firstHalf = SimpleBinarySearch(arr,target,0,pivot);
//        if(firstHalf!=-1){
//            return firstHalf;
//        }
//        else{
//            return SimpleBinarySearch(arr,target,pivot+1, arr.length-1);
//        }


        //100 percent efficient
        //if you don't found pivot element it means the array is not rotated
        if(pivot == -1){
            return SimpleBinarySearch(arr,target,0,arr.length - 1);
        }

        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return SimpleBinarySearch(arr,target,0,pivot - 1);
        }
        return SimpleBinarySearch(arr,target,pivot+1,arr.length-1);
    }

    //This will not work for duplicate value
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
    static int SimpleBinarySearch(int []arr,int target,int start,int end) {


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
        return -1;
    }



}
