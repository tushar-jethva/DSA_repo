package Question_6.B;
import java.util.Arrays;
public class q888 {
   /* Let Sum of choclates by Alice Be Sa and Sum of choclates by Alice Be Sb

    Let the choclates from Alice to Bob be A and from Bob to Alice be B

    Sa -A + B = Sb -B+A
2(A-B) = (Sa-Sb)
    A-B = (Sa-Sb)/2
    A = B+(Sa-Sb)/2

    So the goal is to search the elements of Alice such that Bob + (Diff of Sum) exists in the Alice
    For optimisation Alice is sorted and Binary search is applied on Alice

    */
    public static void main(String[] args) {

        int []a ={1,1};
        int []b = {2,2};
        int []c = fairCandySwap(a,b);
        System.out.println(Arrays.toString(c));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int at = 0;
        int bt = 0;
        for(int i=0;i<aliceSizes.length;i++){
            at+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            bt+=bobSizes[i];
        }

        int diff = (at-bt)/2;
        Arrays.sort(aliceSizes);
        for(int num: bobSizes){
            if(bs(aliceSizes,num+diff) != -1)
                return new int[]{num+diff,num};

        }
        return null;
    }

    static int bs(int []arr, int target){
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                e = mid - 1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;
    }
}
