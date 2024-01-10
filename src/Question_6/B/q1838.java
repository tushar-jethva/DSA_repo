package Question_6.B;

import java.util.Arrays;

public class q1838 {
    public static void main(String[] args) {

    }
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);
        int s = 1;
        int e = nums.length;
        int ans = 0;
        while (s<=e){
            int mid = s+(e -s)/2;
            if (possible(nums,mid,k)){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }

    private boolean possible(int[] nums, int mid, int k) {

        long windowSum = 0;
        long totalSum = 0;
        for (int i = 0; i < mid; ++i) {
            windowSum+=nums[i];
        }
         totalSum =  1L*nums[mid - 1] * mid;

        if (totalSum-windowSum<=k){
            return true;
        }
        int j = 0;
        for (int i = mid; i < nums.length; ++i) {

            windowSum-=nums[j];
            windowSum+=nums[i];
            totalSum =totalSum= 1L*nums[mid] *mid;

            if (totalSum - windowSum<=k){
                return true;
            }
            j++;
        }
        return false;
    }
}
