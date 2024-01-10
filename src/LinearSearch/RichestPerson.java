package LinearSearch;

public class RichestPerson {
    public static void main(String[] args) {
        int [][]a = {{2,8,7},{7,3,1},{1,9,5}};

        System.out.println(maximumWealth(a));
    }
    public static int maximumWealth(int[][] accounts) {

        int wealth = 0;
        int sum;

        for(int row = 0;row<accounts.length;row++){
            sum = 0;
            for (int j = 0; j < accounts[row].length; j++) {
                sum += accounts[row][j];
                if(sum>wealth){
                    wealth = sum;
                }
            }
        }
        return wealth;
    }
}
