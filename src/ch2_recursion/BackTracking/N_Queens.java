package ch2_recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class N_Queens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queensOfLeetCode(board,0,new ArrayList<>()));

    }

    public static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);

            return 1;
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {

            if(isSafe(board,row,col)){
            board[row][col] = true;
            count+=queens(board,row+1);
            board[row][col] = false;}
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        //for verically
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }

        //for left diagonally
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row-i][col - i]){
                return false;
            }
        }

        //for right diagonally
        int maxRight = Math.min(row,board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {

        for(boolean[] row : board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print(". ");
                }

            }
            System.out.println();
        }
    }

//Now function for return list of list
public static List<List<String>> queensOfLeetCode(boolean[][] board, int row, List<List<String>> ans){
    if(row == board.length){
        List<String> l = getList(board);
        ans.add(new ArrayList<>(l));
        return ans;
    }


    for (int col = 0; col < board.length; col++) {

        if(isSafe2(board,row,col)){
            board[row][col] = true;
            queensOfLeetCode(board,row+1,ans);
            board[row][col] = false;}
    }
    return ans;
}

    private static boolean isSafe2(boolean[][] board, int row, int col) {

        //for verically
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }

        //for left diagonally
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row-i][col - i]){
                return false;
            }
        }

        //for right diagonally
        int maxRight = Math.min(row,board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]){
                return false;
            }
        }

        return true;
    }

    private static List<String> getList(boolean[][] board) {

        List<String > list = new ArrayList<>();
        for(boolean[] row : board){
            StringBuilder sb = new StringBuilder();
            for(boolean element: row){
                if(element){
                    sb.append("Q");
                }
                else{
                    sb.append(".");
                }

            }
            list.add(sb.toString());
        }
        return list;
    }
}
