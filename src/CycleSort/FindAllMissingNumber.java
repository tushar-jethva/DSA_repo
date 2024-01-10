package CycleSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumber {
    public static void main(String[] args) {
        int []arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i<nums.length  ){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct] ){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        //search element
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                list.add(j+1);

            }

        }
        return list;
    }
    static void swap(int []arr,int target, int with){
        int temp = arr[target];
        arr[target] = arr[with];
        arr[with] = temp;
    }
}
