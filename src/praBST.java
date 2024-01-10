public class praBST {

    public static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        TreeNode ans = bstFromPreorder(preorder);

    }

    static int index = 0;
    public static TreeNode bstFromPreorder(int[] preorder) {
        index = 0;
        TreeNode ans = helper(preorder,0,preorder.length-1);
        return ans;
    }

    public static TreeNode helper(int[] pre,int s,int e){
        if(s==e){
            return  new TreeNode(pre[index++]);
        }
        if(s>e){
            return null;
        }

        int currIndex = index;
        int maxIndex = currIndex;
        for(int i=s;i<=e;i++){
            if(pre[i]>pre[index]){
                maxIndex = i;
                break;
            }
        }

        TreeNode root = new TreeNode(pre[index++]);
        root.left = helper(pre,currIndex+1,maxIndex-1);
        root.right = helper(pre,maxIndex,e);

        return root;
    }
}
 class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
