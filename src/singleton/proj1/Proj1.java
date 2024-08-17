package singleton.proj1;

public class Proj1 {
    public static void main(String... args) {
        DatabaseInterface dbCon = new SqlServer("localhost:4041/test");
        DatabaseInterface dbCon2 = new SqlServer("localhost:4041/test2");
        Orm orm1 = Orm.getInstance(dbCon);
        Orm orm2 = Orm.getInstance(dbCon2);
        System.out.println(((SqlServer) orm1.getConnection()).getUrl());
        System.out.println(((SqlServer) orm2.getConnection()).getUrl());
    }
}
