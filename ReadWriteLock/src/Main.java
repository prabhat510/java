import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        SharedResource sharedResource = new SharedResource();
        Thread th1 = new Thread(()->{
            sharedResource.produce(readWriteLock);
        });

        Thread th2 = new Thread(()->{
            sharedResource.produce(readWriteLock);
        });
        SharedResource sharedResource1 = new SharedResource();
        Thread th3 = new Thread(()->{
            sharedResource1.consume(readWriteLock);
        });
        th1.start();
        th2.start();
        th3.start();
    }
}