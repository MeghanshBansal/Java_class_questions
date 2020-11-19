import java.util.ArrayList;
import java.util.Random;

public class EvenOdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(20000));
        }
        System.out.println(list.toString());
        int counteven = 0, countodd = 0;
        for (Integer i :
                list) {
            if (i % 2 == 0) counteven++;
            else countodd++;
        }
        System.out.println("Number of even Objects: " + counteven);
        System.out.println("Number of odd objects: " + countodd);
    }
}
