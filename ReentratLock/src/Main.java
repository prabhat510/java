import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        SharedResource sharedResource1 = new SharedResource();
        Thread th1 = new Thread(()->{
           sharedResource1.produce(reentrantLock);
        });

        SharedResource sharedResource2 = new SharedResource();
        Thread th2 = new Thread(()->{
            sharedResource2.produce(reentrantLock);
        });
        th1.start();
        th2.start();
    }
}