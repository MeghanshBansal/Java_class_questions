class Task1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <=100; i+=2){
            System.out.print(i + " ");
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Task2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <100 ; i+=2) {
            System.out.print(i + " ");
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class EvenOdd {
    public static void main(String[] args) {
        Task1 obj1 = new Task1();
        Task2 obj2 = new Task2();
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);
        thread1.start();
        System.out.println("\n\n");
        thread2.start();
    }
}
