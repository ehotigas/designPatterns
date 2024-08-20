package command.proj3.invoker;

import command.proj3.command.ICommand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ControleRemoto {
    private Map<String, ICommand> map;
    private ControleRemotoMemento memento;

    public ControleRemoto(Map<String, ICommand> map) {
        this.map = map;
        this.memento = new ControleRemotoMemento();
    }

    public ControleRemoto() {
        this(new HashMap<>());
    }

    @Override
    public String toString() {
        String string = "";
        for (String key : map.keySet()) {
            string += key + "\n";
        }
        return string;
    }

    public void add(String button, ICommand command) {
        memento.add(button);
        map.put(button, command);
    }

    public void press(String button) {
        ICommand command = map.get(button);
        if (command == null) {
            throw new ButtonNotFoundException("Este botão não foi mapeado. Tente utilizar o método add() primeiro.");
        }
        command.executar();
    }

    public void undo() {
        List<String> keys = memento.undo();
        List<String> mapKeySet = new ArrayList<>(map.keySet());
        for (String key : mapKeySet) {
            if (!keys.contains(key)) {
                map.remove(key);
            }
        }
    }
}
