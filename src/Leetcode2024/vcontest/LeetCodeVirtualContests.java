package Leetcode2024.vcontest;

public class LeetCodeVirtualContests {
    public static void main(String[] args) {
        maximumLength("aaaabbcccccc");
    }

    public static int maximumLength(String s) {
        int length = 0;
        int tLen = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                tLen++;
            }
            else{
                length = Math.max(length,tLen);
                tLen = 1;
            }
        }
        length = Math.max(length,tLen);

        return length-2;
    }
}
