import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the string: ");
            String str = input.nextLine();
            char[] arr = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
