// The class needs to extend with Thread.
// Every thread it is compulsory to have a run method - run().
class Alpha extends Thread {
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

class Beta extends Thread {
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        Alpha myAlpha = new Alpha();
        Beta myBeta = new Beta();
        // To start a new thread we need to have start method - start()
        myAlpha.start();
        myBeta.start();
    }
}
