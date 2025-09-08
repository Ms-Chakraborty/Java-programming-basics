package patterntwo.recursion;

public class substring {
 // Recursive helper: counts substrings starting from index i
    public static int countSubstrings(String s, int i) {
        int n = s.length();

        // Base case
        if (i >= n) return 0;

        int count = 1; // At least one char
        int j = i + 1;

        // Count how many same consecutive characters
        while (j < n && s.charAt(j) == s.charAt(i)) {
            count++;
            j++;
        }

        // Substrings from this block = k*(k+1)/2
        int blockSubstrings = (count * (count + 1)) / 2;

        // Recurse from next block
        return blockSubstrings + countSubstrings(s, j);
    }

    public static void main(String[] args) {
        String s = "abcab";
        int result = countSubstrings(s, 0);
        System.out.println("Count: " + result);  // Output: 7
    }
}
