package CycleSort;

public class MissingPositive {
    public static void main(String[] args) {

    }

    static int missingNumber(int []arr){
        int i = 0;

        while (i<arr.length  ){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct] ){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }

        //search element
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                return j+1;
            }

        }

        return arr.length + 1;

    }
    static void swap(int []arr,int target, int with){
        int temp = arr[target];
        arr[target] = arr[with];
        arr[with] = temp;
    }
}
