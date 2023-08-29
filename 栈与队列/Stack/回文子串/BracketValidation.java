import java.util.Stack;

public class BracketValidation {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch); // 遇到左括号，入栈
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop(); // 遇到右括号且与栈顶元素匹配，出栈
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop(); // 遇到右括号且与栈顶元素匹配，出栈
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop(); // 遇到右括号且与栈顶元素匹配，出栈
            } else {
                return false; // 遇到无效的括号或无法匹配的括号，返回false
            }
        }

        return stack.isEmpty(); // 如果栈为空，说明所有括号都匹配成功
    }

    public static void main(String[] args) {
        String input = "({[]})";
        boolean result = isValid(input);

        if (result) {
            System.out.println("括号匹配成功");
        } else {
            System.out.println("括号匹配失败");
        }
    }
}
