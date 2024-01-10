package Question_6.B.LinkedList;


import LinkedLists.SinglyLL;

import java.util.HashSet;

class MyHashSet {
    int val;
    MyHashSet next;
    MyHashSet head;
    public MyHashSet() {

    }
    public MyHashSet(int val) {
        this.val = val;
    }
    public MyHashSet(int val, MyHashSet next){
        this.val = val;
        this.next = next;
    }

    public void add(int key) {
        MyHashSet node = new MyHashSet(key);
        if(head == null){
            head = node;
            head.next = null;
        }
        else{


            MyHashSet temp = head;
            if (!contains(key)){
                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next = node;
                temp = node;
                temp.next = null;
            }
        }
    }

    public void remove(int key) {
        MyHashSet temp = head;

        if (head!=null){
            if (head.val == key){
                head = head.next;
            }}

        if (temp!=null){
        if (temp.next!=null){
            while (temp.next != null) {
                if (temp.next.val == key) {
                    if (temp.next.next != null)
                        temp.next = temp.next.next;
                    else{
                        temp.next = null;
                    }
                }
                if (temp.next !=null)
                    temp = temp.next;
            }}}


    }


    public boolean contains(int key) {

        MyHashSet temp = head;
        while(temp != null){
            if(temp.val == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

     public void display(){
         MyHashSet temp = head;
         while(temp!=null){
             System.out.print(temp.val+"->");
             temp = temp.next;
         }
         System.out.print("END");
     }
    public MyHashSet removeElements(int val) {

        MyHashSet sentinel = new MyHashSet(0,head);
        MyHashSet dummy = sentinel;

        MyHashSet temp = head;
        if(temp!=null){
            if(temp.val == val){
                dummy.next = temp.next;
                temp = dummy.next;
            }
            else{
            dummy = dummy.next;
            temp = temp.next;
            }
        }

        return sentinel.next;
    }
}

public class q705 {
    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(1);
        set.add(2);
        set.add(6);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.display();

        System.out.println(set.contains(1));
        System.out.println(set.contains(2));
        System.out.println(set.contains(3));

        set.display();
    }
}
