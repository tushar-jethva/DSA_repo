package Question_6.B;

public class q1351 {
    public static void main(String[] args) {

        int[][] grid = {
//                {4,3,2,-1},
//                {3,2,1,-1},
//                {1,1,-1,-2},
//                {-1,-1,-2,-3}
//                {3,2},{1,0}
//                {5,1,0},
//                {-5,-5,-5}

                {3,-1,-3,-3,-3},{2,-2,-3,-3,-3},{1,-2,-3,-3,-3},{0,-3,-3,-3,-3}
        };
        countNegatives(grid);
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {

        int r = grid.length - 1;
        int c = 0;
        int count = 0;
        int inc = 4;

        while (c<grid[0].length && r>=0){
            if(grid[r][c] < 0){
                r--;
                count+=1;
            }

            else {
                c++;
                r = grid.length - 1;
            }
            if(r==-1){
                c++;
                r = grid.length - 1;
            }


        }
        return count;
    }
}
