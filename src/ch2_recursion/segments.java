package ch2_recursion;

public class segments {
    public static void main(String[] args) {
        int ans = maximum_segments(7,5,2,2);
        if(ans<0){
            System.out.println(1);
        }
        else {
            System.out.println(ans);
        }
    }

    public static int maximum_segments(int n, int x, int y, int z){
        if(n==0){
            return 0;
        }
        if(n<0){
            return Integer.MIN_VALUE;
        }


            int a1=0;
                 a1 = maximum_segments(n-x,x,y,z)+1;

             int a2= 0;
        a2 = maximum_segments(n-y,x,y,z)+1;


        int a3=0;
        a3 = maximum_segments(n-z,x,y,z)+1;


        int ans = Math.max(a1,Math.max(a2,a3));
        return ans;
    }
}
