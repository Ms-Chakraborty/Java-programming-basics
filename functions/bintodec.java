package functions;
import java.util.*;

public class bintodec {
    
    // Function to convert binary to decimal
    public static int convertdec(int n) {
        int decimal = 0;
        int i = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            n = n / 10;
            decimal += lastdigit * (int)(Math.pow(2, i));
            i++;
        }
        return decimal;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the binary number:");
            int n = sc.nextInt();

            int result = convertdec(n);
            System.out.println("Decimal value: " + result);
        }
    }
}
