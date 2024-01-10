package DP;

import java.util.Arrays;

//include exclude pattern
public class EqualPartition {
    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int target = sum/2;
        // return usingRecursion1(nums,0,target);
        int[][] dp = new int[nums.length+1][target+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        boolean ans = usingTopDownApproach(nums,0,target,dp);
        System.out.println(ans);

        usingBottomUpApproach(nums,target);
    }

    public static boolean usingTopDownApproach(int[] nums, int index,int target,int[][] dp){
        if(target<0 ){
            return false;
        }

        if(target == 0 && index==nums.length){
            return true;
        }
        else if(target!=0 && index==nums.length){
            return false;
        }

        if(dp[index][target]!=-1){
            if(dp[index][target]==1){
                return true;
            }
            else{
                return false;
            }
        }

        boolean include = usingTopDownApproach(nums,index+1,target-nums[index],dp);
        boolean exclude = usingTopDownApproach(nums,index+1,target,dp);

        boolean ans = include||exclude;
        if(ans){
            dp[index][target] = 1;
        }
        else{
            dp[index][target]=0;
        }
        return ans;
    }

    public static boolean usingBottomUpApproach(int[] nums,int target){
        int n = nums.length;
        boolean[][] dp = new boolean[nums.length+1][target+1];
        for(boolean[] row:dp){
            Arrays.fill(row,false);
        }

        for(int i=0;i<n;i++){
            dp[i][0] = true;
        }

        for(int index = n-1;index>=0;index--){
            for(int t = 1;t<=target;t++){
                boolean include = false;
                if(t-nums[index]>=0)
                    include = dp[index+1][t-nums[index]];
                boolean exclude = dp[index+1][t];

                dp[index][t] = include||exclude;

            }
        }
        return dp[0][target];
    }

    public static boolean usingMemoryOptimization(int[] nums,int target){
        int n = nums.length;
        boolean[] curr = new boolean[n+1];
        boolean[] next = new boolean[n+1];
        Arrays.fill(curr,false);
        Arrays.fill(next,false);

        curr[0] = true;
        next[0] = true;

        for(int index = n-1;index>=0;index--){
            for(int t = 1;t<=target;t++){
                boolean include = false;
                if(t-nums[index]>=0)
                    include = next[t-nums[index]];
                boolean exclude = next[t];

                curr[t] = include||exclude;

            }
        }
        return curr[target];
    }




}
