package patterntwo.recursion;

public class lengthofstring {
     public static int findLength(String str) {
        // Base case: if string is empty
        if (str.equals("")) {
            return 0;
        }
        // Recursive step: remove first character, add 1
        return 1 + findLength(str.substring(1));
    }

    public static void main(String[] args) {
        String input = "hello";
        int length = findLength(input);
        System.out.println("Length: " + length);
    }
}
