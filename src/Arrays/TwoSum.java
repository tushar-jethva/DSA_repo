package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

public class TwoSum {
    public static void main(String[] args) {

        int [] arr = {-3,-1,0,0,0,3,3};
        //System.out.println(arr.length);
        int target = 6;
        //System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(duplicate(arr));
    }

    public static int[] twoSum(int[] nums, int target) {

        int []arr = {-1,-1};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }

        return arr;
    }

    static int duplicate(int []nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        var sorted = set.stream().sorted();
        Object[] arr = sorted.toArray();
        Arrays.fill(nums,0);
        for (int i = 0; i < set.size(); i++) {
            nums[i]= (int)arr[i];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println(nums[i]);
        }
        return set.size();
    }



}
