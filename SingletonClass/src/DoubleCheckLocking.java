public class DoubleCheckLocking {
//    volatile helps to avoid memory issues like sometimes even after instance creation it may
//    not be updated in the memory because of this it can get created more than once
// when we use volatile on an object it always looks into the memory and not the cache
    private static volatile DoubleCheckLocking dbConnection;

    private DoubleCheckLocking() {

    }
//    this is called double-checking since we check for object value twice before creating the instance,
//    this is a more efficient thread-safe approach of handling singleton connections
     public static DoubleCheckLocking getInstance() {
        if(dbConnection == null) {
            synchronized (DoubleCheckLocking.class) {
                if(dbConnection == null) {
                    dbConnection =  new DoubleCheckLocking();
                }
            }
        }
        return dbConnection;
    }
}
