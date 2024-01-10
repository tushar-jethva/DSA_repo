package MathQuestions;

public class FindNotTwiceNumber {
    public static void main(String[] args) {
        int []arr = {1,2,3,3,2,1,4};
        System.out.println(find(arr));
    }
    static int find(int []arr){
        int unique = 0;
        for (int nums: arr){
            unique ^= nums;
        }

        return unique;
    }
}
