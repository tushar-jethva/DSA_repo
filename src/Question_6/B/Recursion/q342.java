package Question_6.B.Recursion;

public class q342 {
    public static void main(String[] args) {
        isPowerOfFour(16);
        System.out.println(isPowerOfFour(16));
    }

    public static boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if(n%4==0){
            return isPowerOfFour(n/4);
        }
        return false;
        //return n>0 && ( (n==1) || (n%4==0) && isPowerOfFour(n/4));
    }

}
