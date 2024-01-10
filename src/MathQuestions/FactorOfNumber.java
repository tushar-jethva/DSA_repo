package MathQuestions;

import java.util.ArrayList;

public class FactorOfNumber {
    public static void main(String[] args) {
        factors3(36);
    }

    //complexity = O(n)
    static void factors1(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }

    //complexity = O(sqrt(n))
    static void factors2(int n){

        for (int i = 1; i <=Math.sqrt(n); i++) {

            if(n % i ==0){

                //why bcz assume x = 36 than 36/6 = 6 but if we don't put condition of n/i == i than
                //it print 6 and 36/6=6 means two times it will print so we want that it print it only onw time
                if(n/i == i){
                    System.out.println(i);
                }
                else {
                    System.out.println(i+" "+n/i);
                }
            }
        }
        //here whatever answer we get that will not in sorted order so what should we do
        //ex.n = 20 than it gives 1 and 20, 2 and 10, 4 and 5
        //means smaller than largest again smaller and largest vice versa
        //so what we do that we store this largest number = n/i in somewhere else
    }


    static void factors3(int n){

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n); i++) {

            if(n % i ==0){

                //why bcz assume x = 36 than 36/6 = 6 but if we don't put condition of n/i == i than
                //it print 6 and 36/6=6 means two times it will print so we want that it print it only onw time
                if(n/i == i){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >=0 ; i--) {
            System.out.print(list.get(i)+" ");
        }

    }

}
