import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Object a = new Object();
            a = (int) input.nextInt();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
