import java.util.Scanner;

public class ASCIICharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        Character ch = new Character(input.next().charAt(0));
        Integer ascii = new Integer(ch);
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }
}
