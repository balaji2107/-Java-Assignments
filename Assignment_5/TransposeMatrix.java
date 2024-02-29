public class TransposeMatrix {
    public static void main(String[] arg){
        int[][] arr={{1,2,3},{3,4,6},{8,9,0}};
        int[][] c=new int[arr[0].length][arr.length];
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                c[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
