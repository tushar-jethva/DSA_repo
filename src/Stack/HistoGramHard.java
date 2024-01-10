package Stack;

import java.util.Stack;

public class HistoGramHard {
    public static void main(String[] args) {
        int[]heights = {2,1,5,6,2,3};
        largestRectangleArea(heights);

    }
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] next = new int[n];
        int[] prev = new int[n];

        next = nextSmallerElement(heights,n);
        prev = prevSmallerElement(heights,n);

        int area = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int l = heights[i];

            if (next[i] == -1){
                next[i] = n;
            }
            int b = next[i] - prev[i] - 1;
            int newArea = l*b;
            area = Math.max(area,newArea);

        }
        return area;
    }

    private static int[] nextSmallerElement(int[] arr, int n) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int[]ans = new int[n];
        //from behind we start to check smaller element
        for (int i = n-1; i >=0 ; i--){

            int curr = arr[i];
            while (stack.peek()!=-1&&arr[stack.peek()] >= curr)
            {
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    private static int[] prevSmallerElement(int[] arr, int n) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int[]ans = new int[n];
        //from behind we start to check smaller element
        for (int i = 0; i <n ; i++) {

            int curr = arr[i];
            while (stack.peek()!=-1&&arr[stack.peek()] >= curr)
            {
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }
}
