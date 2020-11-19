public class MainPriority {
    public static void main(String[] args) {
        Thread mainthread = Thread.currentThread(); //or Thread mainthread = new Thread();
        System.out.println("The priority of current thread that is main is: " + mainthread.getPriority());
    }
}
