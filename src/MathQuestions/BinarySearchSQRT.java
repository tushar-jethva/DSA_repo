package MathQuestions;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int p = 10;
        System.out.printf("%.10f",sqrt(n,p));
    }

    static double sqrt(int n, int p){
        int s = 0;
        int e = n;
        double pos = 0;

        double root = 0.0;
        while (s<=e){
            int m = s + (e - s)/2;

            if(m > n/m){
                e = m - 1;
            }
            else{
                pos = m;
                s = m + 1;
            }
        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {

            while (pos * pos <= n){
                root=incr;
                pos+=root;
            }
            pos -=incr;
            incr /= 10;
        }
        return pos;
    }

}
