package ch2_recursion;

public class IsInSortedOrder {
    public static int sortedOrNot(int []a, int index){
        if(a.length == 1){
            return 1;
        }

        return (a[index - 1]<a[index - 2])?0:sortedOrNot(a,index-1);


    }

    public static void main(String[] args) {
        int []b = {1,2,3,4};
        System.out.println(sortedOrNot(b,b.length-1));
    }
}
