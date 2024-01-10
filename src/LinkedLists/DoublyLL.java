package LinkedLists;

import java.util.Objects;

public class DoublyLL {
    Node head;
    private  class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        if(head == null){
            head.prev = null;
            head = node;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        node.next = null;

    }

    public Node find(int val){
        Node node = head;
        while(node.next != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insert(int after, int val){
        Node p = find(after);
        if(p == null){
            System.out.println("Not exist!");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        node.prev = p;
        p.next = node;
        if(node.next != null){
            node.next.prev = node;
        }

    }

    public void insertAtIndex(int val, int index){
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        head.prev = null;
        return val;
    }

    public int deleteLast(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        int val = temp.val;
        temp = temp.prev;
        temp.next = null;
        return val;
    }

    public int deleteAtIndex(int index){
        Node temp = head;
//        if(index == 0) {
//            deleteFirst();
//        }
//        int count = 0;
//        while(temp.next != null){
//            temp = temp.next;
//            count++;
//        }
//        if(index == count){
//            deleteLast();
//        }

        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = temp.next.next;
        temp.next.prev = temp;
        return val;

    }

    public void display(){
        Node node = head;
        Node last = null;
        while (node != null){
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.print("END");
        System.out.println();
        while(last != null){
            System.out.print(last.val +"->");
            last = last.prev;
        }
        System.out.print("START");
    }

    public static void main(String[] args) {
        DoublyLL DLL = new DoublyLL();
        DLL.insertFirst(12);
        DLL.insertFirst(11);
        DLL.insertFirst(10);
        DLL.insertLast(15);
        DLL.insertLast(16);
        DLL.insertLast(17);
        DLL.insert(12,13);
        DLL.insertAtIndex(14,4);
        DLL.insertAtIndex(18,8);
        System.out.println(DLL.deleteFirst());
        System.out.println(DLL.deleteLast());
        System.out.println(DLL.deleteLast());
        System.out.println(DLL.deleteFirst());
        DLL.display();
        System.out.println(DLL.deleteAtIndex(2));
        DLL.display();
        System.out.println(DLL.deleteAtIndex(1));
        DLL.display();
        System.out.println(DLL.deleteAtIndex(0));
        DLL.display();
    }
}
