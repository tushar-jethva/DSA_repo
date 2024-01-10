package CycleSort;

import java.util.ArrayList;
import java.util.List;

//given 1 to n range use cycle sort
public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int []nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {

        int i=0;

        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        //find the duplicate number
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return nums[j];
            }
        }
        return 0;
    }
    static void swap(int []arr,int target, int with){
        int temp = arr[target];
        arr[target] = arr[with];
        arr[with] = temp;
    }

}
