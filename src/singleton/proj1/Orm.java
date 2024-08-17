package singleton.proj1;

public class Orm {
    private DatabaseInterface connection = null;
    private static Orm instance = null;
    
    private Orm(DatabaseInterface connection) {
        this.connection = connection;
    }

    public static Orm getInstance(DatabaseInterface connection) {
        if (instance == null) {
            instance = new Orm(connection);
        }
        return instance;
    }

    public void execute(String query) {
        this.connection.execute(query);
    }

    public DatabaseInterface getConnection() {
        return this.connection;
    }
}
