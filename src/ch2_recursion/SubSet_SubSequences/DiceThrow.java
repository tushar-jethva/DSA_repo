package ch2_recursion.SubSet_SubSequences;

import java.util.ArrayList;

public class DiceThrow {
    public static void main(String[] args) {
        dice("",4);
        ArrayList<String> ans = new ArrayList<>();
        ans = diceRet("",4);
        System.out.println(ans);
        diceFace("",7,8);
    }

    static void dice(String p, int target){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6  && i<=target; i++) {

            dice(p+i,target-i);
        }
    }

    static void diceFace(String p, int target, int face){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face  && i<=target; i++) {

            diceFace(p+i,target-i,face);
        }
    }

    static ArrayList<String> diceRet(String p, int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6  && i<=target; i++) {

            ans.addAll(diceRet(p+i,target-i));
        }
        return ans;
    }
}
