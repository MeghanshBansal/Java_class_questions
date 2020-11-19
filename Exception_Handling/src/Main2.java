import java.util.Scanner;

class myException extends Exception{
    myException(String s){
        super(s);
    }
}

public class Main2 {
    public static boolean searchelement(int a, int[] arr)throws myException {
        boolean flag = false;
        for (int j : arr) {
            if (a == j) {
                flag = true;
                break;
            }
        }
        if (flag){
            return flag;
        }
        else{
            throw new myException("element not found");
        }
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        try (input) {
            int[] arr = {0, 2, 6, 9, 1};
            System.out.println("Enter the element to search: ");
            int a = input.nextInt();
            boolean isthere = searchelement(a, arr);
            System.out.println(isthere);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
