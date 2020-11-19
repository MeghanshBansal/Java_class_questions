import java.util.Scanner;

public class StringObjectConcat{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string buffer: ");
        StringBuffer str1 = new StringBuffer(input.nextLine());
        System.out.println("Enter the string builder: ");
        StringBuilder str2 = new StringBuilder(input.nextLine());
        System.out.println(str1.append(str2));
    }
}