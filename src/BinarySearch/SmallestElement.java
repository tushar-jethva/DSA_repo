package BinarySearch;

public class SmallestElement {
    public static void main(String[] args) {
        char [] letters = {'a','b','d'};
        char target = 'f';
        System.out.println(nextGreatestLetter(letters,target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start<=end){
            // int mid = (start + end)/2;
            //might be possible that (start+end) exceed the range of intger

            int mid = start+ (end - start)/2;
            //it just like 2s + end - s / 2;


            if(target < letters[mid]){
                end = mid - 1;
            }
            else
                start = mid + 1;
            }
//       You can also use following approach
//        if(start == letters.length){
//            return letters[0];
//        }
//        else{
//            return letters[start];
//        }
        return letters[start % letters.length];
        }


    }

