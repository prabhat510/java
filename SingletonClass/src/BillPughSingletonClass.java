public class BillPughSingletonClass {

    private BillPughSingletonClass() {

    }
// Here the idea is that nested classes are not loaded into the memory until they are explicitly
// called using their class names, this helps overcome the shortcomings of eager initialization that we had before


    private static class DBConnectionHelper {
        private static final BillPughSingletonClass dbConnection = new BillPughSingletonClass();
    }

    public BillPughSingletonClass getInstance() {
        return DBConnectionHelper.dbConnection;
    }


}
