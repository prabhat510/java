public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Generic<Integer, Integer> pair = new Generic<>();
        pair.put(1,3);
        Car car = new Car();
        car.getCar(pair);
    }
}