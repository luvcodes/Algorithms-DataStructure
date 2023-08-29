public class StringReverseExample {
    public static void main(String[] args) {
        String original = "Hello";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
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
