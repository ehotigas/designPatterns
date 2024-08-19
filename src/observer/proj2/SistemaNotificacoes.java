package observer.proj2;

import java.util.Map;

public class SistemaNotificacoes {
    private Map<String, Categoria> map;

    public SistemaNotificacoes(Map<String, Categoria> map) {
        this.map = map;
    }

    public void adicionarCategoria(String nome, Categoria categoria) {
        map.put(nome, categoria);
    }

    public void adicionarUsuario(String categoria, User user) {
        map.get(categoria).adicionarUsuario(user);
    }

    public boolean removerUsuario(String categoria, User user) {
        return map.get(categoria).removerUsuario(user);
    }

    public void publicarNoticia(String categoria, Noticia noticia) {
        map.get(categoria).publicarNoticia(noticia);
    }
}
