package Question_6.B;

import java.util.Arrays;

public class q167 {
    public static void main(String[] args) {
        int []nums = {2,3,4,7,11};
        twoSum(nums,6);

        System.out.println("he");
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length-1; i++) {
            int s = i+1;
            int e = numbers.length;
            int gap = target - numbers[i];

            while (s<=e){
                int mid = s+(e-s)/2;
                if (numbers[mid] == gap){
                    return new int[]{i+1,mid+1};
                }
                else if(numbers[mid] > gap){
                    e = mid - 1;
                }
                else{
                    s = mid+1;
                }
            }

        }
        return new int[]{-1,-1};
    }
}
