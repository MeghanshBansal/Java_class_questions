import java.util.Arrays;
import java.util.Scanner;

public class LookEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean equal = true;
        if (a1.length == a2.length) {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    equal = false;
                    break;
                }
            }
        } else {
            equal = false;
        }
        if (equal) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        input.close();
    }
}
