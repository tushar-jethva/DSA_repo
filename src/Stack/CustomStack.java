package Stack;

class StackIsCustom{
    int[] data;
    private static final int DEFAULT_SIZE = 10;
    int top = -1;

    public StackIsCustom(){
        this(DEFAULT_SIZE);
    }

    public StackIsCustom(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        //what if array is already full
        if(isFull(data)){
            System.out.println("Stack is full!");
            return false;
        }
        top++;
        data[top] = item;
        return true;
    }

    public int pop() throws CustomStackException{
        if (isEmpty(data)){
            throw new CustomStackException("Stack is empty!");
        }
        int item = data[top];
        top--;
        return item;
    }

    public int peek() throws CustomStackException{
        if (isEmpty(data)){
            throw new CustomStackException("Stack is empty!");
        }
        return data[top];
    }

    public boolean isFull(int[] data) {
        return top == data.length - 1;
    }
    public boolean isEmpty(int[] data){
        return top == -1;
    }

}
public class CustomStack {

    public static void main(String[] args) throws CustomStackException{

        DynamicStack stack = new DynamicStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
