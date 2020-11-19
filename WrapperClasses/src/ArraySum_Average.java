import java.util.Scanner;

public class ArraySum_Average {
    public static Integer sum(Integer[] arr) {
        Integer sum = new Integer(0);
        for (Integer i : arr) {
            sum = sum + i;
        }
        return sum;
    }

    public static Double Average(Integer sum, Integer length) {
        Double d = new Double(sum/length);
        return d;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value at " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println("\n\nThe sum of the array is: " + sum(arr));
        System.out.println("The average of the array is: " + Average(sum(arr), arr.length));
    }
}
