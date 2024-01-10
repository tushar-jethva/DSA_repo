package ch2_recursion;

public class coin_problem {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int target = 5;
        System.out.println(minimum_no_require_to_make_sum(arr,target));
    }

    public static int minimum_no_require_to_make_sum(int[] arr, int target){
        if(target == 0){
            return 0;
        }
        if(target<0){
            return Integer.MAX_VALUE;
        }

        int mini = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
           int ans =  minimum_no_require_to_make_sum(arr,target-arr[i]);
           //why +1 bcz to reach that position we required always one step so have to do one step otherwise always get 0 answer.
            //if we don't do ans!=Integer.Max_value than whenever we get return as max value and we do ans+1 then it cross it
            //limits of integer than we don't get correct answer if you want watch just remove condition

            if(ans!=Integer.MAX_VALUE)
            mini = Math.min(ans+1,mini);
        }
        return mini;
    }
}
