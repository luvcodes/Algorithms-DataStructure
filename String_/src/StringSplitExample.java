import java.util.ArrayList;
import java.util.List;

public class StringSplitExample {
    public static void main(String[] args) {
        String str = "apple,banana,orange";
        String[] parts = splitString(str, ",");
        for (String part : parts) {
            System.out.println(part);
        }
    }

    public static String[] splitString(String str, String delimiter) {
        List<String> partsList = new ArrayList<>();
        int startIndex = 0;
        int delimiterIndex = str.indexOf(delimiter);

        while (delimiterIndex != -1) {
            partsList.add(str.substring(startIndex, delimiterIndex));
            startIndex = delimiterIndex + delimiter.length();
            delimiterIndex = str.indexOf(delimiter, startIndex);
        }
        partsList.add(str.substring(startIndex));

        return partsList.toArray(new String[0]);
    }
}

//public class StringSplitExample {
//    public static void main(String[] args) {
//        String str = "apple,banana,orange";
//        String[] parts = splitString(str, ",");
//        for (String part : parts) {
//            System.out.println(part);
//        }
//    }
//
//    public static String[] splitString(String str, String delimiter) {
//        return str.split(delimiter);
//    }
//}

