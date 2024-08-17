import java.util.UUID;

public class App {
    public static void main(String[] args) throws Exception {
        String id = UUID.randomUUID().toString();
        System.out.println("id: " + id);
    }
}
