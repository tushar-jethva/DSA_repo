package CodeChef;
import java.util.*;

class local{
    static int immi(int a, int b, int c){
         a = (a+c) - b;
         return a;
    }
    static void tv(int A, int B, int C, int D){
        boolean tv;
        A = A - C;
        B = B - D;

        if(A>B){
            System.out.println("Second");
        }
        else if(B>A){
            System.out.println("First");
        }
        else{
            System.out.println("Any");
        }



    }

    static void freq(int []a){
        int c = 1;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(a);
        for (int i = 0; i < a.length-1; i++) {
          if(a[i] != a[i+1]){
              list.add(c);
              c=1;
          }
          else {
              c++;
          }
        }
        list.add(c);
        Collections.sort(list);
        System.out.println(list);

        if(list.size() == 1){
            System.out.println("YES");
        }
        else if(!list.get(list.size() - 1).equals(list.get(list.size() - 2))  ){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    static int two(int a){

        int c = 0;
        int d = a;
            while (a > 0) {
                a = a /2;
                c++;
            }
            if( d == Math.pow(2,c-1) ){
                return 0;
            }
            return two(d);
        }

        static int sec(int a){
        a = (a*60)/30;
        return a;
        }

        static int discount(int a){

        if(a<=100){
            return a;
        }
        else if(a<=1000){
            return a-25;
        }
        else if(a<=5000){
            return a - 100;
        }
        else {
            return a - 500;
        }
        }

        static int equal(int a, int b){
        int c = Math.max(a,b);
        int d = Math.min(a,b);

        int co = -1;
        if(a == b){
            return 0;
        }

        while(c!=d){
        if(c % d == 0){
            d = d*2;
            co = 1;
        }
        else{
            co = -1;
            break;
        }
        }
        return co;
        }
        static int train(int a, int []arr){

        int sumOfDistance = 0;
        //Arrays.sort(arr);
        for (int i = 0;i<arr.length;i++){

            sumOfDistance+=arr[i];
        }

        sumOfDistance = sumOfDistance + arr[arr.length-1];
        return sumOfDistance;


        }

        static void num(int a){

        int c = 5;
        int d = 5;
        int i = 3;

        while (d<=a){
            if((a - d) % i == 0){
                System.out.println("Yes");
                return;
            }
            else{
                c+=2;
                d = d+c;
                i++;
            }
        }
            System.out.println("NO");
        }

        static  void nu(int n, int[] arr){

          Arrays.sort(arr);
          int sum = 0;

          int c = 0;
          int j=1;
            for (int i = 0; i < arr.length-1; i++) {

                if(arr[i] == arr[i+1]){
                    c+=j;
                    j++;
                }
                   else {
                    sum += c;
                    c = 0;
                    j = 1;
                }
            }
            System.out.println(sum);
        }
}
public class Practice {
    public static void main(String[] args) {
        Scanner tu = new Scanner(System.in);
//        int t = tu.nextInt();
//        while (t--!=0){
//            int n = tu.nextInt();
//        int n = tu.nextInt();
//            int []a  = new int[n-1];
//            for (int i = 0; i < a.length; i++) {
//                a[i] = tu.nextInt();
//            }
//        System.out.println(local.train(n,a));
//            local.freq(a);
       // System.out.println(local.discount(5000));

//        int ans = local.equal(n,n1);
//        if(ans == 0 || ans == 1) {
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }
//        }
       // System.out.println(local.two(64));
       // System.out.println(local.sec(3));

       // local.num(46);
        int [] arr = {12,12,18,18};
        local.nu(arr.length,arr);
    }
}
