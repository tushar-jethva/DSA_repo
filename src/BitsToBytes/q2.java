package BitsToBytes;

import java.util.ArrayList;
import java.util.Locale;

public class q2 {
    public static void main(String[] args) {
      find("firstlastinfirstoutfirst","FIRST");
    }
    public static void  find(String a, String b){

        a = a.toUpperCase(Locale.ROOT);
        b = b.toUpperCase(Locale.ROOT);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= a.length()-b.length(); i++) {
          if (a.startsWith(b, i)){
                list.add(i+1);
                i+=b.length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }


    }
}
