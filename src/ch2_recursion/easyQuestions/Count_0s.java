package ch2_recursion.easyQuestions;

public class Count_0s {
    public static void main(String[] args) {
        int ans = count0s(3020300,0);
        System.out.println(ans);
    }

    public static int count0s(int n, int count){

        if(n==0){
            return count;
        }
        if(n%10 == 0){
            return count0s(n/10,++count);
        }
        else{
            return count0s(n/10,count);
        }


    }
}
