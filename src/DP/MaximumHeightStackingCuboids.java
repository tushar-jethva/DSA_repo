package DP;
import java.util.*;

public class MaximumHeightStackingCuboids {
    public static void main(String[] args) {
        int[][] cuboids = {
                {92,47,83},{75,20,87},{68,12,83},{12,85,15},{16,24,47},{69,65,35},{96,56,93},{89,93,11},{86,20,41},{69,77,12},{83,80,97},{90,22,36}
        };

        maxHeight(cuboids);
    }

    public static int maxHeight(int[][] cuboids) {
        for(int[] row:cuboids){
            Arrays.sort(row);
        }

        Arrays.sort(cuboids,(a,b)->{
            if(a[0]==b[0]){
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        for (int i = 0; i < cuboids.length; i++) {
            for (int j = 0; j < cuboids[0].length; j++) {
                System.out.print(cuboids[i][j]+" ");
            }
            System.out.println();
        }


        return usingRecursion(cuboids,0,-1);
    }

    public static int usingRecursion(int[][] cuboids,int curr,int prev){
        if(curr>=cuboids.length){
            return 0;
        }

        int include = 0;
        if(prev==-1 || checkCanPut(cuboids,curr,prev)){
            include = cuboids[curr][2] + usingRecursion(cuboids,curr+1,curr);
        }

        int exclude = usingRecursion(cuboids,curr+1,prev);

        int ans = Math.max(include,exclude);
        return ans;
    }

    public static boolean checkCanPut(int[][] cuboids,int curr,int prev){
        if(cuboids[curr][0] >= cuboids[prev][0] && cuboids[curr][1] >= cuboids[prev][1] && cuboids[curr][2] >= cuboids[prev][2]){
            return true;
        }
        return false;
    }
}
