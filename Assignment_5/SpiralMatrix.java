public class SpiralMatrix{
    public static void main(String[] arg){
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(arr,arr.length,arr[0].length);
    }
    public static void spiral(int[][] c,int m,int n){
        int rStart=0;
        int rEnd=m-1;
        int cStart=0;
        int cEnd=n-1;
        
        while(rStart<=rEnd && cStart <= cEnd){
            for(int i=cStart;i<=cEnd;i++){
                System.out.print(c[rStart][i]+" ");
            }
            rStart++;
            for(int i=rStart;i<=rEnd;i++){
                System.out.print(c[i][cEnd]+" ");
            }
            cEnd--;
            if(rStart<=rEnd){
                for(int i=cEnd;i>=cStart;i--){
                    System.out.print(c[rEnd][i]+" ");
                }
                rEnd--;
            }
            if(cStart<=cEnd){
                for(int i=rEnd;i>=rStart;i--){
                    System.out.print(c[i][cStart]+" ");
                }
                cStart++;
            }
        }
    }
}