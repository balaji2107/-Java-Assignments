package Assignment;

public class AllOfByOne {
    public static void main(String[] args) {
        int[] arr1={4, 15, 40, 99};
        int[] arr2={5, 16,  41,100};
        int index=0;
        boolean res=checkArr(arr1,arr2,index);
        System.out.println(res);


    }
    static boolean checkArr(int[] arr1,int[] arr2,int index){
        if (index == arr1.length && index == arr2.length) {
            return true;
        }

        if(arr1.length!=arr2.length){
            return  false;
        }

        if (index >= arr1.length || index >= arr2.length) {
            return false;
        }
        if (arr2[index] == arr1[index] + 1) {
            return checkArr(arr1, arr2, index + 1);
        }
        else
            return false;
    }
}
