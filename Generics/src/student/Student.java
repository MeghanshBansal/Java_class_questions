package student;
public class Student<T>{
    private T name;
    public Student(T name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
