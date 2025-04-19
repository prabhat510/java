public class EagerInitializationDBConnection {
    private static EagerInitializationDBConnection dbConnection = new EagerInitializationDBConnection();

     private EagerInitializationDBConnection() {

    }
    public static EagerInitializationDBConnection getInstance() {
        return dbConnection;
    }
}
