package Question_6.B;
import java.util.Arrays;
public class q1346 {
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        checkIfExist(arr);
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int s = 0;
            int e = arr.length - 1;
            if(arr[i] % 2==0 && arr[i] !=0){
                int gap = arr[i]/2;
                while(s<=e){
                    int mid = s+(e-s)/2;

                    if(arr[mid] == gap){
                        return true;
                    }
                    else if(arr[mid]> gap){
                        e = mid - 1;
                    }
                    else{
                        s = mid+1;
                    }
                }}

        }
        return false;
    }
}
