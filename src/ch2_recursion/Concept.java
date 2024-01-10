package ch2_recursion;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if(n==0){
            return;
        }
       // n-- vs --n
       //see in book
       // fun(n--);
        System.out.println(n);
        fun(--n);
    }
}
