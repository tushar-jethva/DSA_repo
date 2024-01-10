package BinarySearch;

public class InfiniteArraySearching{

    public static void main(String[] args) {

        int [] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(answer(arr,target));
    }

    static int answer(int[] arr, int target){
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            //double the box value
            //end = previous end + sizeofbox * 2

            end = end +  (end - start + 1) * 2;
            start = newStart;
        }
        return SimpleBinarySearch(arr,target,start,end);


    }
    static int SimpleBinarySearch(int []arr,int target,int start, int end) {

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
