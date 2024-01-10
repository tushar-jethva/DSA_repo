package SelectionSort;

import java.util.Arrays;

public class SimpleSelectionSort {
    public static void main(String[] args) {

        int []arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int []arr){

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = maxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int []arr,int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;

    }

    private static int maxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i < last ; i++) {
            if(arr[i] < arr[i+1]){
                max = i+1;
            }
        }
        return max;
    }
}
