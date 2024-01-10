package Question_6.B.LinkedList;

import LinkedLists.SinglyLL;
import org.w3c.dom.Node;

 class ListNode {
     private static ListNode head;
     int val;

      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     public static void insertFirst(int val){
         ListNode node = new ListNode(val);
         node.next = head;
         head = node;
     }


  }
public class q1290 {
    public static void main(String[] args) {
        String s = "100100111000000";
        System.out.println(s.length());
        System.out.println(getDecimalValue(s));
    }


    public static int getDecimalValue(String s) {

        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1'){
                ans+=(int)Math.pow(2,s.length()-(i+1));

            }
        }
        return ans;
    }
}
