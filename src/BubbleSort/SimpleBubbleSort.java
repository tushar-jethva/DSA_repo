package BubbleSort;
import java.util.Arrays;
public class SimpleBubbleSort {
    public static void main(String[] args) {

        int []arr = {5,4,3,-1,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString((arr))
        );
    }

    static void bubbleSort(int []arr){

        boolean swapped ;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                //if j < j-1 then swap

                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
