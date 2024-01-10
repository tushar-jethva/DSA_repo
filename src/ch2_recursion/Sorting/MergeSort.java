package ch2_recursion.Sorting;
import java.util.Arrays;
public class MergeSort {

    static void mergeSort2(int []arr, int start, int end){

        if(end - start == 1){
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort2(arr,start,mid) ;
        mergeSort2(arr,mid,end);
        mergeInPlace(arr,start,mid,end);


    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {

        int[] mix = new int[end-start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i< mid && j< end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the arrays is not completed
        //copy the remaining element
        while(i< mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j< end){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }

    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
         mergeSort2(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int []arr){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid)) ;
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length+ second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i< first.length && j< second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the arrays is not completed
        //copy the remaining element
        while(i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k] = first[j];
            j++;
            k++;
        }
        return mix;
    }
}
