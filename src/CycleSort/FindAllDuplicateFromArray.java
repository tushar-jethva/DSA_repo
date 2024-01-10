package CycleSort;

import java.util.ArrayList;
import java.util.List;

import static CycleSort.SimpleCycleSort.swap;

public class FindAllDuplicateFromArray {
    public static void main(String[] args) {

        int []a={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(a));
    }
        public static List<Integer> findDuplicates(int[] nums) {
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
                    list.add(nums[j]);
                }
            }
            return list;

        }


}
