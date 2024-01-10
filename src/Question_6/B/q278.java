package Question_6.B;

public class q278 {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    private static boolean isBadVersion(int mid) {

        if(mid == 2){
            return true;
        }
        return false;
    }
    public static int firstBadVersion(int n) {

        int s = 0;
        int e = n;

        while(s<e){
            int mid = s+(e-s)/2;

            if(isBadVersion(mid)){
                e = mid;
            }

            else if(!isBadVersion(mid)) {
                s = mid + 1;

            }
            else{
                return mid;
            }
        }
        return s;
    }
}
