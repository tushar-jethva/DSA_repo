package Question_6.B.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class q350 {
    public static void main(String[] args) {
        int[] a = {1,2,2,1};
        int[]b = {2};
        intersect(a,b);
        System.out.println(Arrays.toString(intersect(a, b)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int j : nums1) {
            int a = bs(j, nums2);
            list.add(a);
        }

        for (int j : nums2) {
            int a = bs(j, nums1);
            list2.add(a);
        }
        int list1c=0;
        int list2c=0;

        for(int i=0;i<list.size();i++){
            if(list.get(i)!=-1){
                list1c++;
            }
        }
        for(int i=0;i<list2.size();i++){
            if(list2.get(i)!=-1){
                list2c++;
            }
        }

        if(list1c<=list2c){
            for(int i=0;i<list.size();i++){
                if(list.get(i)!=-1){
                    list1.add(list.get(i));
                }
            }
            int[] newArr = new int[list1.size()];
            for(int i=0;i<list1.size();i++){
                newArr[i] = list1.get(i);
            }
            return newArr;
        }
        else{
            for(int i=0;i<list2.size();i++){
                if(list2.get(i)!=-1){
                    list1.add(list2.get(i));
                }
            }
            int[] newArr = new int[list1.size()];
            for(int i=0;i<list1.size();i++){
                newArr[i] = list1.get(i);
            }
            return newArr;
        }


//        System.out.println(list);
//        System.out.println(list1);



    }

    public static int bs(int target,int[] arr){
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(target == arr[mid]){
                return target;
            }
            else if(target>arr[mid]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }
}
