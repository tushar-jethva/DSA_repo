package Stack;

public class TwoStackInOneArray {
    int top1;
    int top2;
    int size;
    int[] arr;
    TwoStackInOneArray(int s){
        this.size = s;
        top1 = -1;
        top2 = size;
        arr = new int[s];
    }
    void push1(int a){

        if (top2 - top1 > 1) {
            top1++;
            arr[top1] = a;
        }
        else{
            System.out.println("Stack overflow");
        }
    }

    void push2(int a){

        if (top2 - top1 > 1) {
            top2--;
            arr[top2] = a;

        }
        else{
            System.out.println("Stack overflow");
        }
    }
    int pop1(){
        int ans = -1;
        if (top1>=0){
             ans = arr[top1];
            top1--;
        }
        else{
            System.out.println("Empty");
        }
        return ans;
    }
    int pop2(){
        int ans = -1;
        if (top2<size){
            ans = arr[top2];
            top2++;
        }
        else{
            System.out.println("Empty");
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}
