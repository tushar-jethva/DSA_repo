package ch2_recursion.Sorting;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {2,1,4,3};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int []arr, int row, int col){
        if (row == 0){
            return;
        }

        if(col<row){
            if(arr[col] > arr[col+1]){
                //swap
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubble(arr,row,col+1);
        }
        else{
            bubble(arr,row - 1,0);
        }
    }
}
