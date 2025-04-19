public class Main {
    public static void main(String[] args) {
        EagerInitializationDBConnection eagerInitializedSingletonClass = EagerInitializationDBConnection.getInstance();
        LazyInitilizationDBConnection lazilyInitializedSingletonClass = LazyInitilizationDBConnection.getInstance();
    }
}