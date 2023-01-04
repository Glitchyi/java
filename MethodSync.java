public class MethodSync extends Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MethodSync(), "OddThread");
        Thread t2 = new Thread(new MethodSync(), "EvenThread");
        t1.start();
        t2.start();

    }
    synchronized public void run() {
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
