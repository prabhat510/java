import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    int size;
    Queue<Integer>sharedBuffer;
    SharedResource(int size) {
        this.size = size;
        this.sharedBuffer = new LinkedList<>();
    }
    synchronized void Produce(int item) {
        while(this.sharedBuffer.size() == size) {
            try {
                System.out.println("Buffer is full, Producer is waiting for consumer");
                wait();
            } catch (Exception e) {
                // handle exception
            }
        }
        sharedBuffer.add(item);
        System.out.println("Produced Item: " + item);
        // notify the consumer that there are items to consume now
        notify();
    }
    synchronized int Consume() {
        while (sharedBuffer.size() == 0) {
            System.out.println("Buffer is empty, consumer is waiting for Producer");
            try {
                wait();
            } catch (Exception e) {
            //handle exception
            }
        }
        int item = sharedBuffer.poll();
        System.out.println("Consumed item:" + item);
        notify();
        return item;
    }
}


