package observer;

import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

interface IObjetos {
    void notificar();
}

public class Observer<T extends IObjetos> {
    /*
     * Observer:
     *  - É um objeto que mantem uma lista de dependentes de modo que possa notificar a todos acerca de um evento.
     */
    List<T> objetos;

    public Observer(List<T> objetos) {
        this.objetos = objetos;
    }

    public void notificarTodos() {
        for (T objeto : objetos) {
            objeto.notificar();
        }
    }

    public List<T> getObjetos() {
        return objetos;
    }

    public void setObjetos(List<T> objetos) {
        this.objetos = objetos;
    }
}



class Objeto implements IObjetos {
    private String id;
    private Consumer<String> handler;

    public Objeto(Consumer<String> handler) {
        id = UUID.randomUUID().toString();
        this.handler = handler;
    }

    public void notificar() {
        handler.accept(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Consumer<String> getHandler() {
        return handler;
    }

    public void setHandler(Consumer<String> handler) {
        this.handler = handler;
    }
}

class Test {
    public static void main(String[] args) {
        Consumer<String> handler = (String id) -> { System.out.println("Objeto " + id + " recebeu o evento."); };
        
        Objeto obj1 = new Objeto(handler);
        Objeto obj2 = new Objeto(handler);

        List<Objeto> listaObjetos = new ArrayList<>(Arrays.asList(obj1, obj2));
        Observer<Objeto> observer = new Observer<>(listaObjetos);

        observer.notificarTodos();
    }
}