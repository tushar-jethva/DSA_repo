package DP;

public class PredictTheWinner {
    public static void main(String[] args) {
        int[] nums = {1,5,233,7};
        System.out.println(predictTheWinner(nums));
        predictTheWinner(nums);

    }
    public static boolean predictTheWinner(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int ans = usingRecursion(nums,0,nums.length-1);
        int p21 = player2Recursion(nums,1,nums.length-1);
        int p22 = player2Recursion(nums,0,nums.length-2);
        int p2Ans = Math.min(p21,p22);

        System.out.println(ans);
        System.out.println("Player 2 Ans: "+p2Ans);
        return ans >= p2Ans;
    }

    public static int usingRecursion(int[] nums,int i,int j){
        if(i==j){
            return nums[i];
        }
        if(i>j){
            return 0;
        }
        int a1=0;
        if(nums[i+1]>nums[j])
        {
            a1 = nums[i] + usingRecursion(nums,i+2,j);

        }
        else{
            a1 = nums[i] + usingRecursion(nums,i+1,j-1);
        }

        int a2 = 0;
        if(nums[i]>nums[j-1])
        {
            a2 = nums[j] + usingRecursion(nums,i+1,j-1);
        }
        else{
            a2 = nums[j] + usingRecursion(nums,i,j-2);
        }
        int ans = Math.max(a1,a2);
        return ans;
    }

    public static int player2Recursion(int[] nums,int i, int j){

        if(i==j){
            return nums[i];
        }
        if(i>j){
            return 0;
        }

        int p1 = 0;
        if(nums[i]>nums[j]){
            if(nums[i+1]>nums[j])
            p1 = nums[i] + player2Recursion(nums,i+2,j);
            else
                p1= nums[i] + player2Recursion(nums,i+1,j-1);
        }
        else{
            if(nums[j-1]>nums[i]){
                p1 = nums[j] + player2Recursion(nums,i,j-2);
            }
            else{
                p1 = nums[j] + player2Recursion(nums,i+1,j-1);
            }
        }
        return p1;
    }
}
