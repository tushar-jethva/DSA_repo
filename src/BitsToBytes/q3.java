package BitsToBytes;

public class q3 {
    public static void main(String[] args) {
        String a = "{()}";
        check(a);
    }
    static void check(String a){
        int count = 0;
        for (int i = 0; i < a.length()-1; i++) {
            if(a.substring(i)==(a.substring(a.length()-1-i)));
            {
                System.out.println("InValid");
                break;
            }

        }
        if (count == a.length()){
            System.out.println("Valid");
        }
    }
}
