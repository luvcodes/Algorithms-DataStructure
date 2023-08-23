public class StringIndexMethod {
    public static void main(String[] args) {
        String str = "Hello, World!";

        char charAtIndex = getIndexChar(str, 7); // 获取索引为 7 的字符，即 'W'

        System.out.println("Character at index 7: " + charAtIndex);
    }

    public static char getIndexChar(String str, int index) {
        if (index < 0 || index >= str.length()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        return str.charAt(index);
    }
}
