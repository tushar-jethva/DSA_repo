package BinarySearch;

import java.util.Arrays;

public class FindInMatrixBS {
    public static void main(String[] args) {
        int [][]arr = {

                {1,3,5,7},{10,11,16,20},{23,30,34,60}
        };
        int target = 13;
        System.out.println(Arrays.toString(findMatrixElement(arr, target)));
    }

    static int[] findMatrixElement(int [][]arr,int target){

        int r = 0;
        int c = arr.length - 1;

        while(r<=arr.length - 1 && c>=0){

            if(arr[r][c] == target){
                return new int[]{r+1,c+1};
            }
            else if(arr[r][c] > target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
