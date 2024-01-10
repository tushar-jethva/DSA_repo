package Queue;

class Queue{
    public int[] data;
    int end = 0;
    private static final int DEFAULT_SIZE = 10;
    public Queue(){
        this(DEFAULT_SIZE);
    }

    public Queue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull(data)){
            System.out.println("Queue is full");
        }
        data[end++] = item;
        return true;
    }

    public int remove(){
        if(isEmpty(data)){
            System.out.println("It is empty!");
        }

        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+"->");
        }
        System.out.println("End");
    }

    public boolean isFull(int[] data) {
        return end == data.length;
    }
    public boolean isEmpty(int[] data){
        return end == 0;
    }
}
public class CustomQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.remove();
        queue.display();
    }
}
