package Stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("Tushar");
    }

    public static void reverseString(String a){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            stack.push(ch);
        }
        for (int i = 0; i < a.length(); i++) {
            System.out.println(stack.pop());
        }
    }

}
