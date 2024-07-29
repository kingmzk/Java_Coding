import java.util.Stack;

public class ValidParantheses_20 {

    public static boolean isValid(String s){
     char[] arr = s.toCharArray();
     Stack<Character> stack = new Stack<Character>();
     for(char ans : arr){
        if(stack.isEmpty()){
            stack.push(ans);
        } else {
            char top = stack.peek();
            if(ans - top == 1 || ans - top == 2 ){
                stack.pop();
            }
            else {
                stack.push(ans);
            }
        }
     }

     return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([])";
        System.out.println(isValid(s));
    }
}
