package singleton.proj2;

import java.util.ArrayList;
import java.util.Arrays;

public class Proj2 {
    public static void main(String[] args) {
        Devops d1 = Devops.getInstance(
            new ArrayList<Server>(
                Arrays.asList(new Server(), new Server())
            )
        );
        Devops d2 = Devops.getInstance();
        for (Server server : d2.getServerList()) {
            System.out.println(server.getId());
        }

        for (Server server : d1.getServerList()) {
            System.out.println(server.getId());
        }
    }
}
