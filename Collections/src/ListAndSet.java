import java.util.*;

public class ListAndSet {
    public static void main(String[] args) {
        //list
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(256);
        list.add(24698);
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        //unordered set
        HashSet<Integer> list1 = new HashSet<Integer>();
        list1.add(23);
        list1.add(256);
        list1.add(24698);
        Iterator<Integer> itr1 = list1.iterator();
        while(itr1.hasNext()){
            System.out.print(itr1.next() + " ");
        }
        System.out.println();
        //ordered set
        LinkedHashSet<Integer> lset = new LinkedHashSet<>();
        lset.add(23);
        lset.add(256);
        lset.add(24698);
        Iterator<Integer> itr2 = lset.iterator();
        while(itr2.hasNext()){
            System.out.print(itr2.next() + " ");
        }



    }
}
