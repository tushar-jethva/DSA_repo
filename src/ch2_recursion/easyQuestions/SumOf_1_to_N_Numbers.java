package ch2_recursion.easyQuestions;

public class SumOf_1_to_N_Numbers {
    public static void main(String[] args) {
        int ans = sumOfNumbers(5);
        System.out.println(ans);
    }

    static int sumOfNumbers(int n){

        if(n==1){
           return 1;
        }

        return n + sumOfNumbers(n-1);
    }
}
