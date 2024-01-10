package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CodeOfBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int l = sc.nextInt();
        int [] n =  new int[l];

        for (int i = 0; i < l; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println("Enter target element: ");
        int t = sc.nextInt();
        int ans = SimpleBinarySearch(n,t);
        System.out.println(ans);
    }
    static int SimpleBinarySearch(int []arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            // int mid = (start + end)/2;
            //might be possible that (start+end) exceed the range of integer

            int mid = start+ (end - start)/2;
            //it just like 2s + end - s / 2;


            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;

            }
            else{
                //answer found
                return mid;
            }
        }
        return -1;
    }
}
