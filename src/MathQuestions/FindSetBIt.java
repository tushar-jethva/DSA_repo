package MathQuestions;

public class FindSetBIt{
    public static void main(String[] args) {
        int n = 6;
        int count = 0;
        while (n>0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
    }

}
