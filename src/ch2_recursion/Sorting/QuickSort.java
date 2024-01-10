package ch2_recursion.Sorting;
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int low, int hi){

        if(low>=hi){
            return;
        }

        int s = low;
        int e = hi;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];

        while (s<=e){

            //it also for what if it's already sorted than it will not do anything
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }

            //why?
            //bcz our main condition check when whole loop is over but in loop we also do
            //s++ and e-- so we have to check whether they are less or not if sorted than no
            //need to do anything
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        //Now, recursion call for two halves sort them also now your pivot is at right position
        sort(arr,low,e);
        sort(arr,s,hi);
    }
}
