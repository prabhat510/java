public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(3);
        Thread producerThread = new Thread(()->{
           for(int i=1; i<=6; i++) {
               sharedResource.Produce(i);
           }
        });
        Thread consumerThread = new Thread(()->{
            for(int i=1; i<=6; i++) {
                sharedResource.Consume();
            }
        });
        producerThread.start();
        consumerThread.start();
    }
}