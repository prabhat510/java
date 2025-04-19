//there are 2 ways to create threads: using Runnable interface(preferred method) and extending
// Thread class(here we override the run method)
//A class can implement more than interface but a class can extend only one class

public class Main {
    public static void main(String args[]) {
        System.out.println("start");
        LearningMultiThreading learningMultiThreading = new LearningMultiThreading();
        Thread thread = new Thread(learningMultiThreading);
        thread.start();
        System.out.println("finish");
    }
}
