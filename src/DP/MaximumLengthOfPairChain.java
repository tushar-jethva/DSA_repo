package DP;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthOfPairChain {
    public static void main(String[] args) {
        int[][] pairs = {
                {-6,9},{1,6},{8,10},{-1,4},{-6,-2},{-9,8},{-5,3},{0,3}
        };

        System.out.println(findLongestChain(pairs));
        findLongestChain(pairs);
    }
    public static int findLongestChain(int[][] pairs) {
        System.out.println(pairs.length);
        Arrays.sort(pairs, (a,b)-> Double.compare(a[0],b[0]));
        for (int i = 0; i < pairs.length; i++) {
            for (int j = 0; j < pairs[0].length; j++) {
                System.out.print(pairs[i][j]+" ");
            }
            System.out.println();
        }
        if(pairs.length==1){
            return 1;
        }
        return Math.max(usingRecursion(pairs,1,pairs[0][1])+1,usingRecursion(pairs,2,pairs[1][1])+1) ;
//        return  usingRecursion(pairs,1,pairs[0][1]);
    }

    public static int usingRecursion(int[][] pairs,int index,int value){

        if(index==pairs.length){
            return 0;
        }

        int include = 0;
        int exclude = 0;

        if(pairs[index][0] > value){
            include = 1 + usingRecursion(pairs,index+1,pairs[index][1]);
        }

            exclude = usingRecursion(pairs, index + 1, value);


        return Math.max(include,exclude);
    }
}
