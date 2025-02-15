// The class needs to implement Runnable interface.
class Gama implements Runnable {
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class GamaRay implements Runnable {
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("Hello");
            try {
                // sleep() - is being used to wait for a while.
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        Runnable gama = new Gama();
        Runnable gamaray = new GamaRay();
        // Runnable interface will not have thread methods.
        // Because of that we have to create a separate thread object.
        Thread thread = new Thread(gama);
        Thread thread1 = new Thread(gamaray);

        thread.start();
        thread1.start();
    }
}
