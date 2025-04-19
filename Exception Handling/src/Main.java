public class Main {
    public static void main(String[] args) {
        try {
            method();
        } catch(ClassNotFoundException e) {
            System.out.println("some exception");
        }
    }
    public static void method() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}

