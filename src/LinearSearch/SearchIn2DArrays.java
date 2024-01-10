package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int [][]arr = {{2,3,4},{10,20,30,40},{15,25,35,45},{1,22}};
        int target = 45;
        System.out.println(Arrays.toString(search(arr, target)));

    }
    static int[] search(int [][]arr,int target){

        for (int row = 0;row<arr.length;row++){

            for(int col = 0; col<arr[row].length;col++){

                if(arr[row][col] == target){
                    return new int[]{row+1,col+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
