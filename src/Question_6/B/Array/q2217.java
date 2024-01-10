package Question_6.B.Array;

import java.util.Arrays;

public class q2217 {
    public static void main(String[] args) {

        int[] queries = {1,2,3,4,44};
        kthPalindrome(queries,3);
        System.out.println(Arrays.toString(kthPalindrome(queries, 3)));;
    }
//    public long[] kthPalindrome(int[] queries, int intLength) {
//        int n = queries.length;
//        long[] ans = new long[n];
//        int i=0;
//
//        int halfPelindromLength = (intLength+1)/2;
//
//        long left =(long) Math.pow(10,halfPelindromLength-1);//10
//        long right = (long)Math.pow(10,halfPelindromLength)-1;//99
//
//        for(int q: queries){
//            long totalCount = (right-left)+1;
//            if(q<=totalCount){
//
//                String leftHalf = Long.toString(left+q-1);
//                String rightHalf = (new StringBuilder(leftHalf)).reverse().toString();
//
//                ans[i] = Long.parseLong(leftHalf+rightHalf.substring(intLength % 2));
//            }
//            else{
//                ans[i]=-1;
//            }
//            i++;
//        }
//
//        return ans;
//
//    }
    public static long[] kthPalindrome(int[] queries, int intLength) {
        int n = queries.length;
        long[] ans = new long[n];
        //for index we take i
        int i=0;

        //why we do +1 bcz to handle odd length also ex. intlength=5 then if we do (intLength)/2 == 2 only
        //but we want 5 digit number so we have +1 it gives 6 but from six we consider 3=left 3=right
        //but we take left and right from index 1 so we have total element = 5
        int halfPelindromLength = (intLength+1)/2;

        long left = (long)Math.pow(10,halfPelindromLength-1);
        long right = (long)Math.pow(10,halfPelindromLength)-1;

        for (int q:queries){
            long totalPelindrom = (right-left)+1;
            if (q<=totalPelindrom){

                //this is when we access with index ex. index = 2 intLength=4 so we want 11
                //so we add 10+2-1 that is left+q-1;
                String leftHalf = Long.toString(left+q-1);
                String rightHalf = (new StringBuilder(leftHalf)).reverse().toString();

                //why intLength % 2 to handle oddnumber length and not cosider middle element twice
                ans[i] = Long.parseLong(leftHalf+rightHalf.substring(intLength % 2));

            }
            else{
                ans[i] = -1;
            }
            i++;
        }
        return ans;


    }
}
