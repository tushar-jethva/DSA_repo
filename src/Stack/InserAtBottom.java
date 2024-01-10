package Stack;

import java.util.Stack;

public class InserAtBottom {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(1);
        stack.push(4);
        stack.push(5);
        insertBottom(stack,9);
        for (Integer integer : stack) {
            System.out.println(integer);
        }

    }

    public static void insertBottom(Stack<Integer> stack, int x){

        recursive(stack,x);
    }

    private static void recursive(Stack<Integer> stack, int x) {
        if (stack.isEmpty()){
            stack.push(x);
            return;
        }
        int saved = stack.peek();
        stack.pop();

        recursive(stack,x);
        stack.push(saved);
    }
}
