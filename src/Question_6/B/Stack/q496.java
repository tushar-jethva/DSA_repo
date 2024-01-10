package Question_6.B.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Arrays;

public class q496 {
    public static void main(String[] args) {
        int[] find = {4,1,2};
        int[] nums = {1,2,3,4,5};
       // nextGreaterElement2(find,nums);
        System.out.println(Arrays.toString(nextGreaterElement2(find,nums)));
    }

    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
      //  System.out.println(map);
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }

    public static int[] nextGreaterElement2(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
          System.out.println(map);
        for (int i = 0; i < nums.length-1; i++){
            nums[i] = map.getOrDefault(nums[i], -1);}

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==-1){
                nums[nums.length-1] = i+1;
            }
            else{
                nums[nums.length-1] = -1;
            }
        }

        return nums;
    }
}
