class Task_1 extends Thread {
    @Override
    public void run() {
        System.out.print("hello ");
    }
}

class Task_2 extends Thread {
    @Override
    public void run() {
        System.out.println("world");
    }
}

class Task_3 implements Runnable {
    @Override
    public void run() {
        System.out.print("java ");
    }
}

class Task_4 implements Runnable {
    @Override
    public void run() {
        System.out.println("programming");
    }
}


public class HelloWorld {
    public static void main(String[] args) {
        Thread task1 = new Task_1();
        Thread task2 = new Task_2();
        Runnable obj3 = new Task_3();
        Runnable obj4 = new Task_4();
        Thread task3 = new Thread(obj3);
        Thread task4 = new Thread(obj4);
        task1.start();
        while (task1.isAlive()) {
        }
        task2.start();
        while (task2.isAlive()) {
        }
        task3.start();
        while (task3.isAlive()) {
        }
        task4.start();
    }
}
