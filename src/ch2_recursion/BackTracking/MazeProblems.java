package ch2_recursion.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblems {
    public static void main(String[] args) {
        int ans = maze(3,3);
        System.out.println(ans);
        mazePath("",3,3);
        ArrayList<String> list = new ArrayList<>();
        list = mazePathRet("",3,3);
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1 = mazePathDiagonalRet("",3,3);
        System.out.println(list1);

//        boolean[][] maze = {
//                {true,true,true},
//                {true,false,true},
//                {true,true,true}
//        };
//       mazePathRestrictions("",maze,0,0);

        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allPathFourDirections("",maze,0,0);
        int [][]path = new int[maze.length][maze[0].length];
        allPathFourDirectionsPathMatrix("",maze,0,0,path,1);
    }

    static int maze(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int count = 0;


        count = count + maze(row - 1,col);
        count = count + maze(row,col - 1);
        return count;
    }

    static void mazePath(String p, int row , int col){

         if(row == 1 && col == 1){
             System.out.println(p);
             return;
         }

         if(row > 1){
             mazePath(p+'D',row - 1, col);
         }
         if (col > 1){
             mazePath(p+'R',row,col - 1);
         }
    }

    static ArrayList<String> mazePathRet(String p, int row , int col){

        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(row > 1){
          ans.addAll(mazePathRet(p+'D',row - 1, col));
        }
        if (col > 1){
           ans.addAll(mazePathRet(p+'R',row,col - 1));
        }
        return ans;
    }

    static ArrayList<String> mazePathDiagonalRet(String p, int row , int col){

        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(row>1 && col>1){
            ans.addAll(mazePathDiagonalRet(p+'D',row - 1, col - 1));
        }
        if(row > 1){
            ans.addAll(mazePathDiagonalRet(p+'V',row - 1, col));
        }
        if (col > 1){
            ans.addAll(mazePathDiagonalRet(p+'H',row,col - 1));
        }
        return ans;
    }

    static void mazePathRestrictions(String p,boolean[][] maze, int row , int col){

        if(row == maze.length - 1 && col == maze[0].length - 1)
        {
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }
        //why less than bez now we take index from 0 t0 n-1
        if(row < maze.length - 1){
            mazePathRestrictions(p+'D',maze,row + 1, col);
        }
        if (col < maze[0].length - 1){
            mazePathRestrictions(p+'R',maze,row,col + 1);
        }
    }

    static void allPathFourDirections(String p,boolean[][] maze, int row , int col){

        if(row == maze.length - 1 && col == maze[0].length - 1)
        {
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        //i am considering as false first when visited
        maze[row][col] = false;

        //why less than bez now we take index from 0 t0 n-1
        if(row < maze.length - 1){
            allPathFourDirections(p+'D',maze,row + 1, col);
        }
        if (col < maze[0].length - 1){
            allPathFourDirections(p+'R',maze,row,col + 1);
        }

        if(row>0){
            allPathFourDirections(p+'U',maze,row - 1,col);
        }

        if(col > 0){
            allPathFourDirections(p+'L',maze,row,col - 1);
        }

        //this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function call
        maze[row][col] = true;
    }

    static void allPathFourDirectionsPathMatrix(String p,boolean[][] maze, int row , int col, int [][] path, int step){

        if(row == maze.length - 1 && col == maze[0].length - 1)
        {
            path[row][col] = step;
            for (int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[row][col]){
            return;
        }

        //i am considering as false first when visited
        maze[row][col] = false;
        path[row][col] = step;

        //why less than bez now we take index from 0 t0 n-1
        if(row < maze.length - 1){
            allPathFourDirectionsPathMatrix(p+'D',maze,row + 1, col,path,step+1);
        }
        if (col < maze[0].length - 1){
            allPathFourDirectionsPathMatrix(p+'R',maze,row,col + 1,path,step+1);
        }

        if(row>0){
            allPathFourDirectionsPathMatrix(p+'U',maze,row - 1,col,path,step+1);
        }

        if(col > 0){
            allPathFourDirectionsPathMatrix(p+'L',maze,row,col - 1,path,step+1);
        }

        //this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function call
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
