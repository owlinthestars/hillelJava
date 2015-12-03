package multithreading;

/**
 * Created by MFarsikov on 30.11.2015.
 */
public class MultithreadingMain {
    public static void main(String[] args) {
        Thread otherThread = new Thread(() -> {
            System.out.println("other thread begin");

            /*try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("other thread is interrupted");
            }*/
//! Thread.currentThread().isInterrupted()
            while (!Thread.currentThread().isInterrupted()) {
                //account1 --;
                //account2 ++;
            }

            System.out.println("other thread end");

        });
        //thread.setDaemon(true);
        otherThread.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }

        otherThread.interrupt();

        try {
            otherThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread end");
    }
}