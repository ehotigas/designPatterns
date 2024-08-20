package command.proj3.invoker;

import java.util.ArrayList;
import java.util.List;

public class ControleRemotoMemento {
    private List<List<String>> estado;

    public ControleRemotoMemento() {
        estado = new ArrayList<>();
        estado.add(new ArrayList<>());
    }

    public void add(String key) {
        List<String> ultimaLista = estado.get(estado.size() - 1);
        List<String> novoEstado = new ArrayList<>(ultimaLista);
        novoEstado.add(key);
        estado.add(novoEstado);
    }

    public List<String> undo() {
        if (estado.size() > 1) {
            estado.remove(estado.size() - 1);
            return estado.get(estado.size() - 1);
        }
        return null;
    }
}
