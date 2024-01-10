package LinkedLists;

public class SinglyLL {

    private Node head;
    private Node tail;
    private int size;

    SinglyLL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size+=1;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
        }

        Node temp = head;
        for(int i=1;i<index;i++){
            temp =temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head == null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){

        if(size <= 1){
            deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }

        if(index == size - 1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }

    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public void removeDuplicates(){
       Node node = head;
        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    private class Node{

        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SinglyLL sll = new SinglyLL();
//        sll.insertFirst(4);
//        sll.insertFirst(3);
//        sll.insertFirst(2);
//        sll.insertFirst(1);
//        sll.insertLast(5);
//        sll.insert(44,4);
//        System.out.println(sll.size);
//        sll.display();
//        System.out.println();
//        System.out.println(sll.deleteFirst());
//        System.out.println(sll.deleteLast());
//        System.out.println(sll.delete(2));

        sll.insertFirst(1);
        sll.insertFirst(1);
        sll.insertFirst(2);
        sll.insertFirst(3);
        sll.insertFirst(3);
        sll.insertFirst(4);
        sll.display();
        sll.removeDuplicates();
        sll.display();

    }
}
