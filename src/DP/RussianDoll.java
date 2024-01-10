package DP;

import java.util.Arrays;

public class RussianDoll {
    public static void main(String[] args) {
        int[][] envelopes = {
                {5,4},
                {6,7},
                {6,4},
                {2,3},
        };
        maxEnvelopes(envelopes);
    }

    public static int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(a,b) -> Double.compare(a[0],b[0]));

        for (int i = 0; i < envelopes.length; i++) {
            for (int j = 0; j < envelopes[0].length; j++) {
                System.out.print(envelopes[i][j]+" ");
            }
            System.out.println();
        }
        int[][] dp = new int[envelopes.length][envelopes.length+1];
        for (int[] row:dp){
            Arrays.fill(row,-1);
        }
        System.out.println(usingTopDownApproach(envelopes,0,-1,dp));
        return usingTopDownApproach(envelopes,0,-1,dp);

//        System.out.println(usingRecursion(envelopes,0,-1));
//        return usingRecursion(envelopes,0,-1);

    }

    public static int usingRecursion(int[][] envelopes,int curr,int prev){

        if(curr>=envelopes.length){
            return 0;
        }

        int include = 0;
        if(prev==-1 || ((envelopes[curr][0] > envelopes[prev][0]) && (envelopes[curr][1] > envelopes[prev][1]))){
            include = 1 + usingRecursion(envelopes,curr+1,curr);
        }

        int exclude = usingRecursion(envelopes, curr + 1, prev);
        int ans = Math.max(include,exclude);

        return ans;
    }

    //prev+1 bcz we send prev=-1 so by prev+1 we can make it prev = 0; valid index we can make
    public static int usingTopDownApproach(int[][] envelopes,int curr,int prev,int[][] dp){
        if(curr>=envelopes.length){
            return 0;
        }

        if(dp[curr][prev+1]!=-1){
            return dp[curr][prev+1];
        }

        int include = 0;
        if(prev==-1 || ((envelopes[curr][0] > envelopes[prev][0]) && (envelopes[curr][1] > envelopes[prev][1]))){
            include = 1 + usingTopDownApproach(envelopes,curr+1,curr,dp);
        }

        int exclude = usingTopDownApproach(envelopes, curr + 1, prev,dp);
        dp[curr][prev+1] = Math.max(include,exclude);

        return dp[curr][prev+1];
    }
}
