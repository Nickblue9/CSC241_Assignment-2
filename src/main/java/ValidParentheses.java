import java.util.Stack;

public class ValidParentheses {
    public static void main(String args[]) {
        System.out.println(isValid("()[]{}"));
    }


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }
            else{
                char c2 = stack.pop();
                if(!check(c,c2))
                    return false;
            }
        }
        return true;
    }

    public static boolean check(char c1, char c2){
        if((c1==')' && c2 == '(') )
            return true;
        else if ((c1==']' && c2 == '['))
            return true;
        else if (c1=='}' && c2 == '{')
            return true;
        else
            return false;
    }
}
