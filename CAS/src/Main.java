public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();
        Thread th1 = new Thread(()->{
            for (int i=0; i<200; i++) {
                resource.incrementCounter();
            }
        });

        Thread th2 = new Thread(()->{
            for (int i=0; i<200; i++) {
                resource.incrementCounter();
            }
        });
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println(resource.getCounter());
        System.out.println("Hello world!");
    }
}