import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Use a Stack to keep track of opening brackets.
        Stack<Character> stack = new Stack<>();

        // Loop through every character in the string.
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack.
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If the character is a closing bracket...
            else if (c == ')') {
                // Check if the stack is empty or if the top isn't the matching opening bracket.
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }

        // After the loop, if the stack is empty, all brackets were matched.
        // If it's not empty, there are unclosed opening brackets.
        return stack.isEmpty();
    }
}
