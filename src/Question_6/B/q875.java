package Question_6.B;

import java.util.Arrays;
import java.util.OptionalInt;

public class q875 {
    public static void main(String[] args) {
        int[] pile = {3,6,7,11};
minEatingSpeed(pile,8);
        System.out.println(minEatingSpeed(pile,8));
    }
    public static int minEatingSpeed(int[] piles, int h) {

        int s = 1;

        int maxEnd = -1;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i]>maxEnd){
                maxEnd = piles[i];
            }
        }
        int e = maxEnd;
        int k=maxEnd;

        while (s<=e){
            int mid = s+(e-s)/2;
            int hours = 0;

            for (int i = 0; i < piles.length; i++) {
                hours += Math.ceil((double) piles[i]/mid);
            }
            if (hours <= h){
                k = Math.min(mid,k);
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return k;
    }
}
