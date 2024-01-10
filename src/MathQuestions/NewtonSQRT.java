package MathQuestions;

public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(double n){
        double x = n;
        double root;
        while (true){
            root = 0.5 * (x + (n/x));

            //given < 1 can anything can 0.5 or 0.2 or can any as you decrease number you got more accurate answer
            if(Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}
