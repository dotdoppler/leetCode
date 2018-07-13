import java.util.Stack;

/**
 * @author zxy
 * @date 2018/5/11
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s == null || s.equals("")) {
            return true;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        if (chars.length < 2) {
            return false;
        }
        for (char c : chars) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (!stack.isEmpty()) {
                    char top = stack.pop();
                    if (!(c == '}' && top == '{' || c == ']' && top == '[' || c == ')' && top == '(')) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
