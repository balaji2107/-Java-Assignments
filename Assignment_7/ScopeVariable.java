package assignmentone;

public class ScopeVariable {
    public static void main(String[] args) {
        int outsideVariable=10;
        if(outsideVariable==10){
            int insideVariable=20;
            System.out.println("Instance Variable: " +outsideVariable);
            System.out.println("Local Variable: " +insideVariable);
        }
        System.out.println("Instance Variable: " +outsideVariable);
//        System.out.println("Local Variable: " +insideVariable);
        //Local variable cannot be access outside the block
        //Instance Variable can have access inside and outside block
    }
}
