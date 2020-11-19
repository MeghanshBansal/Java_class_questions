import java.util.Scanner;

public class LengthCapacityOfStrings {
    public static void main(String[] args) {
        String str1 = new String();
        StringBuilder str2 = new StringBuilder();
        StringBuilder str3 = new StringBuilder();
        System.out.println("Length of String: " + str1.length());
        System.out.println("\nLength of StringBuffer: " + str2.length());
        System.out.println("Capacity of StringBuffer: " + str2.capacity());
        System.out.println("\nLength of StringBuilder: " + str3.length());
        System.out.println("Capacity of StringBuilder: " + str3.capacity());
    }
}
