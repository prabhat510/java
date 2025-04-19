import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
    AtomicInteger counter = new AtomicInteger(0);

    void incrementCounter() {
        counter.getAndIncrement();
    }

    AtomicInteger getCounter() {
        return counter;
    }
}
