import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable = false;
    void produce(ReadWriteLock lock) {
        try {
            lock.readLock().lock();
            System.out.println("read lock acquired by" + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(8000);
        } catch (Exception e) {

        } finally {
            lock.readLock().unlock();
            System.out.println("read lock released by" + Thread.currentThread().getName());
        }
    }
    void consume(ReadWriteLock lock) {
        try {
            lock.writeLock().lock();
            System.out.println("write lock acquired by" + Thread.currentThread().getName());
            isAvailable = false;
        } catch (Exception e) {

        } finally {
            lock.writeLock().unlock();
            System.out.println("write lock released by" + Thread.currentThread().getName());
        }
    }
}
