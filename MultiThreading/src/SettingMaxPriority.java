public class SettingMaxPriority {
    public static void main(String[] args) {
        Thread currentthread = Thread.currentThread();
        System.out.println("The priority of current thread: " + currentthread.getPriority());
        currentthread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("The new priority of current thread: " + currentthread.getPriority());
    }
}
