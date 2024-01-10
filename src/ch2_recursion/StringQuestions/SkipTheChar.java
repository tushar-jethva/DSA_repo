package ch2_recursion.StringQuestions;

public class SkipTheChar {
    public static void main(String[] args) {
     skip("","Hello",'l');
        String s  = skipReturnString("Hello",'l');
        System.out.println(s);

        String a = skipApple("HelloAppleHowAreYou?","Apple");
        System.out.println(a);

        String b = skipAppNotApple("IWillMakeAppNotApple");
        System.out.println(b);
    }
    //p = process , up = original String
    static void skip(String p, String up, char skip){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        //if ch==a then just skip the a else add in the p
        if(ch == skip){
            skip(p,up.substring(1),skip);
        }
        else{
            skip(p+ch,up.substring(1),skip);
        }
    }

    static String skipReturnString( String up, char c){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if(ch == c){
            return skipReturnString(up.substring(1),c);
        }
        else{
           return ch + skipReturnString(up.substring(1),c);
        }
    }

    static String skipApple( String up, String skip){
        if(up.isEmpty()){
            return "";
        }


        if(up.startsWith(skip)){
            return skipApple(up.substring(5),skip);
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1),skip);
        }
    }

    static String skipAppNotApple( String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("App") && !up.startsWith("Apple")){
            return skipAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }


}
