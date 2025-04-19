public class LazyInitilizationDBConnection {

    private static LazyInitilizationDBConnection dbConnection;

    private LazyInitilizationDBConnection() {

    }

    public static LazyInitilizationDBConnection getInstance() {
        if(dbConnection == null) {
            dbConnection =  new LazyInitilizationDBConnection();
        }
        return dbConnection;
    }
}
