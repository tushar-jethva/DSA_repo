package Question_6.B;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class q2150 {
    public static void main(String[] args) {
        int[] nums = {10,8,5,6};
        findLonely(nums);
    }
    public static List<Integer> findLonely(int[] nums) {

        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int num: nums){
            hash.put(num,hash.getOrDefault(num,0)+1);

        }
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            if(hash.get(num)>1||hash.containsKey(num+1)||hash.containsKey(num-1)){
                continue;
            }
            list.add(num);

        }
        return list;
    }
}
