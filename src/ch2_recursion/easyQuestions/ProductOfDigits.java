package ch2_recursion.easyQuestions;

public class ProductOfDigits {
    public static void main(String[] args) {
        int ans = productDigits(505);
        System.out.println(ans);
    }

    static int productDigits(int n){
        if(n==0){
            return 1;
        }
        return (n%10) * productDigits(n/10);
    }
}
