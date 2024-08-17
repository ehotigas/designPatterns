package singleton;

public class Singleton {
    /*
     * O padrão proporciona uma forma de ter uma única instancia do objeto.
    */
    private static Singleton instance = null;
    private Singleton() {

    }

    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
