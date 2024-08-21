package mvc;

import java.util.UUID;
import java.util.HashMap;
import java.util.Map;

class Produto {
    private String id;
    private String nome;
    private float preco;

    public Produto(String nome, float preco) {
        id = UUID.randomUUID().toString();
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nPreço: " + preco;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }
}

class Modelo {
    private Map<String, Produto> produtos;

    public Modelo(Map<String, Produto> produtos) {
        this.produtos = produtos;
    }

    public Map<String, Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Map<String, Produto> produtos) {
        this.produtos = produtos;
    }
}

class Controlador {
    private Modelo modelo;

    public Controlador(Modelo modelo) {
        this.modelo = modelo;
    }

    public Map<String, Produto> listarProdutos() {
        return modelo.getProdutos();
    }
}

class View {
    private Controlador controlador;

    public View(Controlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarProdutos() {
        System.out.println("---------Produtos---------");
        for (String key : controlador.listarProdutos().keySet()) {
            System.out.println(controlador.listarProdutos().get(key));
            System.out.println();
        }
    }
}

public class MVC {
    /*
     * MVC:
     *  - É dividido em Model View Controller;
     *  - O model representa os dados e a lógica de negócios(como a informação é armazenada e consultada);
     *  - A view é a representação dos dados;
     *  - O controller une os dois;
     */
    public static void main(String[] args) {
        Map<String, Produto> produtos = new HashMap<>();
        produtos.put("ps5", new Produto("Playstation 5", 5000));
        produtos.put("xbox", new Produto("Xbox 360", 1500));

        Modelo model = new Modelo(produtos);
        Controlador controller = new Controlador(model);
        View view = new View(controller);
        view.mostrarProdutos();
    }
}
