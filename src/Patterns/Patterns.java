package Patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern30(7);
    }


    static void pattern1(int n){

        for (int row = 1; row <=n; row++) {
            //for every row run the col
            for (int col = 1; col <= n ; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern2(int n){

        for (int row = 1; row <=n; row++) {
           //for every row run the col
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern3(int n){

        for (int row = 1; row <=n; row++) {
            //for every row run the col
            for (int col = 1; col <=(n-row+1) ; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern4(int n){

        for (int row = 1; row <=n; row++) {
            //for every row run the col
            for (int col = 1; col <=(row) ; col++) {
                System.out.print(col);
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern5(int n){

        for (int row = 0; row < 2 * n; row++){
            int totalColsInrow = row>n ? 2* n -row: row;
            for (int col = 0; col < totalColsInrow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern28(){

        for (int row = 0; row < 2 * 5; row++){


            int totalColsInrow = row> 5 ? 2* 5 -row: row;
            int noOfSpaces = 5 - totalColsInrow;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInrow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern29(){
        for(int i = 1; i<= 10; i++){
            for(int j = 1; j<= 10; j++){
                if(i==1 || i== 10){
                    System.out.print("* ");
                }
                else if(j==1 || j== 10){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }


    static void pattern30(int n){


        for (int i = 0; i <= n/2; i++) {
           int j = n - 1;
            if(i!=0){
                j = j / (2*i);
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            while (j>0){
                if(i==0 && (j==i+1||j==n-2)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                j--;
            }
            System.out.println();
        }

        for (int i = 1; i <= n/2; i++) {
            int j = n - 1;
            if(i!=n/2){
                j = j / (2*i);
            }
            for (int k = i; k < n/2; k++) {
                System.out.print(" ");
            }
            while (j>0){
                if(i==n/2 && (j==2||j==3)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                j--;
            }
            System.out.println();
        }
    }
}
