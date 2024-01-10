package CycleSort;

import java.lang.reflect.Array;
import java.util.Arrays;
//range given from [0,n]
public class MissingNumber {
    public static void main(String[] args) {

        int []arr = {0,2,3};
        System.out.println(cycleSort(arr));
    }


    static int cycleSort(int []arr){
         int i = 0;

         while (i<arr.length  ){
             int correct = arr[i];
             if(arr[i] < arr.length && arr[i] != arr[correct] ){
                 swap(arr,i,correct);
             }
             else {
                 i++;
             }
         }

         //search element
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] != j){
                    return j;
                }

            }

            return arr.length;

        }
    static void swap(int []arr,int target, int with){
        int temp = arr[target];
        arr[target] = arr[with];
        arr[with] = temp;
    }
}
