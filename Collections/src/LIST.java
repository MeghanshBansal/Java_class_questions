import java.util.ArrayList;

public class LIST {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(15);
        for (int i = 1; i < 16; i++) {
            list.add(i);
        }
        System.out.println(list.get(14));
    }
}
