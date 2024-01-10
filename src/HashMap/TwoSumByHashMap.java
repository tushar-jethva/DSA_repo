package HashMap;


import java.util.Map;
import java.util.Set;
import java.util.*;

public class TwoSumByHashMap {
    public static void main(String[] args) {
        int []arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        int arr[] = {-1,-1};
        hash.put(nums[0],0);

        for(int i=1;i<nums.length;i++){

            int diff = Math.abs(nums[i] - target);
            if(hash.containsKey(diff)){
                arr[0] = hash.get(diff);
                arr[1] = i;
                break;
            }
            else{
                hash.put(nums[i],i);
            }
        }
        return arr;
    }
}
