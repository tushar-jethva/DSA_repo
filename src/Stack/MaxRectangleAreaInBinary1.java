package Stack;

import java.util.Stack;

public class MaxRectangleAreaInBinary1 {
    public static void main(String[] args) {

        int[][] hights = {
                {0,1,1,0},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,0,0}
        };
        System.out.println(maxRectangleAreaInBinary(hights,4,4));
    }
    public static int[] nextSmallerElement(int[] nums,int n){
        Stack<Integer> stack  = new Stack<>();
        stack.push(-1);

        int[] ans = new int[n];
        for (int i = n-1; i >=0; i--) {
            int curr = nums[i];
            while (stack.peek()!=-1 && nums[stack.peek()]>=curr){
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    public static int[] prevSmallerElement(int[] nums,int n){
        Stack<Integer> stack  = new Stack<>();
        stack.push(-1);

        int[] ans = new int[n];
        for (int i = 0; i <n; i++) {
            int curr = nums[i];
            while (stack.peek()!=-1 && nums[stack.peek()]>=curr){
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    public static int largestRectangleArea(int[]nums,int hight){

        int[] next = new int[hight];
        int[] prev = new int[hight];

        next = nextSmallerElement(nums,hight);
        prev = prevSmallerElement(nums,hight);

        int area = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int h = nums[i];

            if (next[i]==-1){
                next[i] = hight;

            }

            int b = next[i] - prev[i] - 1;
            int newArea = h*b;
            area = Math.max(area,newArea);
        }
        return area;
    }

    public static int maxRectangleAreaInBinary(int[][] hights,int r, int c){
        //r = row
        //c = col

        //first step: compute first row maxArea
        int area = largestRectangleArea(hights[0],c);
        //why c bcz it shows how big is row means row length

        //now compute remaining row's area with adding upper rows

        for (int i = 1; i <r; i++) {
            for (int j = 0; j <c; j++) {

                //add upper rows in current row
                if (hights[i][j] == 0){
                    hights[i][j] = 0;
                }
                else{
                    hights[i][j] = hights[i][j] + hights[i-1][j];
                }
            }
            //our row is added now find its area
            int newArea = largestRectangleArea(hights[i],c);
            //why i bcz i shows length from above now height is 2 after words 3 and vice versa

            area = Math.max(area,newArea);
        }
        return area;
    }
}
