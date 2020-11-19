import java.util.Scanner;

public class Smaller {
    public static int stringCompare(String str1, String str2) {

        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = str1.charAt(i);
            int str2_ch = str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        if (l1 != l2) {
            return l1 - l2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        var v1 = input.next();
        var v2 = input.next();
        if (stringCompare(v1, v2) > 0) System.out.println(v1 + " is greater than " + v2);
        else if (stringCompare(v1, v2) < 0) System.out.println(v2 + " is greater than " + v1);
        else System.out.println("both " + v1 + " and " + v2 + " are equal!");
    }
}
