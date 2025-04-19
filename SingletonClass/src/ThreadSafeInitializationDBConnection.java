public class ThreadSafeInitializationDBConnection {
    private static ThreadSafeInitializationDBConnection dbConnection;

    private ThreadSafeInitializationDBConnection() {

    }

// synchronized will take care of lock/unlock everytime when a thread try to access getInstance at the same
// time, this is not efficient since we put the lock too many times
    synchronized public static ThreadSafeInitializationDBConnection getInstance() {
        if(dbConnection == null) {
            dbConnection =  new ThreadSafeInitializationDBConnection();
        }
        return dbConnection;
    }

}
