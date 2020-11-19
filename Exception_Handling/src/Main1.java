import java.util.Scanner;

class MyException extends Exception{
    MyException(String s) {
        super(s);
    }
}

public class Main1 {
    public static int validate(int a) throws MyException {
        if (a == 0) {
            throw new MyException("0 as input is not valid");
        }
        else{
            return a;
        }
    }
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int a = validate(input.nextInt());
        } catch (Exception m) {
            System.out.println(m);
        }
    }
}
