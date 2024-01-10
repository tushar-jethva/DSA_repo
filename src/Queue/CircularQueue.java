package Queue;

class CQueue{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;


    public CQueue(){
        this(DEFAULT_SIZE);
    }
    public CQueue(int size){
        this.data = new int[size];
    }

    int size = 0;
    int front = 0;
    int end = 0;

    public boolean insert(int item){
        if(isFull(data)){
            System.out.println("Queue is full!");
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove(){
        if(isEmpty(data)){
            System.out.println("Queue is empty!");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public boolean isFull(int[] data){
        return size == data.length;
    }
    public boolean isEmpty(int[] data){
        return size == 0;
    }

    public void display(){
        int i = front;

        do{
            System.out.print(data[i]+"->");
            i++;
            i %= data.length;
        }while (i!=end);
        System.out.println("End");
    }
}
public class CircularQueue {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.insert(10);
        cQueue.insert(20);
        cQueue.insert(30);
        cQueue.insert(40);
        cQueue.insert(50);

        System.out.println(cQueue.remove());
        System.out.println(cQueue.remove());


        cQueue.display();
    }
}
