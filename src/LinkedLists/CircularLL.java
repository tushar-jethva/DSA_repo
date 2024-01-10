package LinkedLists;

public class CircularLL {

    private Node head;
    private Node tail;

    CircularLL(){
        this.head = null;
        this.tail = null;
    }
    private class Node{
        int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }

        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);
    }
    public void display(){

        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.val + "->");
                temp = temp.next;
            }while(temp != head);
        }

//        while(temp.next != head){
//            System.out.println(temp.val+"->");
//            temp = temp.next;
//        }
        System.out.print("HEAD");
    }

    public static void main(String[] args) {
        CircularLL CLL = new CircularLL();
        CLL.insertFirst(10);
        CLL.insertFirst(20);
        CLL.insertFirst(30);
        CLL.delete(20);
        CLL.delete(10);
        CLL.delete(30);
        CLL.display();
    }
}
