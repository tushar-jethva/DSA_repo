package PracticeProblems;
import OOPs.Parent;

import java.util.Scanner;

public class Newton extends Parent {
    static int a = 10;
    public static void main (String[] args) {
        // Your code here
//        Scanner sc = new Scanner(System.in);
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        fun(c,d);
        Parent p = new Parent();
        System.out.println(p.animal);
        p.msg();

        Newton n = new Newton();
        System.out.println(n.bonus);
        n.msg3();

        System.out.println(a);
        A  a = new A();
        a.fun(2,3);

    }


    public static void fun(int c, int d){
        int pow = (int)Math.pow(3,d);
        System.out.println(c*pow);
    }
}

class A extends Parent{
    public void fun(int c, int d) {
        System.out.println("A "+Newton.a);
    }
}


