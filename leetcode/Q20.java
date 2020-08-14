import java.util.Stack;

public class Q20 {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        int len = s.length();
        int index = 0;
        while (index < len) {
            char c = s.charAt(index);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            index++;
        }
        return stack.isEmpty();
    }
}
