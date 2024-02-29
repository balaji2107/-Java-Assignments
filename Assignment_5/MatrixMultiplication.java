/**
 * MatrixMultiplication
 */
public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        int[][] arr1={{1,2},{3,4},{5,6}};
        int[][] c=new int[arr.length][arr1[0].length];
        if(arr[0].length == arr1.length){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr1[0].length;j++){
                    for(int k=0;k<arr1.length;k++){
                        c[i][j]+=arr[i][k]*arr1[k][j];
                    }
                }
            }
        }
        else{
            System.out.println("Invalid Matrix");
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}