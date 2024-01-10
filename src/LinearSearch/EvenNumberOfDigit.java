package LinearSearch;

public class EvenNumberOfDigit {
    public static void main(String[] args) {

        int []arr = {10,20,222,1828,1};
        System.out.println(evenNumber(arr));
    }

    static int evenNumber(int []arr){
        int count=0;
        for(int num:arr){
            if(even2(num) % 2==0){
                count++;
            }
        }
        return count;
    }

//    static boolean even(int num){
//        int count = 0;
//        while(num>0){
//            num = num/10;
//            count++;
//        }
//        if(count % 2==0){
//            return true;
//        }
//        return false;
//    }

    static int even2(int num){
        if(num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num))+1;
    }

//    static int evenNumber(int []arr){
//        int count=0;
//        for (int i = 0; i < arr.length; i++) {
//            int a = arr[i];
//            if(Integer.toString(a).length() % 2 == 0){
//                count++;
//            }
//        }
//        return count;
//    }
}
