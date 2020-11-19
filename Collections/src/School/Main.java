package School;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static ArrayList<Student> clean(ArrayList<Student> stulist) {
        ArrayList<Student> cloned = (ArrayList<Student>) stulist.clone();
        int i = 0;
        for (Student st :
                cloned) {
            if (java.lang.Character.toLowerCase(st.getName().charAt(0)) == 'j' || java.lang.Character.toLowerCase(st.getName().charAt(0)) == 'a') {
                stulist.remove(i);
                i--;
            }
            i++;
        }
        return stulist;
    }

    public static void main(String[] args) {
        ArrayList<Student> stulist = new ArrayList<Student>();
        stulist.add(new Student("Aaditya", 19, 9.0));
        stulist.add(new Student("Gautam", 56, 8.2));
        stulist.add(new Student("Saksham", 1, 7.5));
        stulist.add(new Student("Sapna", 12, 9.9));
        stulist.add(new Student("Jacob", 32, 5));
        stulist = clean(stulist);
        Collections.sort(stulist);
        for (Student st :
                stulist) {
            System.out.println(st.toString());
        }
    }
}
