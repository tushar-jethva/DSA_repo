package Tree.BinaryTree.BinaryTree;

import java.util.*;


public class CreationOfBinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{

        static int index = -1;
        public Node buildTree(int[] nodes){
            index++;

            if (nodes[index] == -1){
                return null;
            }
            Node root = new Node(nodes[index]);//root means not every time root it is just newNode
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);

            return root;
        }

        public void preOrderTraversal(Node root){
            if(root==null){
               return;
            }
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);

        }

        public void inOrderTraversal(Node root){
            if(root==null){
                return;
            }
            inOrderTraversal(root.left);
            System.out.print(root.data+" ");
            inOrderTraversal(root.right);

        }

        public void postOrderTraversal(Node root){
            if(root==null){
                return;
            }
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data+" ");

        }

        public void levelOrderTraversal(Node root){
            if (root==null){
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);

            while (!queue.isEmpty()){
                Node currNode = queue.remove();
                if (currNode == null){
                    System.out.println();
                    if (queue.isEmpty()){
                        break;
                    }
                    else{
                        queue.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if (currNode.left != null){
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null){
                        queue.add(currNode.right);
                    }
                }
            }
        }

        public int maxDepth(Node root){
            int count=0;
            if (root==null){
                return 0;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);

            while (!queue.isEmpty()){
                Node currNode = queue.remove();
                if (currNode == null){
                    count++;
                    System.out.println();
                    if (queue.isEmpty()){
                        break;
                    }
                    else{
                        queue.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if (currNode.left != null){
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null){
                        queue.add(currNode.right);
                    }
                }
            }
            return count;
        }

        public int countNode(Node root){

            if (root == null){
                return 0;
            }
            int leftNode = countNode(root.left);
            int rightNode = countNode(root.right);
            return leftNode+rightNode+1;
        }

        public int sumOfNode(Node root){
            if (root == null){
                return 0;
            }
            int leftNode = sumOfNode(root.left);
            int rightNode = sumOfNode(root.right);
            return leftNode+rightNode+root.data;
        }

        public static int heightOfTree(Node root){
            if (root == null){
                return 0;
            }

            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);
            int maxHeight = Math.max(leftHeight,rightHeight)+1;
            return maxHeight;
        }

        public static int diameterOfTree(Node root){
            if (root == null){
                return 0;
            }
            int diam1 = diameterOfTree(root.left);
            int diam2 = diameterOfTree(root.right);
            int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;
            return Math.max(diam3,Math.max(diam1,diam2));
        }

        static class Pair{
            int diam;
            int height;

            Pair(int diam,int height){
                this.diam = diam;
                this.height= height;
            }
        }

        public static Pair diameterOfTreeOptimized(Node root){
            if (root == null){
                return new Pair(0,0);
            }
            Pair left = diameterOfTreeOptimized(root.left);
            Pair right = diameterOfTreeOptimized(root.right);

            int myHeight = Math.max(left.height , right.height )+ 1;

            int d1 = left.diam;
            int d2 = right.diam;
            int d3 = left.height + right.height + 1;

            int myDiam = Math.max(d3,Math.max(d1,d2));
            Pair myInfo = new Pair(myDiam,myHeight);
            return myInfo;
        }

        public static int sumOfLeafNodes(Node root)
        {
            if(root == null){
                return 0;
            }

            if(root.left == null && root.right==null){
                return root.data;
            }
            int sumLeft = sumOfLeafNodes(root.left);
            int sumRight = sumOfLeafNodes(root.right);
            return sumLeft+sumRight;
        }

        int count=0;
        public int goodNodes(Node root) {

            countGoodNodes(root, Integer.MIN_VALUE);
            return count;
        }

        public void countGoodNodes(Node root, Integer preVal) {
            if(root == null){
                return;
            }

            if(root.data >= preVal){
                count++;
            }
            countGoodNodes(root.left,Math.max(root.data,preVal));
            countGoodNodes(root.right,Math.max(root.data,preVal));
        }

        public int deepestLeavesSum(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            int sum = 0;

            while(!q.isEmpty()){
                sum = 0;
                int size = q.size();
                for(int i=0;i<size;i++){
                    Node curr = q.remove();
                    sum+=curr.data;
                    if(curr.left!=null)q.add(curr.left);
                    if(curr.right!=null)q.add(curr.right);
                }
            }
            return sum;
        }

        //O(n^2) complexity bcz we find height as well
        boolean isBalanced(Node root)
        {
            // Your code here
            if(root == null){
                return true;
            }

            boolean left = isBalanced(root.left);
            boolean right = isBalanced(root.right);
            boolean height = Math.abs(heightOfTree(root.left) - heightOfTree(root.right)) <= 1;

            if(left && right && height){
                return true;
            }
            return false;
        }

        //O(n) complexity if we find height and true value of right and left
        static class PairOfBalanced{
            boolean isBalanced;
            int height;

            PairOfBalanced(boolean isBalanced,int height){
                this.isBalanced = isBalanced;
                this.height = height;
            }
        }
        PairOfBalanced isBalancedOptimized(Node root)
        {
            // Your code here
            if(root == null){
                return new PairOfBalanced(true,0);
            }

            PairOfBalanced left = isBalancedOptimized(root.left);
            PairOfBalanced right = isBalancedOptimized(root.right);

            boolean leftTrue = left.isBalanced;
            boolean rightTrue = right.isBalanced;
            boolean height = Math.abs(left.height - right.height) <= 1;

            PairOfBalanced info = new PairOfBalanced(false,Math.max(left.height, right.height)+1);
            if(leftTrue && rightTrue && height){
                info.isBalanced = true;
            }
            else{
                info.isBalanced = false;
            }
            return info;
        }

        static class sumTree{
            boolean isSum;
            int sum;
            sumTree(boolean isSum,int sum){
                this.isSum = isSum;
                this.sum = sum;
            }
        }

        sumTree sumOfNodes(Node root){
            if(root == null){
                return new sumTree(true,0);
            }
            if(root.left == null && root.right == null){
                return new sumTree(true,root.data);
            }

            sumTree left = sumOfNodes(root.left);
            sumTree right = sumOfNodes(root.right);

            boolean leftTrue = left.isSum;
            boolean rightTrue = right.isSum;

            sumTree sumTree = new sumTree(true,0);
            sumTree.sum = root.data + left.sum + right.sum;

            if (left.sum + right.sum == root.data && leftTrue && rightTrue){
                sumTree.isSum = true;
            }
            else{
                sumTree.isSum = false;
            }
            return sumTree;

        }

        public List<List<Integer>> zigzagLevelOrder(Node root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null){
                return result;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            boolean leftToRight = true;

            while(!q.isEmpty()){
                List<Integer> ans = new ArrayList<>();
                int size = q.size();
                int a[] = new int[size];
                for(int i=0;i<size;i++){
                    Node frontNode = q.peek();
                    q.remove();

                    //from right to left we store in array
                    int index = leftToRight ? i: size-i-1;
                    assert frontNode != null;
                    a[index] = frontNode.data;


                    if (frontNode.left!=null){
                        q.add(frontNode.left);
                    }
                    if (frontNode.right!=null){
                        q.add(frontNode.right);
                    }
                }
                for(int num:a){
                    ans.add(num);
                }
                result.add(ans);
                //direction change
                leftToRight = !leftToRight;
            }
            return result;
        }

        static ArrayList <Integer> verticalOrder(Node root)
        {
            Queue<PairOfVertical> q = new ArrayDeque<>();
            Map<Integer, ArrayList<Integer>> map = new TreeMap();//why treemap bcz of ordered
            //1st argument of map is horizontol distance and 2nd arguement is data of that hd

            q.add(new PairOfVertical(0,root));//0 is hd in start root at 0th hd and node for access node left and right

            while(!q.isEmpty()){
                PairOfVertical curr = q.poll();//poll() is remove and return the peek value

                if(map.containsKey(curr.hd)){
                    map.get(curr.hd).add(curr.node.data);//bcz current have two value hd and node
                    //basically we say if map already have hd then go to that key so map.get(curr.hd) then add
                    //value of curr node data
                }
                else{
                    //if map don't contain hd
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(curr.node.data);
                    map.put(curr.hd,temp); // why temp bcz map second argument taking list
                }

                if(curr.node.left != null){
                    q.add(new PairOfVertical(curr.hd - 1 , curr.node.left));
                    //why curr.hd - 1 bcz as we go left side we decrese horizontol distance
                    // -2 -1 0 1 2
                    //at first we are at 0 for left we decrese -1 and then -2 vice verssa
                }
                if(curr.node.right != null){
                    q.add(new PairOfVertical(curr.hd + 1 , curr.node.right));
                    //why curr.hd + 1 bcz as we go right side we increase horizontol distance
                    // -2 -1 0 1 2
                    //at first we are at 0 for right we increase 1 and then 2 vice verssa
                }
            }
            //after completion we have all value in map
            //now take that all value in arrayList and return it
            ArrayList<Integer> ans = new ArrayList<>();

            for(Map.Entry<Integer,ArrayList<Integer>> entry: map.entrySet()){
                ans.addAll(entry.getValue());
            }
            return ans;

        }

        static class PairOfVertical{
            int hd;//horizontol distance
            Node node;

            PairOfVertical(int hd, Node node){
                this.hd = hd;
                this.node = node;
            }
        }

        static ArrayList<Integer> topView(Node root)
        {
            // add your code
            ArrayList<Integer> ans = new ArrayList<>();
            Queue<PairOfTopView> q = new LinkedList<>();

            q.add(new PairOfTopView(0,root));
            Map<Integer,Integer> map = new TreeMap<>();//hd and node data

            while(!q.isEmpty()){
                PairOfTopView curr = q.poll();

                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node.data);
                }

                if(curr.node.left!=null){
                    q.add(new PairOfTopView(curr.hd-1,curr.node.left));
                }
                if(curr.node.right!=null){
                    q.add(new PairOfTopView(curr.hd+1,curr.node.right));
                }
            }



            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                ans.add(entry.getValue());
            }

            return ans;

        }
        static class PairOfTopView{
            int hd;
            Node node;
            PairOfTopView(int hd, Node node){
                this.hd = hd;
                this.node = node;
            }
        }

        //Function to return a list containing the bottom view of the given tree.
        static ArrayList<Integer> bottomView(Node root)
        {
            // add your code
            Map<Integer,Integer> map = new TreeMap<>();

            Queue<PairOfBottomView> q = new LinkedList<>();
            q.add(new PairOfBottomView(0,root));

            while(!q.isEmpty()){
                PairOfBottomView curr = q.poll();


                map.put(curr.hd,curr.node.data);


                if(curr.node.left!=null){
                    q.add(new PairOfBottomView(curr.hd-1,curr.node.left));
                }
                if(curr.node.right!=null){
                    q.add(new PairOfBottomView(curr.hd+1,curr.node.right));
                }

            }
            ArrayList<Integer> ans = new ArrayList<>();
            for(Map.Entry<Integer,Integer> e : map.entrySet()){
                ans.add(e.getValue());
            }
            return ans;

        }

        static class PairOfBottomView{
            int hd;
            Node node;
            PairOfBottomView(int hd, Node node){
                this.hd = hd;
                this.node= node;
            }
        }

        void solve(Node root, ArrayList<Integer> list, int level){
            if(root == null){
                return;
            }

            if(level == list.size()){
                list.add(root.data);
            }

            solve(root.left,list,level+1);
            solve(root.right,list,level+1);

        }
        //Function to return list containing elements of left view of binary tree.
        ArrayList<Integer> leftView(Node root)
        {
            // Your code here
            ArrayList<Integer> ans = new ArrayList<Integer>();
            solve(root,ans,0);
            return ans;
        }

        void solveRightView(Node node,  ArrayList<Integer> list, int level){
            if(node == null){
                return;
            }

            if(level == list.size()){
                list.add(node.data);
            }

            //when return then we are at level that we previouly have bcz it is just return form that
            //level and we are at where we are at that level before

            solveRightView(node.right,list,level+1);
            solveRightView(node.left,list,level+1);
        }
        //Function to return list containing elements of right view of binary tree.
        ArrayList<Integer> rightView(Node node) {
            //add code here.
            ArrayList<Integer> ans = new  ArrayList<Integer>();
            solveRightView(node,ans,0);
            return ans;
        }

        public ArrayList <Integer> diagonal(Node root)
        {
            Queue<PairOfDiagonal> q = new LinkedList<>();
            Map<Integer, ArrayList<Integer>> map = new TreeMap();//why treemap bcz of ordered
            //1st argument of map is horizontol distance and 2nd arguement is data of that hd

            q.add(new PairOfDiagonal(0,root));//0 is hd in start root at 0th hd and node for access node left and right

            while(!q.isEmpty()){
                PairOfDiagonal curr = q.poll();//poll() is remove and return the peek value

                while(curr.node!=null){
                    //while curr.node != null means jya sudhi right na element print no thai jay tya sudhi
                    //badha print karo pachi j left na print karo
                    if(map.containsKey(curr.hd)){
                        map.get(curr.hd).add(curr.node.data);//bcz current have two value hd and node
                        //basically we say if map already have hd then go to that key so map.get(curr.hd) then add
                        //value of curr node data
                    }
                    else{
                        //if map don't contain hd
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(curr.node.data);
                        map.put(curr.hd,temp); // why temp bcz map second argument taking list
                    }


                    if(curr.node.left != null){
                        q.add(new PairOfDiagonal(curr.hd+1 , curr.node.left));
                        //why curr.hd - 1 bcz as we go left side we decrese horizontol distance
                        // -2 -1 0 1 2
                        //at first we are at 0 for left we decrese -1 and then -2 vice verssa
                    }
                    curr.node = curr.node.right;
                }
            }
            //after completion we have all value in map
            //now take that all value in arrayList and return it


            ArrayList<Integer> ans = new ArrayList<>();

            for(Map.Entry<Integer,ArrayList<Integer>> entry: map.entrySet()){


                ans.addAll(entry.getValue());
            }
            return ans;

        }

        static class PairOfDiagonal{
            int hd;//horizontol distance
            Node node;

            PairOfDiagonal(int hd, Node node){
                this.hd = hd;
                this.node = node;
            }
        }

        public Node lowestCommonAncestor(Node root, Node p, Node q) {

            if(root == null){
                return null;
            }

            if(root.data == p.data || root.data == q.data){
                return root;
            }

            Node leftAns = lowestCommonAncestor(root.left,p,q);
            Node rightAns = lowestCommonAncestor(root.right,p,q);

            if(leftAns != null && rightAns != null){
                return root;
            }
            else if(leftAns!=null && rightAns == null){
                return leftAns;
            }
            else if(leftAns == null && rightAns != null){
                return rightAns;
            }
            else{
                return null;
            }

        }

        void solve(Node root, int k, int count,   ArrayList<Integer> list ){


            if(root == null){
                return;
            }

            list.add(root.data);
            solve(root.left,k,count,list);
            solve(root.right,k,count,list);

            int size = list.size();
            int sum = 0;
            for(int i=size - 1; i>=0;i--){
                sum+=list.get(i);
                if(sum==k){
                    count++;
                }

            }
            list.remove(size-1);

        }

        public int sumK(Node root,int k)
        {
            // code here
            int count = 0;
            ArrayList<Integer> list = new ArrayList<>();
            solve(root, k ,count,list);
            return count;
        }


        static int indexOfPreOrder = 0;
        public Node buildTree(int[] preorder, int[] inorder) {
            Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();

            for(int i = 0; i < inorder.length; i++) {
                inMap.put(inorder[i], i);
            }
            indexOfPreOrder = 0;
            return solve(preorder,inorder,0,inorder.length,inMap);
        }

        Node solve(int[] pre, int[] in, int start, int end,Map<Integer,Integer> inMap){
            if(start>end || indexOfPreOrder>=in.length){
                return null;
            }

            int element = pre[indexOfPreOrder++];
            Node root = new Node(element);
            int position = inMap.get(element);

            //recursive calls

            root.left = solve(pre,in,start,position-1,inMap);
            root.right = solve(pre,in,position+1,end,inMap);
            return root;


        }

        private int indexOfPostOrder = 0;
        public Node buildTreeOfPostOrder(int[] inorder, int[] postorder) {
            Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();

            for(int i = 0; i < inorder.length; i++) {
                inMap.put(inorder[i], i);
            }
            indexOfPostOrder = postorder.length-1;
            return solve2(inorder,postorder,0,inorder.length-1,inMap);
        }


        Node solve2(int[] in, int[] post, int start, int end,Map<Integer,Integer> inMap){
            if(start>end||indexOfPostOrder<0) return null;

            int element = post[indexOfPostOrder--];
            Node root = new Node(element);
            int position = inMap.get(element);

            //recursive calls


            root.right = solve2(in,post,position+1,end,inMap);
            root.left = solve2(in,post,start,position-1,inMap);


            return root;


        }

        public static int minTime(Node root, int target)
        {
            HashMap<Node,Node> m=new HashMap<>();
            Node tar=getAddressOfTargetNode(root,m,target);
            int ans=timeToBurn(tar,m);
            return ans;
        }
        private static Node getAddressOfTargetNode(Node root,HashMap<Node,Node> m,int tar){
            Queue<Node> q=new LinkedList<>();
            q.offer(root);
            Node res=new Node(-1);
            while(!q.isEmpty()){
                Node curr=q.poll();
                if(curr.data==tar) res=curr;
                if(curr.left!=null){
                    m.put(curr.left,curr);
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    m.put(curr.right,curr);
                    q.offer(curr.right);
                }
            }
            return res;
        }
        private static int timeToBurn(Node tar,HashMap<Node,Node> m){
            Queue<Node> q=new LinkedList<>();
            q.offer(tar);
            Map<Node,Integer> visit=new HashMap<>();
            visit.put(tar,1);
            int maxi=0;


            while(!q.isEmpty()){
                int size=q.size();
                boolean flag=false;
                for(int i=0;i<size;i++){
                    Node curr=q.poll();
                    if(curr.left!=null && visit.get(curr.left)==null){
                        flag=true;
                        visit.put(curr.left,1);
                        q.offer(curr.left);
                    }
                    if(curr.right!=null && visit.get(curr.right)==null){
                        flag=true;
                        visit.put(curr.right,1);
                        q.offer(curr.right);
                    }
                    if(m.get(curr)!=null && visit.get(m.get(curr))==null){
                        flag=true;
                        visit.put(m.get(curr),1);
                        q.offer(m.get(curr));
                    }
                }
                if(flag) maxi++;
            }
            return maxi;
        }

        public static void flatten(Node root)
        {
            //code here

            Node curr = root;
            while(curr!=null){

                if(curr.left!=null){
                    Node pred = curr.left;
                    while(pred.right!=null)
                        pred = pred.right;

                    pred.right = curr.right;
                    curr.right = curr.left;
                    curr.left = null; // why null because now there is no need of it and this is given in question also so

                }
                else{
                    curr = curr.right;
                }
            }
        }

//        public Node connect(Node root) {
//
//            Node curr = root;
//
//            while(curr!=null && curr.left!=null){
//
//                Node n = curr;
//
//                while(true){
//
//                    n.left.next = n.right;
//                    if(n.next==null)break;
//                    n.right.next = n.next.left;
//                    n = n.next;
//                }
//                curr = curr.left;
//            }
//            return root;
//        }



    }




    public static void main(String[] args) {

        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree(nodes);
        //System.out.println("Data of root:"+root.data);
//        System.out.print("PreOrderTraversal: ");
//        binaryTree.preOrderTraversal(root);
//        System.out.println();
//        System.out.print("InOrderTraversal: ");
//        binaryTree.inOrderTraversal(root);
//        System.out.println();
//        System.out.print("PostOrderTraversal: ");
//        binaryTree.postOrderTraversal(root);
//        System.out.println();
//        System.out.println("LevelOrderTraversal: ");
//        binaryTree.levelOrderTraversal(root);
//        System.out.println(binaryTree.maxDepth(root));
        System.out.println(binaryTree.countNode(root));
        System.out.println(binaryTree.sumOfNode(root));
        System.out.println(binaryTree.heightOfTree(root));
        System.out.println(BinaryTree.diameterOfTree(root));
        System.out.println(BinaryTree.sumOfLeafNodes(root));
        System.out.println(binaryTree.goodNodes(root));
        System.out.println(binaryTree.deepestLeavesSum(root));
        System.out.println(BinaryTree.diameterOfTreeOptimized(root).height);
        System.out.println(binaryTree.isBalancedOptimized(root).isBalanced);
        System.out.println(binaryTree.zigzagLevelOrder(root));
        System.out.println(binaryTree.leftView(root));
        System.out.println(binaryTree.rightView(root));
        System.out.println(binaryTree.sumK(root,4));
        System.out.println(BinaryTree.minTime(root,4));
    }

}
