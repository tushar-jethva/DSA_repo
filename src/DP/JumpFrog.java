package DP;

import java.util.Collections;

public class JumpFrog {
    public static void main(String[] args) {
        int[] stones = {0,1,3,5,6,8,12,17};
        canCross(stones);
        System.out.println(canCross(stones));
    }

    public static  boolean canCross(int[] stones) {
        if(stones[1]!=1){
            return false;
        }
//        boolean ans = usingRecursion(stones,1,,0,stones[stones.length-1],0);
//        return ans;
        boolean ans = usingRecursion1(stones,1,1,1);
        return ans;
    }

    public static boolean usingRecursion1(int[] stones,int k,int value,int index){
        if(k<0){
            return false;
        }
        if(k==0){
            return false;
        }
        int in = isExist(stones,value);
        if(in==-1){
            return false;
        }
        if(value == stones[stones.length-1]){
            return true;
        }

        boolean ans = false;
        for (int i = k-1; i <= k+1; i++) {
            boolean recAns = usingRecursion1(stones,i,value+i,in);
            ans = recAns || ans;
        }
        return ans;
    }

//    public static boolean  usingRecursion(int[] stones,int k,int value,int curr,int total,int index){
//        if(k<0){
//            return  false;
//        }
//        if (index>= stones.length){
//            return false;
//        }
////        if(!isExist(stones,curr)){
////            return false;
////        }
//        if(value>=total){
//            return true;
//        }
//
//        boolean ans = false;
//        for (int i = k-1; i <= k+1; i++) {
//            boolean recAns = false;
//            if(isExist(stones,curr))
//                recAns = usingRecursion(stones,i,value+k+i,k+i,total,index+1);
//            ans = recAns || ans;
//        }
//        return ans;
//    }

    public static int isExist(int[] stones,int target){
        int s = 0;
        int e = stones.length-1;

        while (s<=e){
            int mid = s+(e-s)/2;
            if(stones[mid] == target){
                return mid;
            }
            else if(stones[mid] < target){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return -1;
    }
}
