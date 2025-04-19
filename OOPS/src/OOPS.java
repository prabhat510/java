class DBConnection {
    private static DBConnection connection;
    private DBConnection() {
      System.out.println("initiating connection");
    }

  public static DBConnection getInstance() {
       if(connection == null) {
           synchronized(DBConnection.class) {

           }
       }
    return connection;
  }
}
