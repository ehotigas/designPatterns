package singleton.proj2;

import java.util.ArrayList;
import java.util.List;

public class Devops {
    private List<Server> serverList;
    private static Devops instance = null;

    private Devops(List<Server> serverList) {
        this.serverList = serverList;
    }

    public synchronized static Devops getInstance() {
        if (instance == null) {
            instance = new Devops(new ArrayList<>());
        }
        return instance;
    }

    public synchronized static Devops getInstance(List<Server> serverList) {
        if (instance == null) {
            instance = new Devops(serverList);
        }
        return instance;
    }

    public List<Server> getServerList() {
        return serverList;
    }

    public void setServerList(List<Server> serverList) {
        this.serverList = serverList;
    }
}
