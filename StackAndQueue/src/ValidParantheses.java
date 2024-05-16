import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String str="(()){}{}{}{({})}";
        if(valid(str)){
            System.out.println("Valid");
        }
        else
            System.out.println("Invalid");

    }
    public static boolean valid(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char k=str.charAt(i);
            if(k=='(')
                stack.push(')');
            else if(k=='[')
                stack.push(']');
            else if(k=='{')
                stack.push('}');
            else if(stack.isEmpty() || stack.pop() != k){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
