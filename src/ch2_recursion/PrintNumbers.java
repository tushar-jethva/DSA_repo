package ch2_recursion;

public class PrintNumbers {
    public static int Print(int n){
        if(n==1){
            return 1;
        }
        else {
            System.out.println(n);
            return Print(n-1);
        }
    }
    public static void main(String []args){
        System.out.println(Print(5));
    }
}
