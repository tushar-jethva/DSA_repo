package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int []nums = {5,7,7,7,7,8,8,10};
        int target = 5;

        System.out.println(Arrays.toString(searchRange(nums, target)));

    }

    public static int[] searchRange(int[] nums, int target) {

        int []ans =  {-1,-1};

        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;

            return ans;

    }

    //for returning the index of start and end
   static int search(int []nums, int target, boolean checkForFirstElement){

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start<=end){
            // int mid = (start + end)/2;
            //might be possible that (start+end) exceed the range of intger

            int mid = start+ (end - start)/2;
            //it just like 2s + end - s / 2;


            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                // it may possible that occurance found right and left side also
                ans = mid;
                if(checkForFirstElement){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
