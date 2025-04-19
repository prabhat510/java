import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;
    void produce(ReentrantLock reentrantLock) {
        try {
            reentrantLock.lock();
            System.out.println("lock acquired by: "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e) {
            //
        } finally {
            reentrantLock.unlock();
            System.out.println("lock released by: "+ Thread.currentThread().getName());
        }
    }
}
