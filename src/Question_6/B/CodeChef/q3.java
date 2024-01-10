package Question_6.B.CodeChef;

import java.util.HashMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0){
            HashSet<Integer> set = new HashSet<>();
            int n = sc.nextInt();
            int co=0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int[]arr = new int[a];
                for (int j = 0; j < a; j++) {
                    arr[j] = sc.nextInt();
                    set.add(arr[j]);
                }
                System.out.println(set);
            }
            for (int k = 1; k <= 5; k++) {
                if (set.contains(k)){
                    co++;
                }
            }
            if (co==5){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }



    }
    public static void num(int []nums) {
       Arrays.sort(nums);
       int co=0;
       int di=1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                co++;
            }
            else{
                di++;
            }
        }
        if (di-co<2){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
        System.out.println(co+" "+di);
    }

   // public static void num2(int)
}
