package DP;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumberOfTaps {
    public static void main(String[] args) {
        int n = 3;
        int[] ranges = {0,0,0,0};
        minTaps(n,ranges);
    }
    public static int minTaps(int n, int[] ranges) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            List<Integer> tList = new ArrayList<>();
            tList.add(i-ranges[i]);
            tList.add(i+ranges[i]);
            list.add(new ArrayList<>(tList));
        }
        System.out.println(list);
//        return 0;
        System.out.println(usingRecursion(list,0,-1,n));
         usingRecursion(list,0,-1,n);
         return 0;
    }

    public static int usingRecursion(List<List<Integer>> list,int curr,int prev,int n){
        if(list.get(curr).get(1)>=n){
            return 1;
        }

        int include = 0;
        if((prev == -1 && list.get(curr).get(0)<=0) || list.get(curr).get(1) <= list.get(prev).get(1)){
            include = 1 + usingRecursion(list,curr+1,curr,n);
        }

        int exclude = usingRecursion(list,curr+1,prev,n);

        return Math.min(include,exclude);
    }
}
