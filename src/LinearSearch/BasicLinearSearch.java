package LinearSearch;

import java.util.Arrays;

public class BasicLinearSearch {
    public static void main(String[] args) {
        int []a = {12,3,23,18,93};

        System.out.println(Arrays.stream(a).min().getAsInt());
        System.out.println(Arrays.stream(a).max().getAsInt());
        System.out.println(linearSearch(a,34));

    }

    static int linearSearch(int []arr, int target){
        if(arr.length == 0){
            return -1;
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(arr[i] == target){
                    return i;
                }
            }
        }
        return -1;
    }
}
