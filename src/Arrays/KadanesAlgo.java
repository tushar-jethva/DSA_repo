package Arrays;

public class KadanesAlgo {
    public static void main(String[] args) {
        int []arr =  {5,4,-1,7,8};//
        //int[]arr = {5,-3,5};
        kadaneEasy(arr);
        System.out.println(kadane(arr));
    }
    public static int kadane(int []nums){
        int max_sum;
        int sum_till_now;
        max_sum = nums[0];
        if(nums[0] < 0 ){
            sum_till_now = 0;
        }
        else {
            sum_till_now = nums[0];
        }

        for(int i = 1;i<nums.length;i++){
            max_sum = Math.max(max_sum,nums[i]+sum_till_now);
            sum_till_now += nums[i];
            if(sum_till_now < 0){
                sum_till_now = 0;
            }
        }
        return max_sum;
    }

    //2.second
    static int kadaneEasy(int[] nums){
        int sum_till_now = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum_till_now = Math.max(sum_till_now+nums[i] , nums[i]);
            maxSum = Math.max(sum_till_now,maxSum);
        }
        return maxSum;

    }
}
