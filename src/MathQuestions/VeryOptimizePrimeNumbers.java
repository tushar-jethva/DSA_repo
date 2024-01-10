package MathQuestions;

public class VeryOptimizePrimeNumbers {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
        String a = Integer.toBinaryString(n);
        System.out.println(a);
    }

    //false in array means number is prime assume that and make true of multiply of prime number
    static void sieve(int n , boolean [] primes){
        for (int i = 2; i * i <= n; i++) {
            if(!primes[i] ){
                for (int j = i*2; j <= n  ; j+=i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <=n ; i++) {
            if (!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
