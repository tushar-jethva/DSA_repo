package InsertionSort;
import java.util.Arrays;

public class SimpleInsertionSort {
    static int a = 0;
    public static void main(String[] args) {

        int []a = {5,3,4,1,2};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

    static void insertionSort(int []arr){
        System.out.println(a);
        int i=0;

        while (i<=(arr.length - 2)){
            int j = i+1;
            while (j>0){
                if(arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
               }
                else {
                    break;
                }
            }
            i++;
        }
    }



    static void swap(int []arr,int j,int k){
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
