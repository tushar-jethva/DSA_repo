package Stack;

import java.util.Stack;

class Solution
{
    boolean  isKnows(int a, int b,int m[][]){
        if(m[a][b] == 1){
            return true;
        }
        return false;
    }
    //Function to find if there is a celebrity in the party or not.
    int  celebrity(int M[][], int n)
    {
        // code here
        //step1 put all elements in stack
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<n;i++){
            stack.push(i);
        }

        //step 2 get two elements check which knows which until size!=1

        while(stack.size() > 1){
            int a = stack.peek();
            stack.pop();

            int b = stack.peek();
            stack.pop();

            if(isKnows(a,b,M)){
                stack.push(b);//a knows b so push b
            }
            else{
                stack.push(a);//b knows a so push a
            }
        }

        int candidateCelebrity = stack.peek();//only one element left in stack
        //now third step cross verification is row == 0 and col == 1 except diagonal

        boolean isRow = false;
        int countZero = 0;

        for(int i=0;i<n;i++){
            if(M[candidateCelebrity][i] == 0){
                countZero++;
            }
        }

        if(countZero == n){
            isRow = true;
        }

        boolean isCol =  false;
        int countOnes = 0;

        for(int i=0;i<n;i++){
            if(M[i][candidateCelebrity] == 1){
                countOnes++;
            }
        }

        if(countOnes == n-1){
            isCol = true;
        }

        if(isCol && isRow){
            return candidateCelebrity;
        }
        else{
            return -1;
        }

    }
}
public class FindCelebrity {
    public static void main(String[] args) {
       int N = 3;
        int M[][] = {{0, 1, 0},
            {0, 0, 0},
            {0, 1, 0}};
        Solution solution = new Solution();

        System.out.println("Celebrity is: "+solution.celebrity(M,N));
    }
}
