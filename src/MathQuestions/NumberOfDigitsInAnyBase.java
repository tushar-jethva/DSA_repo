package MathQuestions;

public class NumberOfDigitsInAnyBase {
    public static void main(String[] args) {
        int n = 34562;
        int b = 2;

        //b is represented the base of any number whether it is in binary or octal or decimal or any base
        int ans = (int)((Math.log(n) / Math.log(b) )+ 1);
        System.out.println(ans);
    }
}
