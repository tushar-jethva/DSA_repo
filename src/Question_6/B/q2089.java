package Question_6.B;

import java.util.*;

public class q2089 {
    public static void main(String[] args) {

       int[] nums = {1,2,5,2,3,2};
       ArrayList<Integer> list  = new ArrayList<>();
       list = (ArrayList<Integer>) targetIndices(nums,2);
        System.out.println(list);
    }
    public static List<Integer> targetIndices(int[] nums, int target) {

        Arrays.sort(nums);ArrayList<Integer> listM = new ArrayList<>();


        int left = search(nums,true,target);
        int right = search(nums,false,target);

        for (int i = left; i <=right ; i++) {
            listM.add(i);
        }



        return listM;
        }



    static int search(int[] nums,boolean isFirst,int target){
       int  start = 0;
       int end = nums.length - 1;

       int ans = -1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(nums[mid] > target ){
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                    ans=mid;

                if(isFirst){
                    end = mid - 1;
                }
                else{
                    start =  mid + 1;
                }
            }

        }
        return ans;
    }
}
