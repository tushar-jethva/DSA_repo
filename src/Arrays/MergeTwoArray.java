package Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int []n1 = {2,0};
        int []n2 = {1};
        int m = 1;
        int n = 1;
        merge(n1,m,n2,n);
    }
    public static void merge(int[] n1, int m, int[] n2, int n) {

        int i=0,j=0,k=0;

        int arr[] = new int[n1.length];
        for (int p=0;p<n1.length;p++){
            arr[p] = n1[p];
        }


        while(i<m && j<n){
            int s1 = arr[i];
            int s2 = n2[j];
            if(s1<=s2){
                n1[k] = s1;
                k++;
                i++;
            }
else{
            n1[k] = s2;
            k++;
            j++;}
        }

        if(i<m){
            for(int t = i;t<m;t++){
                n1[k] = arr[t];
                k++;
            }
        }

        if(j<n){
            for(int t = j;t<n;t++){
                n1[k] = n2[t];
                k++;
            }
        }

        //System.out.print("[");
        for(int s=0;s<n1.length;s++){
            System.out.println(n1[s]);
        }
        //System.out.println(a.length);
        //System.out.print("]");
    }
}
