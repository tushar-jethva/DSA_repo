package Stack;

import java.util.Stack;

public class DeleteMiddle {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(9);
        stack.push(12);
        stack.push(8);
        stack.push(4);
        deleteMiddle(stack,stack.size());
    }

    public static void deleteMiddle(Stack<Integer> stack,int N){
           //n is size of stack
           //so now we call another function for recursion

        int count = 0;
        recursive(stack,N,count);;
    }

    private static void recursive(Stack<Integer> stack, int Size,int count) {
        if (count == Size/2 ){
            int a =stack.pop();
            System.out.println(a);
            return;
        }
        //we save top of the stack in function for latter we can add it in stack back
        int saveTop = stack.peek();
        stack.pop();

        recursive(stack,Size,count+=1);
        stack.push(saveTop);
    }

}
