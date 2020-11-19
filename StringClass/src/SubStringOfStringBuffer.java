import java.util.Scanner;

public class SubStringOfStringBuffer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        StringBuffer str = new StringBuffer(input.nextLine());
        System.out.println("Enter the starting index and the ending index of the substring: ");
        byte a = input.nextByte();
        byte b = input.nextByte();
        System.out.println("The substring is: " + str.substring(a, b));
    }
}
