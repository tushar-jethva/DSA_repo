package ch2_recursion.BackTracking;

public class Permutation {
    public static void printPermutation(String str,String perm,int index){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr,perm+currChar,index+1);

        }

    }
    public static void main(String[] args) {
        printPermutation("ABC","",0);
    }
}
