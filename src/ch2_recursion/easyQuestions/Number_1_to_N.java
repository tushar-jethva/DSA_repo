package ch2_recursion.easyQuestions;

public class Number_1_to_N {
    public static void main(String[] args) {
        funBoth(5);
    }

    static void number(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        number(n-1);
    }

    static void revNumber(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        revNumber(n-1);
        System.out.println(n);
    }

    static void funBoth(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
