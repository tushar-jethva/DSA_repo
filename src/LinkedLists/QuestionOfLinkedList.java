package LinkedLists;

import java.util.LinkedList;

public class QuestionOfLinkedList {
    private Node head;
    private Node tail;
    private int size;

    QuestionOfLinkedList(){
        this.size = 0;
    }
    private class Node{
        int val;
        Node next;


        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            insert(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +"->");
            temp = temp.next;
        }
        System.out.println("End");
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

    public void deleteAllDuplicate(){

        Node node = head;

        Node sentinal = new Node(0,head);
        Node pred = sentinal;

        while(node != null){
            if(node.next != null && node.val == node.next.val){
                while(node.next != null && node.val == node.next.val){
                    node = node.next;
                }
                pred.next = node.next;
            }
            else{
                pred = pred.next;
            }
            node = node.next;
        }

        Node temp = sentinal;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp= temp.next;
        }
        System.out.println("End");
    }

//    public Node sort(Node head){
//        while(head == null && head.next == null){
//            return head;
//        }
//
//        Node mid = getMid(head);
//        Node left = sort(head);
//        Node right = sort(mid);
//
//        return QuestionOfLinkedList(left,right);
//    }

    public static QuestionOfLinkedList merge(QuestionOfLinkedList first, QuestionOfLinkedList second)
    {
        Node f = first.head;
        Node s = second.head;
        QuestionOfLinkedList ans = new QuestionOfLinkedList();
        while(f!= null && s!=null){
            if(f.val < s.val){
                ans.insertLast(f.val);
                f = f.next;
            }
            else{
                ans.insertLast(s.val);
                s = s.next;
            }
        }

        while(f!=null){
            ans.insertLast(f.val);
            f = f.next;
        }
        while(s!=null){
            ans.insertLast(s.val);
            s = s.next;
        }

        return ans;
    }

    public Node mergeTwoLists(Node l1, Node l2) {

        Node dummyHead = new Node(0);
        Node tail = dummyHead;

        while(l1 != null && l2!= null){
            if(l1.val < l2.val){
                tail.next = l1;
                l1 = l1.next;
                tail = tail.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
                tail = tail.next;
            }
        }

//         while(l1 != null){
//             tail.next = l1;
//             tail = tail.next;
//         }

//         while(l2 != null){
//             tail.next = l2;
//             tail = tail.next;
//         }

        tail.next = (l1 != null) ? l1 : l2;
        return dummyHead.next;
    }

    Node getMid(Node head){
        Node s = head;
        Node f = head;
        while(f != null && f.next != null){

            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    //reverse a linked list by recursion
    public void reverse(Node node){
        if(node == null){
            head = tail;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;

    }

    //reverse a linked list by iterative solution
    public Node reverseLinkedList(Node node){
        if(size < 2){
            return node;
        }

        Node previous = null;
        Node present = head;
        Node next = present.next;

        while(present != null){
            present.next = previous;
            previous = present;
            present = next;
            if(next != null){
            next = next.next;}
        }
        head = previous;
        return node;
    }

    public Node reverseLinkedListFromNode(Node node,int left,int right){

        Node current = head;
        Node prev = null;

        for (int i = 0; current != null && i < left - 1; i++) {

            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newNode = current;
        Node next = current.next;

        for (int i = 0;current != null && i < (right - left) + 1 ; i++) {

            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }

        if(last != null){
            last.next = prev;
        }
        else{
            head = prev;
        }

        newNode.next = current;
        return head;
    }

    public Node reverseKGroupLinkedList(Node head, int k){

        Node current = head;
        Node prev = null;


        int length = 1;
        Node lastlength = head;
        while(lastlength.next != null){
            lastlength = lastlength.next;
            length++;
        }

while(true) {
    Node last = prev;
    Node newNode = current;
    Node next = current.next;

    for (int i = 0; current != null && i < length / k; i++) {

        current.next = prev;
        prev = current;
        current = next;
        if (next != null) {
            next = next.next;
        }
    }

    if (last != null) {
        last.next = prev;
    } else {
        head = prev;
    }

    newNode.next = current;
    prev = newNode;
    if(current == null){
        break;
    }
}
        return head;
    }

    //palindrome or not a linked list
    public boolean palindrome(Node node){

        Node mid = getMid(node);
        Node headofSecond = reverseLinkedList(mid);
        Node reReverse = headofSecond;

        while(node != null && headofSecond != null){
            if(node.val != headofSecond.val){
                break;
            }
            node = node.next;
            headofSecond = headofSecond.next;
        }

        reverseLinkedList(reReverse);

        if(head == null || headofSecond == null){
            return true;
        }

        return false;
    }

    //Reorder a  linked list
    public void reorder(Node head){

        if(head == null || head.next == null){
            return;
        }
        Node mid = getMid(head);
        Node secondHead = reverseLinkedList(mid);
        Node firstHead  = head;

        while(firstHead != null && secondHead != null){
            Node temp = firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp;
            Node temp2 = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp2;
        }

        //set to the next of tail is null
        if(firstHead != null){
            firstHead.next = null;
        }
    }

    //Rotate the linked list my solution
    public Node rotateRight(Node head, int k) {
        if(k<1 || head == null || head.next == null){
            return head;
        }

        int l=1;
        Node last = head;
        while(last.next != null){
            last = last.next;
            l++;
        }
        for(int i=0;i<k % l ;i++){
            Node prev = null;
            Node current = head;
            Node next = current.next;
            Node temp = head;
            while(current.next != null){
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }
            }

            head = current;
            head.next = temp;
            prev.next = null;

        }

        return head;
    }

    //Rotate linked list by kunal's solution
    public Node rotateLinkedListByKunal(Node head, int k) {
        if(k<=0 || head == null || head.next == null){
            return head;
        }

        Node last = head;
        int length = 1;
        while(last.next != null){
            last = last.next;
            length++;
        }

        last.next = head;
        int rotation = k % length;
        int skip = length - rotation;
        Node newLast = head;

        for(int i=0;i<skip - 1;i++){
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }

//For leet code use purposes
//    public ListNode getMid(ListNode head){
//        ListNode s = head;
//        ListNode f = head;
//        while(f != null && f.next != null){
//
//            s = s.next;
//            f = f.next.next;
//        }
//        return s;
//    }
//
//
//    public ListNode reverseLinkedList(ListNode node){
//
//        if(node == null){
//            return node;
//        }
//        ListNode previous = null;
//        ListNode present = node;
//        ListNode next = present.next;
//
//        while(present != null){
//            present.next = previous;
//            previous = present;
//            present = next;
//            if(next != null){
//                next = next.next;}
//        }
//        node = previous;
//        return node;
//    }

    public static void main(String[] args){
//        QuestionOfLinkedList dd = new QuestionOfLinkedList();
//        dd.insert(1);
//        dd.insert(1);
//        dd.insert(2);
//        dd.insert(3);
//        dd.insert(3);
//        dd.insert(4);
//        dd.insert(4);
////      dd.insert(4);
////      dd.insert(5);
//        dd.display();
//        dd.deleteAllDuplicate();
//        dd.display();

        QuestionOfLinkedList first = new QuestionOfLinkedList();
        first.insert(9);
        first.insert(4);
        first.insert(3);
        first.insert(1);

        QuestionOfLinkedList second = new QuestionOfLinkedList();
        second.insert(10);
        second.insert(8);
        second.insert(7);
        second.insert(2);

      QuestionOfLinkedList ans =   QuestionOfLinkedList.merge(first,second);
      ans.display();
    }
}
