package ch2_recursion;

public class maximum_sum_non_adjacent {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,3,5,8,1,9};
        non_adjacent_max_sum(arr,0,Integer.MIN_VALUE,0);

    }

    public static void non_adjacent_max_sum(int []arr,int i,int maxi,int sum){

        if(i>=arr.length){
           maxi = Math.max(maxi,sum);
            System.out.println(maxi);
           return;
        }

        //include adjacent
        non_adjacent_max_sum(arr,i+2,maxi,sum+arr[i]);

        //exclude
        non_adjacent_max_sum(arr,i+1,maxi,sum);
    }

    //c++ code is below


//    void solve(vector<int>& arr, int i, int sum, int &maxi){
//        if(i>=arr.size()){
//            maxi = max(maxi,sum);
//            return;
//        }
//
//        //include
//        solve(arr,i+2,sum+arr[i],maxi);
//        //exclude
//        solve(arr,i+1,sum,maxi);
//    }
}
