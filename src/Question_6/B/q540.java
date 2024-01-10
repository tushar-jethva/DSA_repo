package Question_6.B;

public class q540 {
    public static void main(String[] args) {

        int[] nums = {3,3,7,7,10,11,11};
        singleNonDuplicate(nums);
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {

        int s = 0;
        int e = nums.length;

        while (true){
            int mid = s+(e-s)/2;


            if(nums[mid] != nums[mid+1] && nums[mid]!=nums[mid-1]){
                return mid;
            }
            else if(nums[mid]==nums[mid+1]){
                return bs(nums,mid+2,e);
            }
            else{
                int a = bs(nums,0,mid-2);
                int b = bs(nums,mid+1,nums.length);
            }
        }

    }

    public static int bs(int []nums, int s, int e){

        while (s<e){
            int mid = s+(e-s)/2;
            if(nums[mid] != nums[mid+1] && nums[mid]!=nums[mid-1]){
                return mid;
            }
            if(mid % 2==0){
             if(nums[mid]==nums[mid-1]){
                s = mid+1;


            }}
            else{
                e = mid -1;
            }
        }
        return s;
    }
}
