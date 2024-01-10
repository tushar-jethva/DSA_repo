package ch2_recursion;
public class TowerOfHanoi {
    public static void TOH(int n, String a, String b, String c){
        //If only 1 disk than make move and return
        if(n==1){
            System.out.println("Move disk 1 from "+a+" to "+c);
            return;
        }

        //Move top n-1 disk A to B, using c as auxiliary
        TOH(n-1,a,c,b);

        //Move remaining disks from A to C
        System.out.println("Move "+n+" disk from "+a+" to "+c);

        //Move n-1 disk from B to C, using A as auxiliary
        TOH(n-1,b,a,c);
    }

    public static void main(String[] args) {
        TOH(2,"a","b","c");
    }
}