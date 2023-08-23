public class StringMatchExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        boolean isMatch = matchPattern(str, "Hello.*");
        if (isMatch) {
            System.out.println("Pattern matched");
        } else {
            System.out.println("Pattern not matched");
        }
    }

    public static boolean matchPattern(String str, String pattern) {
        int strLength = str.length();
        int patternLength = pattern.length();

        if (patternLength == 0) {
            return strLength == 0;
        }

        if (pattern.charAt(0) == '.') {
            return matchPattern(str.substring(1), pattern.substring(1));
        }

        if (patternLength >= 2 && pattern.charAt(1) == '*') {
            return (matchPattern(str, pattern.substring(2)) ||
                    (strLength > 0 && (str.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.') &&
                            matchPattern(str.substring(1), pattern)));
        }

        return strLength > 0 && (str.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.') &&
                matchPattern(str.substring(1), pattern.substring(1));
    }
}

//public class StringMatchExample {
//    public static void main(String[] args) {
//        String str = "Hello, World!";
//        boolean isMatch = matchPattern(str, "Hello.*");
//        if (isMatch) {
//            System.out.println("Pattern matched");
//        } else {
//            System.out.println("Pattern not matched");
//        }
//    }
//
//    public static boolean matchPattern(String str, String pattern) {
//        return str.matches(pattern);
//    }
//}

