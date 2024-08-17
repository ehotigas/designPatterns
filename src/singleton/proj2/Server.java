package singleton.proj2;

import java.util.UUID;

public class Server {
    private String id;
    public Server() {
        id = UUID.randomUUID().toString();
    }

    public boolean check() {
        return true;
    }

    public String getId() {
        return id;
    }
}
