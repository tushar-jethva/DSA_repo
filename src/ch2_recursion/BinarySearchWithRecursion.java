package ch2_recursion;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int []arr = {1,20,30,40,50,55};
        int target = 50;
        int ans = bs(arr,target,0,arr.length-1);
        System.out.println(ans);
    }

    public static int bs(int []arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if (arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return bs(arr,target,start,mid - 1);
        }

            return bs(arr, target, mid + 1, end);

    }
}
