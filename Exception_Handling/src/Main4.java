import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            char ch = 'y';
            while(ch=='y'){
                int a = input.nextInt();
                System.out.println(a);
                System.out.print("Do you want to Enter more Number(y/n): ");
                System.out.println();
                ch = input.next().charAt(0);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
