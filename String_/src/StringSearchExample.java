public class StringSearchExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = findSubstring(str, "World");
        if (index != -1) {
            System.out.println("Substring found at index " + index);
        } else {
            System.out.println("Substring not found");
        }
    }

    public static int findSubstring(String str, String subStr) {
        int strLength = str.length();
        int subStrLength = subStr.length();

        for (int i = 0; i <= strLength - subStrLength; i++) {
            int j;
            for (j = 0; j < subStrLength; j++) {
                if (str.charAt(i + j) != subStr.charAt(j)) {
                    break;
                }
            }
            if (j == subStrLength) {
                return i; // 匹配成功，返回索引
            }
        }
        return -1; // 没有匹配，返回 -1
    }
}

//public class StringReverseExample {
//    public static void main(String[] args) {
//        String original = "Hello";
//        String reversed = reverseString(original);
//        System.out.println("Original: " + original);
//        System.out.println("Reversed: " + reversed);
//    }
//
//    public static String reverseString(String str) {
//        return new StringBuilder(str).reverse().toString();
//    }
//}
