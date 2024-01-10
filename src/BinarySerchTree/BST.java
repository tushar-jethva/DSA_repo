package BinarySerchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }

        return root;
    }

    public static void inOrder(Node root){
        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+"->");
        inOrder(root.right);
    }

    public static boolean searchKey(Node root,int key){
        //here we can search key in complexity of O(H) means height of tree
        if (root == null){
            return false;
        }

        if (root.data > key){
            return searchKey(root.left,key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return searchKey(root.right,key);
        }

    }

    public static Node searchBST(Node root, int val) {
        if(root == null){
            return null;
        }
        if(root.data > val){
            return searchBST(root.left,val);
        }
        else if(root.data == val){
            return root;
        }
        else{
            return searchBST(root.right,val);
        }
    }

    public static Node delete(Node root, int val){

        if (root.data > val){
           root.left =  delete(root.left,val);
        }
        else if (root.data<val){
            root.right = delete(root.right,val);
        }
        else{
            //root value is equal to delete node
            //case 1: Leaf node
            if (root.left == null && root.right == null){
                return null;
            }

            //case 2: One child
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }

            //case 3: two child
            //take successor and then set root data as successor data and delete successor as we know successor only have either 1 or 0 child
            //so find that and delete that by case 1 and case 2
            Node successor = inorderSuccessor(root.right);
            root.data = successor.data;
            //delete successor
            root.right = delete(root.right, successor.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
        while (root.left!=null){
            root = root.left;
        }
        return root;
    }

    public static boolean isValidBST(Node root) {
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    static boolean  isValid(Node root,long min, long max){
        if(root == null){
            return true;
        }


        if(root.data >= max || root.data <= min)return false;

        return isValid(root.left,min,root.data) && isValid(root.right,root.data,max);
    }

    static void rootToLeafPath(Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }

        path.add(root.data);
        if (root.left == null && root.right == null){
            printPath(path);
        }
        else {
            rootToLeafPath(root.left, path);
            rootToLeafPath(root.right, path);
        }
        path.remove(path.size() - 1);
    }
    static void printPath(ArrayList<Integer> path){
        for (Integer integer : path) {
            System.out.print(integer+"->");
        }
        System.out.print("End");
        System.out.println();
    }

    static int i = 0;
    public int kthSmallest(Node root, int k) {

        return solve( root,  k);
    }

    int solve(Node root, int k){
        if(root == null){
            return -1;
        }

        int left = solve(root.left,k);
        if(left != -1){
            return left;
        }
        i++;

        if(i == k){
            return root.data;
        }

        return solve(root.right,k);
    }

    public static int inorderSuccessor(Node root,int x)
    {
        //add code here.
        int succ = -1;
        Node temp = root;
        while(temp.data!=x){

            if(temp.data > x){
                succ = temp.data;
                temp = temp.left;

            }
            else{
                temp = temp.right;
            }
        }

        Node right = temp.right;
        while(right!=null){
            succ = right.data;
            right = right.left;
        }
        return succ;

    }

    public static int inorderPredecessor(Node root,int x)
    {
        //add code here.
        int pred = -1;
        Node temp = root;
        while(temp.data!=x){

            if(temp.data > x){

                temp = temp.left;

            }
            else{
                pred = temp.data;
                temp = temp.right;
            }
        }

        Node left = temp.left;
        while(left!=null){
            pred = left.data;
            left = left.right;
        }
        return pred;

    }

    public Node lowestCommonAncestor(Node root, Node p, Node q) {


        while(root!=null){
            if(root.data < p.data && root.data < q.data){
                root = root.right;
            }
            else if(root.data > p.data && root.data > q.data){
                root = root.left;
            }
            else{
                return root;
            }
        }
//         if(root==null){
//             return null;
//         }

//         if(root.val < p.val && root.val < q.val){
//             return lowestCommonAncestor(root.right,p,q);
//         }

//         if(root.val > p.val && root.val > q.val){
//             return lowestCommonAncestor(root.left,p,q);
//         }

//         return root;
        return null;
    }

    static int sum;
    public static int rangeSumBST(Node root, int low, int high) {

        sum = 0;
        solve(root,low,high);
        return sum;
    }

    public static void solve(Node root, int low, int high){
        if(root == null){
            return;
        }
        if( root.data >high){
            solve(root.left,low,high);
        }
        else if(root.data < low ){
            solve(root.right,low,high);
        }
        else{
            solve(root.left,low,high);
            sum+=root.data;
            solve(root.right,low,high);
        }

    }

    public Node balanceBST(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        return inorderToBST(0,list.size()-1,list);

    }

    void inorder(Node root, ArrayList<Integer> list){

        if(root == null){
            return;
        }

        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }

    Node inorderToBST(int s, int e, ArrayList<Integer> list){

        if(s>e){
            return null;
        }

        int mid = s+(e-s)/2;
        Node newroot = new Node(list.get(mid));
        newroot.left = inorderToBST( s, mid-1,list);
        newroot.right = inorderToBST(mid+1,e,list);

        return newroot;
    }
//preorder bst
    static int index ;
    static Integer min;
    static Integer max;
    public Node bstFromPreorder(int[] preorder) {
        index = 0;
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
        return solve(preorder,min,max);
    }

    Node solve(int[] preorder,Integer min, Integer max){//i == index

        if(index>=preorder.length){
            return null;
        }
        if(preorder[index] < min || preorder[index] > max) return null;

        Node newNode = new Node(preorder[index++]);
        newNode.left = solve(preorder,min,newNode.data);
        newNode.right = solve(preorder,newNode.data,max);
        return newNode;
    }

    //     static int size;
//     public TreeNode sortedListToBST(ListNode head) {
//         size = 0;
//         ListNode temp = head;
//         while(temp!=null){
//             size++;
//             temp = temp.next;
//         }

//         return solve(0,size-1,head);
//     }

//     TreeNode solve(int s, int e,ListNode head){
//         if(s>e){
//             return null;
//         }

//         int mid = s + (e-s)/2;
//         ListNode point = get(mid,head);
//         TreeNode root = new TreeNode(point.val);
//         root.left = solve(s,mid-1,head);
//         root.right = solve(mid+1,e,head);

//         return root;
//     }

//     public ListNode get(int index,ListNode head){
//         ListNode temp = head;
//         for(int i=0;i<index;i++){
//             temp = temp.next;
//         }
//         return temp;
//     }

//    public Node sortedListToBST(ListNode head){
//        if(head == null){
//            return null;
//        }
//        return toBST(head,null);
//    }
//
//    TreeNode toBST(ListNode head,ListNode tail){
//
//        ListNode fast = head;
//        ListNode slow = head;
//
//        if(head == tail){
//            return null;
//        }
//
//        while(fast!=tail && fast.next!=tail){
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//
//        TreeNode root = new TreeNode(slow.val);
//        root.left = toBST(head,slow);
//        root.right = toBST(slow.next,tail);
//        return root;
//    }

    public List<Integer> largestValues(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }

        while(!q.isEmpty()){
            int size = q.size();
            Node curr = q.peek();
            for(int i=0;i<size;i++){
                Node peek = q.poll();

                if(peek.left != null){
                    q.add(peek.left);
                }
                if(peek.right!=null){
                    q.add(peek.right);
                }
                if(peek.data > curr.data){
                    curr = peek;
                }
            }
            list.add(curr.data);
        }
        return list;
    }

    public Node reverseOddLevels(Node root) {

        reverse(root.left, root.right,1);
        return root;
    }

    public void reverse(Node node1, Node node2, int lvl){

        if(node1 == null || node2 == null){
            return;
        }

        if(lvl % 2 == 1){
            int temp = node1.data;
            node1.data = node2.data;
            node2.data = temp;
        }

        reverse(node1.left,node2.right,lvl+1);
        reverse(node1.right,node2.left,lvl+1);
    }

    public static void main(String[] args) {
        int [] values = {5,1,3,4,2,7};
        Node root = null;

        for (int value : values) {
            root = insert(root, value);
        }

        inOrder(root);
        System.out.println();

//        if (searchKey(root,8)){
//            System.out.println("Found key!");
//        }else{
//            System.out.println("Not Found!");
//        }

       // searchBST(root,4);

//        delete(root,1);
//        inOrder(root);

        isValidBST(root);

        ArrayList<Integer> path = new ArrayList<>();
        rootToLeafPath(root,path);

        int pred = inorderPredecessor(root,5);
        System.out.println(pred);

        int suc = inorderSuccessor(root,5);
        System.out.println(suc);

        int sum = rangeSumBST(root,4,7);
        System.out.println(sum);



    }
}
