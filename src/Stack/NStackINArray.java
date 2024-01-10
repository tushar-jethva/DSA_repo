package Stack;
import java.util.Arrays;
public class NStackINArray {
    int[] arr;
    int[] top;
    int[] next;

    int s,n;
    int freespot;

    NStackINArray(int s, int n){
        this.s = s;
        this.n = n;

        arr = new int[s];//s = size of array
        top = new int[n];//n = how many stack
        next = new int[s];

        Arrays.fill(top,-1);
        for (int i = 0; i < s; i++) {
            next[i] = i++;
        }
        next[s-1] = -1;
        freespot=0;
    }

    void push(int x, int m){

        //check is full or not
        if(freespot==-1){
            System.out.println("FULL!");
        }
        //find index
        int index = freespot;

        //update freespot
        freespot = next[index];

        //enter element in arr
        arr[index] = x;

        //update next
        next[index] = top[m-1];
        //shows next element at which index for particular stack

        //update top
        top[index] = index;
        //it shows top element of particular stack
    }

    int pop(int m){

        if (top[m-1]==-1){
            System.out.println("EMPTY");
            return -1;
        }

        int index = top[m-1];
        top[m-1] = next[index];

        next[index] = freespot;
        freespot=index;
        return arr[index];

    }
}
