package BitsToBytes;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int []arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            String a = sc.next();
        }


    }
    static int money(int[] arr,String acc)
    {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            if (acc.charAt(i)=='1'){
                sum+=arr[i];
            }
        }
        sum*=(100000);
        sum/=2000;
        int gst = (sum*12)/100;
        sum = sum - gst;
        System.out.println(gst);
        return sum;
    }
}
