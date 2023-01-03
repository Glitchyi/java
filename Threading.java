package Labs;
//multithreading in java print 0 to 10 with sleep 1000
public class Threading extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Threading t1 = new Threading();
        t1.start();
    }
}
