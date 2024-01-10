package ch2_recursion.ArrayQuestions;

public class SortedOrNot {
    public static void main(String[] args) {
        int []arr = {1,2,3,5,6,8};
        boolean ans = sorted(arr,0);
        System.out.println(ans);
    }

    static boolean sorted(int []arr, int index){
        //base condition
        if(index == arr.length - 1){
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr,index+1);
     }
}
