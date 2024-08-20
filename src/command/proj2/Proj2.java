package command.proj2;

import java.util.ArrayList;
import java.util.List;

// Interface Command
interface Ordem {
    void executar();
}

// Command Concreto
class OrdemCompra implements Ordem {
    private Acao acao;
    
    public OrdemCompra(Acao acao) {
        this.acao = acao;
    }

    @Override
    public void executar() {
        acao.comprar();
    }
}

class OrdemVenda implements Ordem {
    private Acao acao;
    
    public OrdemVenda(Acao acao) {
        this.acao = acao;
    }

    @Override
    public void executar() {
        acao.vender();
    }
}


// Receiver
class Acao {
    public void comprar() {
        System.out.println("Você comprou uma ação.");
    }

    public void vender() {
        System.out.println("Você vendeu uma ação.");
    }
}


// Invoker
class Agente {
    private List<Ordem> fila;
    public Agente(List<Ordem> fila) {
        this.fila = fila;
    }

    public void adicionar(Ordem ordem) {
        fila.add(ordem);
        ordem.executar();
    }
}

public class Proj2 {
    public static void main(String[] args) {
        Acao acao = new Acao();
        OrdemCompra ordemCompra = new OrdemCompra(acao);
        OrdemVenda ordemVenda = new OrdemVenda(acao);

        Agente agente = new Agente(new ArrayList<>());
        agente.adicionar(ordemCompra);
        agente.adicionar(ordemVenda);
    }
}
