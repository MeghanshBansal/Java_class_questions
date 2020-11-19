import java.util.Arrays;

public class Main3 {
    public static void main(String[] args){
        String[] arr = new String[5];
        try {
            for (int i = 0; i < args.length; i++) {
                arr[i]=args[i];
            }
            System.out.println(Arrays.toString(arr));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
