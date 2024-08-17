package singleton.proj1;

public class SqlServer implements DatabaseInterface {
    private String url;
    
    public SqlServer(String url) {
        this.url = url;
    }

    public void execute(String query) {
        System.out.println("running: " + query);
    }

    public String getUrl() {
        return this.url;
    }
}
