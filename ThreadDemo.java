  
public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Threading(), "OddThread");
        Thread t2 = new Thread(new Threading(), "EvenThread");
        t1.start();
        t2.start();

    }
    public void run() {
        synchronized (this) {
            if (Thread.currentThread().getName().equals("OddThread")) {
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println(i);
                }
            } else {
                for (int i = 2; i <= 10; i += 2) {
                    System.out.println(i);
                }
            }
        }
    }
}