import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int a){
        for (int i = 2; i < Math.sqrt(a)+1 ; i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int a = input.nextInt();
        if(isPrime(a)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        input.close();
    }
}
