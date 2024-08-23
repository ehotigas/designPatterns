package state.proj1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class EstadoComputador {
    // State
    private String nome;
    private List<String> permitido;

    public EstadoComputador(String nome, List<String> permitido) {
        this.nome = nome;
        this.permitido = permitido;
    }
    
    public final boolean mudar(EstadoComputador estadoComputador) {
        return permitido.contains(estadoComputador.getNome());
    }

    public String getNome() {
        return nome;
    }

    public List<String> getPermitido() {
        return permitido;
    }
}

class Ligar extends EstadoComputador {
    // State Concreto
    public Ligar() {
        super(
            "Ligar",
            new ArrayList<>(Arrays.asList("Desligar", "Hibernar", "Suspender"))
        );
    }
}

class Desligar extends EstadoComputador {
    public Desligar() {
        super(
            "Desligar",
            new ArrayList<>(Arrays.asList("Ligar"))
        );
    }
}

class Hibernar extends EstadoComputador {
    public Hibernar() {
        super(
            "Hibernar",
            new ArrayList<>(Arrays.asList("Ligar"))
        );
    }
}

class Suspender extends EstadoComputador {
    public Suspender() {
        super(
            "Suspender",
            new ArrayList<>(Arrays.asList("Ligar"))
        );
    }
}


class Computador {
    // Context
    private EstadoComputador estado;
    private String modelo;

    public Computador(String modelo) {
        this.modelo = modelo;
        estado = new Desligar();
    }

    public void alterar(EstadoComputador other) {
        if (estado.mudar(other)) {
            System.out.println("Estado alterado de " + estado.getNome() + " para " + other.getNome());
            estado = other;
            return;
        }
        System.out.println("Esstado não foi alterado");
    }

    public EstadoComputador getEstado() {
        return estado;
    }

    public String getModelo() {
        return modelo;
    }
}

public class Proj1 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell");
        computador.alterar(new Ligar());
        computador.alterar(new Suspender());
        computador.alterar(new Desligar());
    }
}
