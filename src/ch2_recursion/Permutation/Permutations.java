package ch2_recursion.Permutation;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        String b = "abc";
        per("",b);
        ArrayList<String> list  = perList("",b);
        System.out.println(list);
        perCount("",b);
        System.out.println(perCount("",b));
    }


    public static void per(String p, String up){

        int count = 0;
        if(up.isEmpty()){
            System.out.println(p);
            return;

        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            per( first+ch+second,up.substring(1));
        }

    }

    public static ArrayList<String> perList(String p, String up){

        int count = 0;
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }


        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            ans.addAll(perList(first+ch+second,up.substring(1)));
        }

        return ans;
    }

    public static int perCount(String p, String up){


        if(up.isEmpty()){
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            count  = count + perCount( first+ch+second,up.substring(1));
        }
        return count;
    }
}
