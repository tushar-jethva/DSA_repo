package ch2_recursion.SubSet_SubSequences;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberCombinations {
    public static void main(String[] args) {
        pnc("","12");
        List<String> list = new ArrayList<>();
        list = pncRet("","12");
        System.out.println(list);
        ArrayList<String> list2 = new ArrayList<>();
        pncRet2("","12",list2);
        System.out.println(list2);
        System.out.println(pncCount("","12"));

    }

    static void pnc(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' into 2 bcz they all have ascii value

        for (int i = (digit-1) * 3; i < digit * 3 ; i++) {

            char ch = (char) ('a' + i);

            pnc(p+ch,up.substring(1));

        }
    }

    static List<String> pncRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2 bcz they all have ascii value

        for (int i = (digit-1) * 3; i < digit * 3 ; i++) {

            char ch = (char) ('a' + i);

           ans.addAll(pncRet(p+ch,up.substring(1)));

        }
        return ans;
    }

    static ArrayList<String> pncRet2(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }


        int digit = up.charAt(0) - '0'; // this will convert '2' into 2 bcz they all have ascii value

        for (int i = (digit-1) * 3; i < digit * 3 ; i++) {

            char ch = (char) ('a' + i);

          pncRet2(p+ch,up.substring(1),list);

        }
        return list;
    }

    static int pncCount(String p, String up){
        if(up.isEmpty()){

            return 1;
        }

        int count = 0;
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2 bcz they all have ascii value

        for (int i = (digit-1) * 3; i < digit * 3 ; i++) {

            char ch = (char) ('a' + i);

            count = count + pncCount(p+ch,up.substring(1));

        }
        return count;
    }
}
