public class GenericSum {
    public static <T extends Number> double sum(T[] arr) {
        double sum = 0.0;
        for (T t : arr) {
            sum = sum + t.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sum(arr1));
        Double[] arr2 = {2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        System.out.println(sum(arr2));
    }
}
