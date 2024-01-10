package MathQuestions;

public class OddorEven {
    public static void main(String[] args) {
        oddOrEven(12);
    }

    public static void oddOrEven(int n){

        if((n&1)==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }


}
