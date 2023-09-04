import java.util.Stack;

public class PalindromeValidation {
    public static boolean isPalindrome(String str) {
        // 创建一个空栈
        Stack<Character> stack = new Stack<>();

        // 将字符串的前半部分入栈
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            stack.push(str.charAt(i));
        }

        // 如果字符串长度为奇数，则跳过中间的字符
        int startIndex = len % 2 == 0 ? len / 2 : len / 2 + 1;

        // 遍历字符串的另一半，与栈中的字符比较
        for (int i = startIndex; i < len; i++) {
            if (stack.isEmpty() || stack.pop() != str.charAt(i)) {
                return false; // 字符不匹配，不是回文子串
            }
        }

        return true; // 字符全部匹配，是回文子串
    }

    public static void main(String[] args) {
        String input = "abccba";
        boolean result = isPalindrome(input);
        
        if (result) {
            System.out.println("是回文子串");
        } else {
            System.out.println("不是回文子串");
        }
    }
}
