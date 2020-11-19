import student.*;

public class Generic1 {
    public static void main(String[] args) {
        Name name = new Name("John", "Stuart");
        Student stu = new Student<>(name);
        System.out.println(stu.toString());
        Student stu2 = new Student<>("Krishna");
        System.out.println(stu2.toString());
    }
}
