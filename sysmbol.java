//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
public class sysmbol {
    public static void main(String[] args)
    { 
        String s = "(){}[]";
        if(isValid(s))
        {
            System.out.println("It is right parenthesis:");
        }
        else
        {
            System.out.println("it id wrong :");
        }
    }
    
    public static boolean isValid(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}