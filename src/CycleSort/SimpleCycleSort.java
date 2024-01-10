package CycleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

//When given range from 1 to n then always use cycle sort
public class SimpleCycleSort {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        cycleSort(a);
        System.out.println(Arrays.toString(a));
    }

    static void cycleSort(int []arr){

        int i=0;
        while (i < arr.length){
            int rIndex = arr[i] - 1;
            if(arr[i]  != arr[rIndex]){
                swap(arr,i,rIndex);
            }else{
                i++;
            }
        }

    }

    static void swap(int []arr,int target, int with){
        int temp = arr[target];
        arr[target] = arr[with];
        arr[with] = temp;
    }
}
