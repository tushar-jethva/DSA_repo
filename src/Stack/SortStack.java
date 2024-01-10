package Stack;

import java.util.HashMap;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(1);
        stack.push(4);
        stack.push(5);
        sortStack(stack);
        for (Integer integer : stack) {
            System.out.println(integer);
        }
int[] num  = {3,2,3};
        majorityElement(num);
    }

    public static void sortStack(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int saved = stack.peek();
        stack.pop();

        sortStack(stack);
        sortedStack(stack,saved);
    }

    private static void sortedStack(Stack<Integer> stack, int saved) {
        if (stack.isEmpty() ||  stack.peek()<saved){
            stack.push(saved);
            return;
        }
        int savedSort = stack.peek();
         stack.pop();

         sortedStack(stack,saved);
         stack.push(savedSort);

    }
    public static void majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int num: nums){
            hash.put(hash.getOrDefault(num,0)+1,num);

        }
        int max = 0;
        for(int num:nums){
            if(hash.get(num)>max){
                max = hash.get(num);
            }
        }
        System.out.println(hash);
        System.out.println(max);
    //    return max;
    }
}
