import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sudoku {
    Scanner scanner=new Scanner(System.in);
    private void playGame(){
        int[][] matrix={{5,3,0,0,7,0,0,0,2},
                {0,0,2,1,0,5,3,0,0},
                {0,9,8,0,4,0,0,0,7},
                {8,0,0,7,6,0,4,0,3},
                {4,2,0,0,0,3,0,9,0},
                {7,0,0,9,2,0,0,5,6},
                {9,0,0,0,3,7,0,0,0},
                {0,0,0,4,1,9,0,0,0},
                {3,4,0,2,8,0,0,0,0}};
        printSudoku(matrix);
        int empty;
        int count=0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(matrix[i][j]!=0){
                    count++;
                }
            }
        }
        empty=81-count;
        getVal(matrix,empty);
    }
    private boolean isNumberInRow(int row,int val,int[][] matrix){
        for(int i=0;i<9;i++){
            if(matrix[row][i]==val){
                return false;
            }
        }
        return true;
    }
    private boolean isNumberInColumn(int col,int val,int[][] matrix){
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[i][col]==val){
                return false;
            }
        }
        return true;

    }
    private boolean isNumberInBox(int row,int col,int val,int[][] matrix){
        int subr=row-row%3;
        int subc=col-col%3;
        for (int i = subr; i <subr+3 ; i++) {
            for (int j = subc; j <subc+3 ; j++) {
                if(matrix[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
    public void getVal(int[][] matrix,int count){
        int wrong=0,repeat=0;
        for (int k = 0; k < count; k++) {
            System.out.println("Enter the index(i and j)");
            int i=scanner.nextInt();
            int j=scanner.nextInt();
            if(matrix[i][j]!=0){
                if(repeat>3){
                    System.out.println("You lost this game");
                    return;
                }
                System.out.println("Value already Filled");
                k--;
                repeat++;
            }else {
                System.out.println("Enter the value");
                int val=scanner.nextInt();
                if (isNumberInRow(i,val,matrix) && isNumberInColumn(j,val,matrix) && isNumberInBox(i, j,val,matrix)) {
                    matrix[i][j]=val;
                    printSudoku(matrix);
                }else{
                    if(wrong>1){
                        System.out.println("You lost this game");
                        return;
                    }
                    System.out.println("Value already Exist");
                    wrong++;
                }
            }
        }
        if(isValidSudoku(matrix))
            System.out.println("Congratulation!...");
        else
            System.out.println("You lost this game");
    }
    private void printSudoku(int[][] sudoko){
        for(int[] sub:sudoko){
            for(int val:sub){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    private boolean isValidSudoku(int[][] sudoku){
        Set<String> set=new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <9 ; j++) {
                int val=sudoku[i][j];
                if(!set.add(val+"in row"+i) || !set.add(val+"in column"+j) || !set.add(val+"in block"+i/3+"-"+j/3))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Sudoku().playGame();
    }
}